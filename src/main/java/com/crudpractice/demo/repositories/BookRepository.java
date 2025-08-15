package com.crudpractice.demo.repositories;

import com.crudpractice.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// Book, Long are arguments here because primary key in this entity is of type Long
public interface BookRepository extends JpaRepository<Book,Long> {
}