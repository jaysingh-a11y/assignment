package com.springBoot.assignment.springBootAssignment.question3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    public static final String Company="TTN";
    @Id
    private int id;
    private String name;
    private String designation;

    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
    }

    public Employee() {

    }


    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setId(int id) {
        this.id = id;
    }
}
