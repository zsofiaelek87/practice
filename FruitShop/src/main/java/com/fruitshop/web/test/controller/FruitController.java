package com.fruitshop.web.test.controller;

import com.fruitshop.web.test.controller.dto.AggregatedFruitResponse;
import com.fruitshop.web.test.service.FruitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("/fruits/{name}")
    public ResponseEntity<AggregatedFruitResponse> getFruitInfo(@PathVariable("name") String name) {
        AggregatedFruitResponse result = fruitService.getAllFruitDetails(name);
        return ResponseEntity.ok(result);
    }
}
