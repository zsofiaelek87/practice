package com.example.usersdirectory.repository;

import com.example.usersdirectory.service.Dog;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String userName;
    private String userEmail;
    private String userNickname;
    private final Instant createdAt = Instant.now();

    @OneToMany(mappedBy="userEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private final List<DogEntity> dogs = new ArrayList<>();

    public UserEntity(Integer userId, String userName, String userEmail, String userNickname) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userNickname = userNickname;
    }

    public UserEntity() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public List<DogEntity> getDogs() {
        return dogs;
    }

    public void addDogEntity(DogEntity dogEntity){
        dogs.add(dogEntity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(userId, that.userId) && Objects.equals(userName, that.userName) && Objects.equals(userEmail, that.userEmail) && Objects.equals(userNickname, that.userNickname) && Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userEmail, userNickname, createdAt);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", createdAt=" + createdAt +
                ", dogs=" + dogs +
                '}';
    }
}
