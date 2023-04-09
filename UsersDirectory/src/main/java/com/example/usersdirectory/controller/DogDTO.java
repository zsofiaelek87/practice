package com.example.usersdirectory.controller;

import java.util.Objects;

public class DogDTO {
    private Integer dogId;
    private String dogName;

    private String ownerName;


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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogDTO dogDTO = (DogDTO) o;
        return Objects.equals(dogId, dogDTO.dogId) && Objects.equals(dogName, dogDTO.dogName) && Objects.equals(ownerName, dogDTO.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogId, dogName, ownerName);
    }

    @Override
    public String toString() {
        return "DogDTO{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
