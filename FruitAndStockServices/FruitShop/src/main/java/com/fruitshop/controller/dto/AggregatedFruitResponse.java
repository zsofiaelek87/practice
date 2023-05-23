package com.fruitshop.controller.dto;

import com.fruitshop.service.model.Currency;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class AggregatedFruitResponse {
    private String id;
    private String name;
    private Currency currency;
    private BigDecimal price;
    private List<String> availableAt;

    public AggregatedFruitResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<String> getAvailableAt() {
        return availableAt;
    }

    public void setAvailableAt(List<String> availableAt) {
        this.availableAt = availableAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AggregatedFruitResponse that = (AggregatedFruitResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(currency, that.currency) && Objects.equals(price, that.price) && Objects.equals(availableAt, that.availableAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, currency, price, availableAt);
    }

    @Override
    public String toString() {
        return "AggregatedFruitResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", currency=" + currency +
                ", price=" + price +
                ", availableAt=" + availableAt +
                '}';
    }
}
