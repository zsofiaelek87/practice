package com.fruitshop.controller;

import com.fruitshop.service.FruitService;
import com.fruitshop.controller.dto.AggregatedFruitResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @Operation(summary = "Get Fruit Stock Information in Shop Ids by Name")
    @ApiResponse(
            responseCode = "200",
            description = "Request successfully completed, Fruit Aggregated Response properly constructed"
    )
    @ApiResponse(
            responseCode = "400",
            description = "Client request validation failed e.g. missing property")
    @ApiResponse(
            responseCode = "404",
            description = "The requested resource is not found")
    @ApiResponse(
            responseCode = "500",
            description = "Server error of unhandled condition, please see the server logs in this case")
    @GetMapping("/fruits/{name}")
    public ResponseEntity<AggregatedFruitResponse> getFruitInfo(@PathVariable("name") String name) {
        AggregatedFruitResponse result = fruitService.getAllFruitDetails(name);
        return ResponseEntity.ok(result);
    }

}
