package com.boot.spring.controllers;

import com.boot.spring.models.Book;
import com.boot.spring.services.BookService;
import com.boot.spring.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;
    @GetMapping("/info")
    public List<Book> book() {
        return bookService.fetchAllBooks();
    }
    @RequestMapping("/info/{isbn}")
    public Optional<Book> findBook(@PathVariable int isbn){
        return bookService.getBook(isbn);
    }
    @PostMapping("/new_book")
    public void addBook(@RequestBody Book new_book){
        bookService.addBook(new_book);
    }
    @PostMapping("updated_book")
    public void updateBook(@RequestBody Book updated_book){
        bookService.updateBook(updated_book);
    }
    @PostMapping("/delete/{isbn}")
    public void deleteBook(@PathVariable int isbn){
        bookService.deleteBook(isbn);
    }
    @GetMapping("/guest")
    public String guest() {
        return ("<h1>Guest</h1>");
    }
}