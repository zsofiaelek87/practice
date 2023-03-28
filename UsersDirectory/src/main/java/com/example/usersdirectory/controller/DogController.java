package com.example.usersdirectory.controller;

import com.example.usersdirectory.mapper.DogMapper;
import com.example.usersdirectory.service.Dog;
import com.example.usersdirectory.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("dogs")
public class DogController {

    private final DogMapper dogMapper;
    private final DogService dogService;

    @Autowired
    public DogController(DogMapper dogMapper, DogService dogService) {
        this.dogMapper = dogMapper;
        this.dogService = dogService;
    }

    @GetMapping
    public List<DogDTO> getAllDogs() {
        List<Dog> dogs = dogService.getAllDogs();
        return dogs.stream()
                .map(dog -> dogMapper.convertModelToDTO(dog))
                .collect(Collectors.toList());
    }

    @GetMapping("/{dogId}")
    public DogDTO getDogById(@PathVariable("dogId") Integer dogId) {
        Dog dog = dogService.getDogById(dogId);
        return dogMapper.convertModelToDTO(dog);
    }

    @PutMapping("/{dogId}")
    public DogDTO updateDogById(@PathVariable("dogId") Integer dogId, @RequestBody DogDTO dogDTO) {
        Dog dog = dogMapper.convertDTOToModel(dogDTO);
        dog.setDogId(dogId);
        dog = dogService.updateDogById(dog);
        return dogMapper.convertModelToDTO(dog);
    }


}
