package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model;

public class Customer {

    private Long id;
    private String name;
    private String email;
    private String address;
    private String phone;

    public Customer(Long id, String name, String email, String address, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
