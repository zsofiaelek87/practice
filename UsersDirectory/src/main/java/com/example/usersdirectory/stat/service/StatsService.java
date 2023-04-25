package com.example.usersdirectory.stat.service;

import com.example.usersdirectory.dog.service.Dog;
import com.example.usersdirectory.dog.mapper.DogMapper;
import com.example.usersdirectory.dog.repository.DogEntity;
import com.example.usersdirectory.dog.repository.DogRepository;
import com.example.usersdirectory.user.repository.UserEntity;
import com.example.usersdirectory.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StatsService {

    private final UserRepository userRepository;
    private final DogRepository dogRepository;

    private final DogMapper dogMapper;
    @Autowired
    public StatsService(UserRepository userRepository, DogRepository dogRepository, DogMapper dogMapper) {
        this.userRepository = userRepository;
        this.dogRepository = dogRepository;
        this.dogMapper = dogMapper;
    }

    public Map<String, Integer> getNumberOfDogByUserName(){
        return dogRepository.findAll().stream()
                .collect(Collectors.toMap(
                        dogEntity -> dogEntity.getUserEntity().getUserName(),
                        dogEntity -> 1,
                        (value1, value2) -> value1+value2));
    }


    public Dog getOldestDogByUser(Integer userId){

        UserEntity userEntity = userRepository.getReferenceById(userId);
        DogEntity oldestDog = userEntity.getDogs()
                .stream()
                .max((a,b)-> b.getDogAge()-a.getDogAge())
                .orElseThrow(()-> new IllegalArgumentException("Missing dog"));

        return dogMapper.convertEntityToModel(oldestDog);
    }
}
