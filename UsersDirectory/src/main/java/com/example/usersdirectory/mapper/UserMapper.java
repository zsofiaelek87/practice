package com.example.usersdirectory.mapper;

import com.example.usersdirectory.controller.UserDTO;
import com.example.usersdirectory.repository.UserEntity;
import com.example.usersdirectory.service.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User convertEntityToModel(UserEntity userEntity){
       User user = new User();
       user.setUserId(userEntity.getUserId());
       user.setUserName(userEntity.getUserName());
       user.setUserEmail(userEntity.getUserEmail());
       user.setUserNickname(userEntity.getUserNickname());
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
        //TODO: dogs must be mapped too with a for cycle foreach, dogmapperel
        //TODO: user dogjait atkonvertalni userentityben talalhato dogentity
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(user.getUserId());
        userEntity.setUserName(user.getUserName());
        userEntity.setUserEmail(user.getUserEmail());
        userEntity.setUserNickname(user.getUserNickname());
        return userEntity;
    }

}