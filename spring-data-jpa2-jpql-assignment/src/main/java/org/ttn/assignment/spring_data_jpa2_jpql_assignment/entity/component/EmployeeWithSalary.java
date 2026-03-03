package org.ttn.assignment.spring_data_jpa2_jpql_assignment.entity.component;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_salary")
public class EmployeeWithSalary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private Integer age;

    @Embedded
    private Salary salary;

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Integer getAge() { return age; }
    public Salary getSalary() { return salary; }

    public void setId(Long id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(Integer age) { this.age = age; }
    public void setSalary(Salary salary) { this.salary = salary; }
}