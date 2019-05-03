package com.wildcodeschool.springRest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wildcodeschool.springRest.entities.Book;
import com.wildcodeschool.springRest.repositories.BookRepository;

// Controller
@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    // Create a book
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // Find a book by id
    @GetMapping("/books/{id}")
    public Book findBook(@PathVariable int id) {
        return bookRepository.findById(id).get();
    }

    // Find books with keyword
    @PostMapping("/books/search")
    public List<Book> searchBooks(@RequestBody Map<String, String> body) {
        String keyword = body.get("keyword");
        return bookRepository.findByTitleContainingOrDescriptionContaining(keyword, keyword);
    }

    // Find all books
    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    // Update a book
    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        // Get the book to update
        Book bookToUpdate = bookRepository.findById(id).get();
        bookToUpdate.setTitle(book.getTitle());
        bookToUpdate.setAuthor(book.getAuthor());
        bookToUpdate.setDescription(book.getDescription());
        return bookRepository.save(bookToUpdate);
    }

    // Delete a book
    @DeleteMapping("books/{id}")
    public boolean deleteBook(@PathVariable int id) {
        bookRepository.deleteById(id);
        return true;
    }

    // Delete all books
    @DeleteMapping("/books")
    public boolean deleteAllBooks() {
        bookRepository.deleteAll();
        return true;
    }

}
