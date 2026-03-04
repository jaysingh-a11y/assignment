package org.ttn.assignment.spring_data_jpa3_jpql_assignment.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Subject> subjects;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "one_to_one_book_id")
    private Book book;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    @JsonManagedReference
    private List<Book> oneToManyBooks;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "author_book_mtm",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    @JsonManagedReference
    private Set<Book> manyToManyBooks;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public Book getBook() {
        return book;
    }

    public List<Book> getOneToManyBooks() {
        return oneToManyBooks;
    }

    public Set<Book> getManyToManyBooks() {
        return manyToManyBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setOneToManyBooks(List<Book> oneToManyBooks) {
        this.oneToManyBooks = oneToManyBooks;
    }

    public void setManyToManyBooks(Set<Book> manyToManyBooks) {
        this.manyToManyBooks = manyToManyBooks;
    }
}