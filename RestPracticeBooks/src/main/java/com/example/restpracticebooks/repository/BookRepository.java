package com.example.restpracticebooks.repository;

import com.example.restpracticebooks.repository.entity.BookEntity;
import com.example.restpracticebooks.service.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
