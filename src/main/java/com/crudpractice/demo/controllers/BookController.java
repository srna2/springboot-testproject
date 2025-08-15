package com.crudpractice.demo.controllers;

import com.crudpractice.demo.models.Book;
import com.crudpractice.demo.repositories.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BookController {

    private final BookRepository repo;
    public BookController(BookRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Book> findAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return repo.save(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return repo.save(book);
    }

    @DeleteMapping
    public void deleteBook(@RequestBody Book book) {
        repo.delete(book);
    }

}