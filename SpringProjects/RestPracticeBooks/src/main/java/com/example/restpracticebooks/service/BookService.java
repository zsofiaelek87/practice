package com.example.restpracticebooks.service;

import com.example.restpracticebooks.mapper.BookMapper;
import com.example.restpracticebooks.repository.entity.BookEntity;
import com.example.restpracticebooks.service.model.Book;
import com.example.restpracticebooks.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public List<Book> getAllBooks(){

        List<BookEntity> bookEntities = bookRepository.findAll();

        return bookEntities.stream()
                .map(b -> bookMapper.convertEntityToModel(b))
                .collect(Collectors.toList());
    }

    public Book getBookById(Integer bookId){

        return null;
    }

    public void deleteBookById(Integer bookId){

    }

    public Book saveOrUpdate(Book book) {
        return null;
    }
}
