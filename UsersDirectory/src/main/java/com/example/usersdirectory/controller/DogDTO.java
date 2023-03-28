package com.example.usersdirectory.controller;

import java.util.Objects;

public class DogDTO {
    private Integer dogId;
    private String dogName;

    public DogDTO(Integer dogId, String dogName) {
        this.dogId = dogId;
        this.dogName = dogName;
    }

    public DogDTO(){

    }

    public Integer getDogId() {
        return dogId;
    }

    public void setDogId(Integer dogId) {
        this.dogId = dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogDTO dogDTO = (DogDTO) o;
        return Objects.equals(dogId, dogDTO.dogId) && Objects.equals(dogName, dogDTO.dogName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogId, dogName);
    }

    @Override
    public String toString() {
        return "DogDTO{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                '}';
    }
}
