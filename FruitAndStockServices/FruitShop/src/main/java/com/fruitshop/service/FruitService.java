package com.fruitshop.service;

import com.fruitshop.client.FruitClient;
import com.fruitshop.client.StockClient;
import com.fruitshop.client.dto.FruitIdResponse;
import com.fruitshop.client.dto.FruitPriceResponse;
import com.fruitshop.client.dto.ShopStockResponse;
import com.fruitshop.controller.dto.AggregatedFruitResponse;
import com.fruitshop.service.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FruitService {

    private final FruitClient fruitClient;
    private final StockClient stockClient;

    @Autowired
    public FruitService(FruitClient fruitClient, StockClient stockClient) {
        this.fruitClient = fruitClient;
        this.stockClient = stockClient;
    }
    public AggregatedFruitResponse getAllFruitDetails(String name){
        ResponseEntity<FruitIdResponse> fruitIdResponse = fruitClient.getFruitIdByName(name);
        if(!fruitIdResponse.getStatusCode().is2xxSuccessful()){
            throw new IllegalArgumentException("FruitService Unavailable");
        }
        FruitIdResponse fruitId = fruitIdResponse.getBody();

        ResponseEntity<List<ShopStockResponse>> stockResponse = stockClient.getStockByFruitId(fruitId.getId());
        if(!stockResponse.getStatusCode().is2xxSuccessful()){
            throw new IllegalArgumentException("StockService Unavailable");
        }
        List<ShopStockResponse> stockShopList =  stockResponse.getBody();

        ResponseEntity<FruitPriceResponse> fruitPriceRespone = fruitClient.getFruitPriceById(fruitId.getId());
        if(!fruitIdResponse.getStatusCode().is2xxSuccessful()){
            throw new IllegalArgumentException("FruitService Unavailable");
        }
        FruitPriceResponse fruitPrice = fruitPriceRespone.getBody();


        return constructAggregatedFruitResponse(fruitId, stockShopList, name, fruitPrice);
    }

    private AggregatedFruitResponse constructAggregatedFruitResponse(FruitIdResponse fruitId,
                                                                     List<ShopStockResponse> stockShopList,
                                                                     String name,
                                                                     FruitPriceResponse fruitPrice){
        AggregatedFruitResponse aggregatedFruitResponse = new AggregatedFruitResponse();
        aggregatedFruitResponse.setId(fruitId.getId());
        aggregatedFruitResponse.setName(name);
        aggregatedFruitResponse.setPrice(new BigDecimal(fruitPrice.getPrice()));
        aggregatedFruitResponse.setCurrency(Currency.valueOf(fruitPrice.getCurrency().toUpperCase()));
        aggregatedFruitResponse.setAvailableAt(stockShopList.stream()
                .map(stock -> stock.getId())
                .collect(Collectors.toList()));

        return aggregatedFruitResponse;
    }
}
