package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.controller;

import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.UserWithPassword;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/static")
public class StaticFilterController {

    @PostMapping("/users")
    public UserWithPassword saveUser(@RequestBody UserWithPassword user) {

        System.out.println("Password saved: " + user.getPassword());

        // password will NOT be returned
        return user;
    }
}


