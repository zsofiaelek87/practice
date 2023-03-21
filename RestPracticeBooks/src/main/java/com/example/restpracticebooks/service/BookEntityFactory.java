package com.example.restpracticebooks.service;

import com.example.restpracticebooks.repository.entity.BookEntity;
import com.example.restpracticebooks.service.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookEntityFactory {
    public void updateBookEntityByBook(Book book, BookEntity bookEntity) {
        if (book.getBookAuthor() != null) {
            bookEntity.setBookAuthor(book.getBookAuthor());
        }

        if (book.getBookName() != null) {
            bookEntity.setBookName(book.getBookName());
        }
    }
}
