package com.example.usersdirectory.mapper;

import com.example.usersdirectory.controller.UserDTO;
import com.example.usersdirectory.repository.UserEntity;
import com.example.usersdirectory.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UserMapper {

    private final DogMapper dogMapper;

    @Autowired
    public UserMapper(DogMapper dogMapper) {
        this.dogMapper = dogMapper;
    }

    public User convertEntityToModel(UserEntity userEntity){
       User user = new User();
       user.setUserId(userEntity.getUserId());
       user.setUserName(userEntity.getUserName());
       user.setUserEmail(userEntity.getUserEmail());
       user.setUserNickname(userEntity.getUserNickname());
       user.setDogs(userEntity.getDogs().stream().map(d-> dogMapper.convertEntityToModel(d)).collect(Collectors.toList()));
       return user;
    }

    public UserDTO convertModelToDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUser(user);
        return userDTO;
    }

    public User convertDTOToModel(UserDTO userDTO){
        return userDTO.getUser();
    }

    public UserEntity convertModelToEntity(User user){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(user.getUserId());
        userEntity.setUserName(user.getUserName());
        userEntity.setUserEmail(user.getUserEmail());
        userEntity.setUserNickname(user.getUserNickname());
        user.getDogs().stream().map(d-> dogMapper.convertModelToEntity(d)).forEach(d-> userEntity.addDogEntity(d));
        return userEntity;
    }

}