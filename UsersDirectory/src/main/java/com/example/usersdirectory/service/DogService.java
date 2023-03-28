package com.example.usersdirectory.service;

import com.example.usersdirectory.mapper.DogMapper;
import com.example.usersdirectory.repository.DogEntity;
import com.example.usersdirectory.repository.DogRepository;
import com.example.usersdirectory.repository.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class DogService {

    private final DogMapper dogMapper;
    private final DogRepository dogRepository;

    @Autowired
    public DogService(DogMapper dogMapper, DogRepository dogRepository) {
        this.dogMapper = dogMapper;
        this.dogRepository = dogRepository;
    }

    public List<Dog> getAllDogs() {
        List<DogEntity> dogEntities = dogRepository.findAll();
        return dogEntities.stream()
                .map(dogMapper::convertEntityToModel)
                .collect(Collectors.toList());
    }

    public Dog getDogById(Integer dogId) {
        DogEntity dogEntity = dogRepository.getReferenceById(dogId);
        return dogMapper.convertEntityToModel(dogEntity);
    }

    public Dog updateDogById(Dog dog) {
        DogEntity dogEntity = dogMapper.convertModelToEntity(dog);
        dogEntity.setDogId(dog.getDogId());
        dogRepository.save(dogEntity);
        return dog;
    }


}
