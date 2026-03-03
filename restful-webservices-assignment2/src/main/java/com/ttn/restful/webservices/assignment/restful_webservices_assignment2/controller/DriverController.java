package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.controller;

import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.Driver;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service.DriverService;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService service;

    public DriverController(DriverService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public EntityModel<Driver> getDriverById(@PathVariable Long id) {
        Driver driver = service.getDriverById(id);

         String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/drivers")
                .toUriString();

        return EntityModel.of(driver, Link.of(baseUrl).withRel("all-drivers"));
    }

    @GetMapping
    public List<Driver> getAllDrivers() {
        return service.getAllDrivers();
    }
}