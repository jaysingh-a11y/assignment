package org.ttn.assignment.spring_data_jpa2_jpql_assignment.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.ttn.assignment.spring_data_jpa2_jpql_assignment.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Object[]> getEmployeesWithSalaryGreaterThanAverage() {
        return employeeRepository.findEmployeesWithSalaryGreaterThanAverage();
    }

    @Transactional
    public int updateSalaryBelowAverage(Double salary) {
        return employeeRepository.updateSalaryBelowAverage(salary);
    }

    @Transactional
    public int deleteEmployeesWithMinimumSalary() {
        return employeeRepository.deleteEmployeesWithMinimumSalary();
    }

    public List<Object[]> getEmployeesWithLastNameEndingWithSingh() {
        return employeeRepository.findEmployeesWithLastNameEndingWithSingh();
    }

    @Transactional
    public int deleteEmployeesWithAgeGreaterThan(Integer age) {
        return employeeRepository.deleteEmployeesWithAgeGreaterThan(age);
    }
}