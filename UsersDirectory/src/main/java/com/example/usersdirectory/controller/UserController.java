package com.example.usersdirectory.controller;

import com.example.usersdirectory.mapper.DogMapper;
import com.example.usersdirectory.mapper.UserMapper;
import com.example.usersdirectory.service.Dog;
import com.example.usersdirectory.service.User;
import com.example.usersdirectory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("users")
public class UserController {

    //GET 		/users				getAllUsers
    //GET 		/users/{userId}		getUserById
    //POST 		/users				createUser
    //PUT 		/users				updateUserById
    //DELETE 	/users				deleteAllUsers
    //DELETE	/users/{userId}		deleteUserById
    //GET 		/users?action=count	countUsers
    private final UserMapper userMapper;
    private final UserService userService;

    private final DogMapper dogMapper;


    @Autowired
    public UserController(UserMapper userMapper, UserService userService, DogMapper dogMapper) {
        this.userMapper = userMapper;
        this.userService = userService;
        this.dogMapper = dogMapper;
    }

    @GetMapping
    public List<UserDTO> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users.stream()
                .map(userMapper::convertModelToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{userId}")
    public UserDTO getUserById(@PathVariable("userId") Integer userId){
        User user = userService.getUserById(userId);
        return userMapper.convertModelToDTO(user);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        User user = userMapper.convertDTOToModel(userDTO);
        User processedUser = userService.createUser(user);
        return userMapper.convertModelToDTO(processedUser);
    }

    @PutMapping
    public UserDTO updateUserById(@RequestBody UserDTO userDTO){
        User user = userMapper.convertDTOToModel(userDTO);
        User processedUser = userService.updateUserById(user);
        return userMapper.convertModelToDTO(processedUser);
    }

    @DeleteMapping
    public void deleteAllUsers(){
        userService.deleteAllUsers();
    }

    @DeleteMapping("/{userId}")
    public void deleteUserById(@PathVariable("userId") Integer userId){
        userService.deleteUserById(userId);
    }

    @GetMapping(params = "action=count")
    public Long countUsers(){
        return userService.countUsers();
    }

    @PutMapping("/{userId}/dogs")
    public UserDTO addDogToUserById(@PathVariable("userId") Integer userId, @RequestBody DogDTO dogDTO) {
        Dog dog = dogMapper.convertDTOToModel(dogDTO);
        User insertedDog = userService.createDog(userId, dog);
        return userMapper.convertModelToDTO(insertedDog);
    }




}
