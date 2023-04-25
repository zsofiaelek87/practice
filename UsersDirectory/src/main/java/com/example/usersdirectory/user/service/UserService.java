package com.example.usersdirectory.user.service;

import com.example.usersdirectory.dog.service.Dog;
import com.example.usersdirectory.dog.mapper.DogMapper;
import com.example.usersdirectory.user.mapper.UserMapper;
import com.example.usersdirectory.dog.repository.DogEntity;
import com.example.usersdirectory.user.repository.UserEntity;
import com.example.usersdirectory.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    private final DogMapper dogMapper;



    @Autowired
    public UserService(UserMapper userMapper, UserRepository userRepository, DogMapper dogMapper) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
        this.dogMapper = dogMapper;
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
        dogEntity.setUserEntity(userEntity);
        logger.info("{}",userEntity);
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
