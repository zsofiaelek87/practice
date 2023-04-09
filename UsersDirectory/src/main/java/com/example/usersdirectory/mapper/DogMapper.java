package com.example.usersdirectory.mapper;

import com.example.usersdirectory.controller.DogDTO;
import com.example.usersdirectory.repository.DogEntity;
import com.example.usersdirectory.service.Dog;
import org.springframework.stereotype.Component;
@Component
public class DogMapper {

    public Dog convertEntityToModel(DogEntity dogEntity){
        Dog dog = new Dog();
        dog.setDogId(dogEntity.getDogId());
        dog.setDogName(dogEntity.getDogName());
        dog.setOwnerName(dogEntity.getUserEntity().getUserName());
        return dog;
    }

    public DogDTO convertModelToDTO(Dog dog){
        DogDTO dogDTO = new DogDTO();
        dogDTO.setDogId(dog.getDogId());
        dogDTO.setDogName(dog.getDogName());
        dogDTO.setOwnerName(dog.getOwnerName());
        return dogDTO;
    }

    public Dog convertDTOToModel(DogDTO dogDTO){
        Dog dog = new Dog();
        dog.setDogId(dogDTO.getDogId());
        dog.setDogName(dogDTO.getDogName());
        dog.setOwnerName(dogDTO.getOwnerName());
        return dog;
    }

    public DogEntity convertModelToEntity(Dog dog){
        DogEntity dogEntity = new DogEntity();
        dogEntity.setDogId(dog.getDogId());
        dogEntity.setDogName(dog.getDogName());
        //TODO: fix it
        return dogEntity;
}
}
