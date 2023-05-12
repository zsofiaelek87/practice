package com.example.stockmockservice.controller;

import com.example.stockmockservice.controller.dto.ShopStockResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/stock")
public class StockRestController {
    @RequestMapping(path="/{fruitId}", method = RequestMethod.GET, consumes = "application/json")
    ResponseEntity<List<ShopStockResponse>> getStockByFruitId(@PathVariable(name = "fruitId") String fruitId){
        ShopStockResponse shopStockResponse = new ShopStockResponse();
        shopStockResponse.setId(UUID.randomUUID().toString());
        shopStockResponse.setStock(5L);
        List<ShopStockResponse> shopStockResponses = List.of(shopStockResponse);
        return ResponseEntity.ok(shopStockResponses);
    }
}
