package org.ttn.assignment.spring_data_jpa_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ttn.assignment.spring_data_jpa_assignment.entity.Employee;

import java.util.List;

//@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByName(String name);
    List<Employee> findByNameStartingWith(String prefix);
    List<Employee> findByAgeBetween(int startAge, int endAge);
//    Integer getLost(int id);
}
