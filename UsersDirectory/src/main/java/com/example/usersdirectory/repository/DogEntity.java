package com.example.usersdirectory.repository;

import com.example.usersdirectory.service.User;
import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "dogs")
public class DogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dogId;
    private String dogName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {})
    @JoinColumn(name="userId", nullable=false)
    private UserEntity userEntity;

    public DogEntity(Integer dogId, String dogName) {
        this.dogId = dogId;
        this.dogName = dogName;
    }

    public DogEntity() {
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
        DogEntity dog = (DogEntity) o;
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
