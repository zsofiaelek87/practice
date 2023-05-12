package com.example.fruitmockservice.controller.dto;

import java.util.Objects;

public class FruitPriceResponse {
    private String id;
    private String currency;
    private String price;

    public FruitPriceResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitPriceResponse that = (FruitPriceResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(currency, that.currency) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currency, price);
    }

    @Override
    public String toString() {
        return "FruitPriceResponse{" +
                "id='" + id + '\'' +
                ", currency='" + currency + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
