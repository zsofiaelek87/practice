package com.example.restpracticebooks.controller.dto;

import com.example.restpracticebooks.service.model.Book;

import java.util.Objects;

public class BookDTO {
    private Book book;

    public BookDTO(Book book) {
        this.book = book;
    }

    public BookDTO() {

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return Objects.equals(book, bookDTO.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book);
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "book=" + book +
                '}';
    }
}
