package com.fruitshop.client;

import com.fruitshop.client.dto.FruitPriceResponse;
import com.fruitshop.client.dto.FruitIdResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="FruitService", url="http://fruitmock:8080/fruits" )
public interface FruitClient {

    @RequestMapping(path="/{name}", method = RequestMethod.GET, consumes = "application/json")
    ResponseEntity<FruitIdResponse> getFruitIdByName(@PathVariable(name = "name") String name);

    @RequestMapping(path="/{id}/price",method = RequestMethod.GET, consumes = "application/json")
    ResponseEntity<FruitPriceResponse> getFruitPriceById(@PathVariable(name = "id") String id);

}
