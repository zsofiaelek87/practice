package com.fruitshop.service;

import com.fruitshop.client.FruitClient;
import com.fruitshop.client.StockClient;
import com.fruitshop.client.dto.FruitIdResponse;
import com.fruitshop.client.dto.FruitPriceResponse;
import com.fruitshop.client.dto.ShopStockResponse;
import com.fruitshop.controller.dto.AggregatedFruitResponse;
import com.fruitshop.repository.document.AggregatedFruitDocument;
import com.fruitshop.repository.FruitHistoryRepository;
import com.fruitshop.service.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class FruitService {

    private final FruitClient fruitClient;
    private final StockClient stockClient;

    private final FruitHistoryRepository fruitHistoryRepository;
    @Autowired
    public FruitService(FruitClient fruitClient, StockClient stockClient, FruitHistoryRepository fruitHistoryRepository) {
        this.fruitClient = fruitClient;
        this.stockClient = stockClient;
        this.fruitHistoryRepository = fruitHistoryRepository;
    }

    public AggregatedFruitResponse getAllFruitDetails(String name){
        ResponseEntity<FruitIdResponse> fruitIdResponse = fruitClient.getFruitIdByName(name);
        handleUnsuccessfulResponseEntity(fruitIdResponse,"FruitService Unavailable");
        FruitIdResponse fruitId = fruitIdResponse.getBody();

        ResponseEntity<List<ShopStockResponse>> stockResponse = stockClient.getStockByFruitId(fruitId.getId());
        handleUnsuccessfulResponseEntity(stockResponse,"StockService Unavailable" );
        List<ShopStockResponse> stockShopList =  stockResponse.getBody();

        ResponseEntity<FruitPriceResponse> fruitPriceResponse = fruitClient.getFruitPriceById(fruitId.getId());
        handleUnsuccessfulResponseEntity(fruitPriceResponse,"FruitService Unavailable");
        FruitPriceResponse fruitPrice = fruitPriceResponse.getBody();

        AggregatedFruitResponse result = constructAggregatedFruitResponse(fruitId, stockShopList, name, fruitPrice);
        saveAggregatedFruitResponse(result);
        return result;
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

    private void saveAggregatedFruitResponse(AggregatedFruitResponse aggregatedFruitResponse){
        AggregatedFruitDocument document = new AggregatedFruitDocument();
        document.setId(UUID.randomUUID());
        document.setFruitId(aggregatedFruitResponse.getId());
        document.setName(aggregatedFruitResponse.getName());
        document.setPrice(aggregatedFruitResponse.getPrice());
        document.setCurrency(aggregatedFruitResponse.getCurrency());
        document.setAvailableAt(aggregatedFruitResponse.getAvailableAt());

        fruitHistoryRepository.save(document);
    }

    private void handleUnsuccessfulResponseEntity(ResponseEntity<?> responseEntity, String message){
        if(!responseEntity.getStatusCode().is2xxSuccessful()){
            throw new IllegalArgumentException(message);
        }
    }
}
