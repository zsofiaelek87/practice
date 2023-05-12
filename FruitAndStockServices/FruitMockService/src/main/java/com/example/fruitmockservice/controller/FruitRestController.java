package com.example.fruitmockservice.controller;

import com.example.fruitmockservice.controller.dto.FruitIdResponse;
import com.example.fruitmockservice.controller.dto.FruitPriceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/fruits")
public class FruitRestController {

    @RequestMapping(path="/{name}", method = RequestMethod.GET, consumes = "application/json")
    ResponseEntity<FruitIdResponse> getFruitIdByName(@PathVariable(name = "name") String name){
        FruitIdResponse fruitIdResponse = new FruitIdResponse();
        fruitIdResponse.setId(UUID.randomUUID().toString());
        return ResponseEntity.ok(fruitIdResponse);
    }

    @RequestMapping(path="/{id}/price",method = RequestMethod.GET, consumes = "application/json")
    ResponseEntity<FruitPriceResponse> getFruitPriceById(@PathVariable(name = "id") String id){
        FruitPriceResponse fruitPriceResponse = new FruitPriceResponse();
        fruitPriceResponse.setId(id);
        fruitPriceResponse.setPrice("5");
        fruitPriceResponse.setCurrency("EUR");
        return ResponseEntity.ok(fruitPriceResponse);
    }
}
