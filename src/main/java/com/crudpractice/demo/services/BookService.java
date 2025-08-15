package com.crudpractice.demo.services;

import com.crudpractice.demo.models.Book;
import java.util.List;
import java.util.Optional;

public interface BookService{
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Book createBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Integer id);
}
