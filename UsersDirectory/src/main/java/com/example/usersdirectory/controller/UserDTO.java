package com.example.usersdirectory.controller;

import com.example.usersdirectory.service.User;

import java.util.List;
import java.util.Objects;

public class UserDTO {
    private User user;

    private List<DogDTO> dogs;
    public UserDTO(User user) {
        this.user = user;
    }

    public UserDTO() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(user, userDTO.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "user=" + user +
                '}';
    }
}
