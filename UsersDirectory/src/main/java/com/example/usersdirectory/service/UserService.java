package com.example.usersdirectory.service;

import com.example.usersdirectory.mapper.DogMapper;
import com.example.usersdirectory.mapper.UserMapper;
import com.example.usersdirectory.repository.DogEntity;
import com.example.usersdirectory.repository.UserEntity;
import com.example.usersdirectory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    UserMapper userMapper;
    UserRepository userRepository;

    DogMapper dogMapper;



    @Autowired
    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream()
                .map(user -> userMapper.convertEntityToModel(user))
                .collect(Collectors.toList());
    }

    public User getUserById(Integer userId){
        UserEntity userEntity = userRepository.getReferenceById(userId);
        return userMapper.convertEntityToModel(userEntity);

    }

    public User createUser(User user){
        if(user.getUserId()!=null){
            throw new IllegalArgumentException("User ID must be empty");
        }
        UserEntity userEntity = userMapper.convertModelToEntity(user);
        UserEntity userEntitySaved = userRepository.save(userEntity);
        return userMapper.convertEntityToModel(userEntitySaved);
    }

    public User createDog(Integer userId, Dog dog){
        Optional<UserEntity> userEntityOptional = userRepository.findById(userId);
        if (userEntityOptional.isEmpty()){
            throw new IllegalArgumentException("User not found in database by id= "+userId);
        }
        UserEntity userEntity = userEntityOptional.get();
        DogEntity dogEntity = dogMapper.convertModelToEntity(dog);
        userEntity.addDogEntity(dogEntity);
        return userMapper.convertEntityToModel(userRepository.save(userEntity));
    }

    public User updateUserById(User user){
        if(user.getUserId()==null){
            throw new IllegalArgumentException("User ID must be provided");
        }
        UserEntity userEntity = userMapper.convertModelToEntity(user);
        userEntity.setUserId(user.getUserId());
        UserEntity userEntityUpdated = userRepository.save(userEntity);
        return userMapper.convertEntityToModel(userEntityUpdated);
    }

    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

    public void deleteUserById(Integer userId){
        userRepository.deleteById(userId);
    }

    public long countUsers(){
        return userRepository.count();
    }

}