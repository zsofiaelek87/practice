package com.example.stockmockservice.controller.dto;

import java.util.Objects;

public class ShopStockResponse {
    private String id;
    private long stock;

    public ShopStockResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopStockResponse that = (ShopStockResponse) o;
        return stock == that.stock && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stock);
    }

    @Override
    public String toString() {
        return "ShopStockResponse{" +
                "id='" + id + '\'' +
                ", stock=" + stock +
                '}';
    }
}
