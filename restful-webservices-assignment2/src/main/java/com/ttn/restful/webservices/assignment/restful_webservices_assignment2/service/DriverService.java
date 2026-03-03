package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service;

import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.Driver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverService {

    private static final List<Driver> driverList = new ArrayList<>();

    static {
        driverList.add(new Driver(1L, "Jay", "jay@gmail.com", "DL12345"));
        driverList.add(new Driver(2L, "Amit", "amit@gmail.com", "UP67890"));
    }

    public Driver getDriverById(Long id) {
        return driverList.stream()
                .filter(driver -> driver.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Driver> getAllDrivers() {
        return driverList;
    }
}