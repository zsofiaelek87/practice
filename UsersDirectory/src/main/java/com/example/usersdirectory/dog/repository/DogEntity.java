package com.example.usersdirectory.dog.repository;

import com.example.usersdirectory.user.repository.UserEntity;
import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "dogs")
public class DogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dogId;
    private String dogName;

    private Integer dogAge;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {})
    @JoinColumn(name="userId", nullable=false)
    private UserEntity userEntity;

    public DogEntity(Integer dogId, String dogName, Integer dogAge) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.dogAge = dogAge;
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

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogEntity dogEntity = (DogEntity) o;
        return Objects.equals(dogId, dogEntity.dogId) && Objects.equals(dogName, dogEntity.dogName) && Objects.equals(dogAge, dogEntity.dogAge) && Objects.equals(userEntity, dogEntity.userEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogId, dogName, dogAge, userEntity);
    }

    @Override
    public String toString() {
        return "DogEntity{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
