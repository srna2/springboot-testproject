package com.crudpractice.demo.services;

import com.crudpractice.demo.models.Book;
import com.crudpractice.demo.repositories.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repo;

    public BookServiceImpl(BookRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Book createBook(Book book) {
        return repo.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return repo.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        repo.deleteById(id);
    }

}
