package com.example.restpracticebooks.controller;

import com.example.restpracticebooks.controller.dto.BookDTO;
import com.example.restpracticebooks.mapper.BookMapper;
import com.example.restpracticebooks.service.BookService;
import com.example.restpracticebooks.service.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin
@RestController
@RequestMapping("books")

public class BookController {

    private final BookService bookService;
    private final BookMapper bookMapper;

    @Autowired
    public BookController(BookService bookService, BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    @GetMapping
    public List<BookDTO> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return books.stream()
                .map(b -> bookMapper.convertModelToDto(b))
                .collect(Collectors.toList());
    }

    @GetMapping("/{bookid}")
    public BookDTO getBook(@PathVariable("bookid") Integer bookId) {
        Book book = bookService.getBookById(bookId);
        return bookMapper.convertModelToDto(book);
    }

    @DeleteMapping("/{bookid}")
    public void deleteBook(@PathVariable("bookid") Integer bookId) {

        bookService.deleteBookById(bookId);
    }

    @PostMapping
    private BookDTO saveBook(@RequestBody BookDTO bookDTO) {
        if (bookDTO.getBook().getBookId() != null) {
            throw new IllegalArgumentException("ID must be empty to save new");
        }
        Book savedBook = bookService.saveOrUpdate(bookDTO.getBook());
        return bookMapper.convertModelToDto(savedBook);

    }

    @PutMapping
    private BookDTO update(@RequestBody BookDTO bookDTO) {
        if (bookDTO.getBook().getBookId() == null) {
            throw new IllegalArgumentException("ID must be provided to update book");
        }
        Book savedBook = bookService.saveOrUpdate(bookDTO.getBook());
        return bookMapper.convertModelToDto(savedBook);

    }


    @PatchMapping
    private BookDTO updatePatch(@RequestBody BookDTO bookDTO) {

        if (bookDTO.getBook().getBookId() == null) {
            throw new IllegalArgumentException("ID must be provided to update book");
        }




        Book patchedBook = bookService.patchBook(bookDTO.getBook());
        return bookMapper.convertModelToDto(patchedBook);

    }


}
