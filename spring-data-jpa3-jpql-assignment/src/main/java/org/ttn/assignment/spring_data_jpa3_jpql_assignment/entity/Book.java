package org.ttn.assignment.spring_data_jpa3_jpql_assignment.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonBackReference
    private Author author;

    @ManyToMany(mappedBy = "manyToManyBooks")
    @JsonBackReference
    private Set<Author> authors;

    public Long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}