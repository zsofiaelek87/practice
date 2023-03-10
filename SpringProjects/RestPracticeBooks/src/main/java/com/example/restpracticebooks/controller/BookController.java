package com.example.restpracticebooks.controller;

import com.example.restpracticebooks.controller.dto.BookDTO;
import com.example.restpracticebooks.mapper.BookMapper;
import com.example.restpracticebooks.service.BookService;
import com.example.restpracticebooks.service.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<BookDTO> getAllBooks(){
        List<Book> books = bookService.getAllBooks();
        return books.stream()
                .map(b->bookMapper.convertModelToDto(b))
                .collect(Collectors.toList());
    }

    @GetMapping("/{bookid}")
    public BookDTO getBook(@PathVariable("bookid") Integer bookId){
        //return bookService.getBookById(bookId);mapperbol jon majd
        return null;
    }

    @DeleteMapping("/{bookid}")
    public void deleteBook(@PathVariable("bookid") Integer bookId){
        bookService.deleteBookById(bookId);
    }

    @PostMapping
    private BookDTO saveBook(@RequestBody BookDTO book)
    {
        // bookService.saveOrUpdate(book); le kell validalni, hogy NE legyen IDja updatenel, tehat itt generalja le ujkent
        //return book.getBookId();
       return null;
    }

    @PutMapping
    private BookDTO update(@RequestBody BookDTO book)
    {
       // bookService.saveOrUpdate(book); le kell validalni, hogy legyen IDja updatenel
       // return book;
        return null;
    }

}
