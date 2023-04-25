package com.example.usersdirectory.dog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<DogEntity, Integer> {
}
