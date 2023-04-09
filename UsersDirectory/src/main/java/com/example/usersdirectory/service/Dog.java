package com.example.usersdirectory.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

public class Dog {

    private Integer dogId;
    private String dogName;

    private String ownerName;

    public Dog(Integer dogId, String dogName) {
        this.dogId = dogId;
        this.dogName = dogName;
    }

    public Dog() {
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
        Dog dog = (Dog) o;
        return Objects.equals(dogId, dog.dogId) && Objects.equals(dogName, dog.dogName) && Objects.equals(ownerName, dog.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogId, dogName, ownerName);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
