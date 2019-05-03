package com.wildcodeschool.springRest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class Book {

    // Book's id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Book's title
    @Column(name = "title")
    private String title;

    // Book's author
    @Column(name = "author")
    private String author;

    // Book's description
    @Column(name = "description")
    private String description;

    // Constructors
    public Book() {
    }

    public Book(String title, String author, String description) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setDescription(description);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method toString
    @Override
    public String toString() {
        return "Book {id=" + id + ", title=" + title + ", author=" + author + ", description=" + description + "}";
    }

}
