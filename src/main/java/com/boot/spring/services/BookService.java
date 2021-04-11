package com.boot.spring.services;

import com.boot.spring.models.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> fetchAllBooks();
    Optional<Book> getBook(int isbn);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(int isbn);
}
