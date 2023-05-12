package com.example.fruitmockservice.controller.dto;

import java.util.Objects;

public class FruitIdResponse {
    private String id;

    public FruitIdResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitIdResponse that = (FruitIdResponse) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "FruitIdResponse{" +
                "id='" + id + '\'' +
                '}';
    }
}
