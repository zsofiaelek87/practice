package com.example.usersdirectory.user.controller;


import java.util.Map;
import java.util.Objects;

public class UserWithDogDTO {

    private Map<String, Integer> numberOfDogsByUserName;

    public UserWithDogDTO(Map<String, Integer> numberOfDogsByUserName) {
        this.numberOfDogsByUserName = numberOfDogsByUserName;
    }

    public UserWithDogDTO() {
    }
    public Map<String, Integer> getNumberOfDogsByUserName() {
        return numberOfDogsByUserName;
    }

    public void setNumberOfDogsByUserName(Map<String, Integer> numberOfDogsByUserName) {
        this.numberOfDogsByUserName = numberOfDogsByUserName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserWithDogDTO that = (UserWithDogDTO) o;
        return Objects.equals(numberOfDogsByUserName, that.numberOfDogsByUserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfDogsByUserName);
    }

    @Override
    public String toString() {
        return "UserWithDogDTO{" +
                "numberOfDogsByUserName=" + numberOfDogsByUserName +
                '}';
    }
}
