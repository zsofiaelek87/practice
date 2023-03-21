package com.example.restpracticebooks.repository.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "Books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;

    private String bookAuthor;

    private String bookName;

    private final Instant createdAt = Instant.now();

    public BookEntity(Integer bookId, String bookAuthor, String bookName) {
        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    public BookEntity() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return Objects.equals(bookId, that.bookId) && Objects.equals(bookAuthor, that.bookAuthor) && Objects.equals(bookName, that.bookName) && Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookAuthor, bookName, createdAt);
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
