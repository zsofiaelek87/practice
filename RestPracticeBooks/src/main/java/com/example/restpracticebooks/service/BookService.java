package com.example.restpracticebooks.service;

import com.example.restpracticebooks.mapper.BookMapper;
import com.example.restpracticebooks.repository.entity.BookEntity;
import com.example.restpracticebooks.service.model.Book;
import com.example.restpracticebooks.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    private final BookEntityFactory bookEntityFactory;

    @Autowired
    public BookService(BookRepository bookRepository, BookMapper bookMapper, BookEntityFactory bookEntityFactory) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
        this.bookEntityFactory = bookEntityFactory;
    }

    public List<Book> getAllBooks() {

        List<BookEntity> bookEntities = bookRepository.findAll();

        return bookEntities.stream()
                .map(b -> bookMapper.convertEntityToModel(b))
                .collect(Collectors.toList());
    }

    public Book getBookById(Integer bookId) {

        BookEntity bookEntity = bookRepository.getReferenceById(bookId);
        return bookMapper.convertEntityToModel(bookEntity);
    }

    public void deleteBookById(Integer bookId) {
        bookRepository.deleteById(bookId);
    }

    public Book saveOrUpdate(Book book) {

        BookEntity bookEntity = bookMapper.convertModelToEntity(book);
        BookEntity savedBookEntity = bookRepository.save(bookEntity);
        return bookMapper.convertEntityToModel(savedBookEntity);

    }

    public Book patchBook(Book book) {
        Optional<BookEntity> existingBookOptional = bookRepository.findById(book.getBookId());

        if (existingBookOptional.isEmpty()) {
            throw new IllegalArgumentException("Missing book to update");
        }
        BookEntity existingBook = existingBookOptional.get();
        bookEntityFactory.updateBookEntityByBook(book, existingBook);
        BookEntity updatedBookEntity = bookRepository.save(existingBook);
        return bookMapper.convertEntityToModel(updatedBookEntity);

    }
}

