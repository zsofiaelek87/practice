package com.fruitshop.web.test.client;

import com.fruitshop.web.test.client.dto.ShopStockResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="StockService", url="http://localhost:8992/stock" )
public interface StockClient {

    @RequestMapping(path="/{fruitId}", method = RequestMethod.GET, consumes = "application/json")
    ResponseEntity<List<ShopStockResponse>> getStockByFruitId(@PathVariable(name = "fruitId") String fruitId);

}
