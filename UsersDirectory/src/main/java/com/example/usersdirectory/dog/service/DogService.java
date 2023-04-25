package com.example.usersdirectory.dog.service;

import com.example.usersdirectory.dog.mapper.DogMapper;
import com.example.usersdirectory.dog.repository.DogEntity;
import com.example.usersdirectory.dog.repository.DogRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
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
        DogEntity existingDog = dogRepository.findById(dog.getDogId())
                .orElseThrow(() -> new EntityNotFoundException("Dog not found"));

        if (dog.getDogName() != null) {
            existingDog.setDogName(dog.getDogName());
        }
        if (dog.getDogAge() != null) {
            existingDog.setDogAge(dog.getDogAge());
        }

        DogEntity updatedDog = dogRepository.save(existingDog);
        return dogMapper.convertEntityToModel(updatedDog);

    }



}
