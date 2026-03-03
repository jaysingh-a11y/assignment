package org.ttn.assignment.spring_data_jpa2_jpql_assignment.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_first_name")
    private String firstName;

    @Column(name = "emp_last_name")
    private String lastName;

    @Column(name = "emp_salary")
    private Double salary;

    @Column(name = "emp_age")
    private Integer age;

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Double getSalary() { return salary; }
    public Integer getAge() { return age; }

    public void setId(Long id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSalary(Double salary) { this.salary = salary; }
    public void setAge(Integer age) { this.age = age; }
}
