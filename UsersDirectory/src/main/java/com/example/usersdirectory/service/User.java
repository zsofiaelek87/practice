package com.example.usersdirectory.service;

import java.util.List;
import java.util.Objects;

public class User {
    private Integer userId;
    private String userName;
    private String userEmail;
    private String userNickname;

    private List<Dog> dogs;

    public User(Integer userId, String userName, String userEmail, String userNickname) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userNickname = userNickname;
    }

    public User() {
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

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(userName, user.userName) && Objects.equals(userEmail, user.userEmail) && Objects.equals(userNickname, user.userNickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userEmail, userNickname);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userNickname='" + userNickname + '\'' +
                '}';
    }
}
