package org.ttn.assignment.spring_data_jpa3_jpql_assignment.repository;

import org.ttn.assignment.spring_data_jpa3_jpql_assignment.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}