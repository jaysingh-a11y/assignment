package org.ttn.assignment.spring_data_jpa3_jpql_assignment.service;

import org.ttn.assignment.spring_data_jpa3_jpql_assignment.entity.Author;
import org.ttn.assignment.spring_data_jpa3_jpql_assignment.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Transactional
    public Author updateAuthor(Long id, Author updatedAuthor) {
        Author existingAuthor = authorRepository.findById(id).orElseThrow();
        existingAuthor.setName(updatedAuthor.getName());
        existingAuthor.setAddress(updatedAuthor.getAddress());
        existingAuthor.setSubjects(updatedAuthor.getSubjects());
        existingAuthor.setBook(updatedAuthor.getBook());
        existingAuthor.setOneToManyBooks(updatedAuthor.getOneToManyBooks());
        existingAuthor.setManyToManyBooks(updatedAuthor.getManyToManyBooks());
        return authorRepository.save(existingAuthor);
    }

    @Transactional
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}