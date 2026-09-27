package com.yudha.book.api.service;

import java.util.List;
import java.util.Optional;

import com.yudha.book.api.model.Book;

public interface BookService {
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    Book createBook(Book book);
    Book updateBook(Long id, Book bookDetails);
    void deleteBook(Long id);
}