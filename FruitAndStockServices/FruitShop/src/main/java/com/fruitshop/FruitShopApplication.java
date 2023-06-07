package com.fruitshop;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@OpenAPIDefinition(info = @Info(title = "Fruit Shop", version = "V1"))
@EnableFeignClients
@SpringBootApplication
public class FruitShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(FruitShopApplication.class, args);
    }
}
