package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.controller;

import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.UserWithPassword;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service.UserWithPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/static")
public class StaticFilterController {
    @Autowired
    UserWithPasswordService userWithPasswordService;

    @PostMapping("/users")
    public UserWithPassword saveUser(@RequestBody UserWithPassword newUser) {
        UserWithPassword savedUser =userWithPasswordService.save(newUser);
        return savedUser;


    }
    @GetMapping("/users")
    public List<UserWithPassword> getUser() {
        return userWithPasswordService.findAll();


    }
}


