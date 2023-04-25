package com.example.usersdirectory.dog.mapper;

import com.example.usersdirectory.dog.controller.DogDTO;
import com.example.usersdirectory.dog.repository.DogEntity;
import com.example.usersdirectory.dog.service.Dog;
import org.springframework.stereotype.Component;
@Component
public class DogMapper {

    public Dog convertEntityToModel(DogEntity dogEntity){
        Dog dog = new Dog();
        dog.setDogId(dogEntity.getDogId());
        dog.setDogName(dogEntity.getDogName());
        dog.setDogAge(dogEntity.getDogAge());
        dog.setOwnerName(dogEntity.getUserEntity().getUserName());
        return dog;
    }

    public DogDTO convertModelToDTO(Dog dog){
        DogDTO dogDTO = new DogDTO();
        dogDTO.setDogId(dog.getDogId());
        dogDTO.setDogName(dog.getDogName());
        dogDTO.setDogAge(dog.getDogAge());
        dogDTO.setOwnerName(dog.getOwnerName());
        return dogDTO;
    }

    public Dog convertDTOToModel(DogDTO dogDTO){
        Dog dog = new Dog();
        dog.setDogId(dogDTO.getDogId());
        dog.setDogName(dogDTO.getDogName());
        dog.setDogAge(dogDTO.getDogAge());
        dog.setOwnerName(dogDTO.getOwnerName());
        return dog;
    }

    public DogEntity convertModelToEntity(Dog dog){
        DogEntity dogEntity = new DogEntity();
        dogEntity.setDogId(dog.getDogId());
        dogEntity.setDogName(dog.getDogName());
        dogEntity.setDogAge(dog.getDogAge());
        //TODO: fix it
        return dogEntity;
}
}
