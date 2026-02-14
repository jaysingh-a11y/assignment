package com.ttn.restful.webservices.assignment.restful_webservices_assignment.question2;

import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import jakarta.validation.constraints.*;

public class Employee {

    @Min(value=0,message="Id must be greater than or equal to zero")
    private int id;
    @NotBlank(message="Name cannot blank")
    @Size(min=3,max=15,message="size should be between 3 to 15 charcters")
    private String name;
    private LocalDate age;



//    public Employee(){}
    public Employee(int id, String name, LocalDate age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
