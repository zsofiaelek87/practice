package com.example.usersdirectory.dog.service;

import java.util.Objects;

public class Dog {

    private Integer dogId;
    private String dogName;

    private String ownerName;

    private Integer dogAge;

    public Dog(Integer dogId, String dogName, String ownerName, Integer dogAge) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.ownerName = ownerName;
        this.dogAge = dogAge;
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

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogId, dog.dogId) && Objects.equals(dogName, dog.dogName) && Objects.equals(ownerName, dog.ownerName) && Objects.equals(dogAge, dog.dogAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogId, dogName, ownerName, dogAge);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
