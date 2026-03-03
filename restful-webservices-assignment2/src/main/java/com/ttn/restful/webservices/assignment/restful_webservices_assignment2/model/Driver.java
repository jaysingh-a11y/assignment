package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model;

public class Driver {

    private Long id;
    private String name;
    private String email;
    private String licenseNumber;

    public Driver(Long id, String name, String email, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.licenseNumber = licenseNumber;
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

    public String getLicenseNumber() {
        return licenseNumber;
    }
}