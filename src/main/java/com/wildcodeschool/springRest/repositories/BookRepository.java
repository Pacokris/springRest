package com.wildcodeschool.springRest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.springRest.entities.Book;

// Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // Custom query to search books with a keyword
    List<Book> findByTitleContainingOrDescriptionContaining(String keyword, String anotherkeyword);

}
