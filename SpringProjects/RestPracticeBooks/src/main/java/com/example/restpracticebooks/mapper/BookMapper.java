package com.example.restpracticebooks.mapper;

import com.example.restpracticebooks.controller.dto.BookDTO;
import com.example.restpracticebooks.repository.BookRepository;
import com.example.restpracticebooks.repository.entity.BookEntity;
import com.example.restpracticebooks.service.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public Book convertEntityToModel(BookEntity bookEntity){
        Book book = new Book();
        book.setBookId(bookEntity.getBookId());
        book.setBookName(bookEntity.getBookName());
        book.setBookAuthor(bookEntity.getBookAuthor());
        return book;
    }

    public BookDTO convertModelToDto(Book book){
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBook(book);
        return bookDTO;
    }
}
