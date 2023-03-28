package com.example.usersdirectory.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

public class Dog {

    private Integer dogId;
    private String dogName;


    private User user;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogId, dog.dogId) && Objects.equals(dogName, dog.dogName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogId, dogName);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                '}';
    }
}
