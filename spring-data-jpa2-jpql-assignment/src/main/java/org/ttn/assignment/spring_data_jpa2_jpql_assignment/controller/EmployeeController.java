package org.ttn.assignment.spring_data_jpa2_jpql_assignment.controller;

import org.springframework.web.bind.annotation.*;
import org.ttn.assignment.spring_data_jpa2_jpql_assignment.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/above-average-salary")
    public List<Object[]> getEmployeesAboveAverageSalary() {
        return employeeService.getEmployeesWithSalaryGreaterThanAverage();
    }

    @PutMapping("/update-salary")
    public int updateSalaryBelowAverage(@RequestParam Double salary) {
        return employeeService.updateSalaryBelowAverage(salary);
    }

    @DeleteMapping("/delete-min-salary")
    public int deleteEmployeesWithMinimumSalary() {
        return employeeService.deleteEmployeesWithMinimumSalary();
    }

    @GetMapping("/lastname/singh")
    public List<Object[]> getEmployeesWithLastNameEndingWithSingh() {
        return employeeService.getEmployeesWithLastNameEndingWithSingh();
    }

    @DeleteMapping("/delete-by-age")
    public int deleteEmployeesByAge(@RequestParam Integer age) {
        return employeeService.deleteEmployeesWithAgeGreaterThan(age);
    }
}
