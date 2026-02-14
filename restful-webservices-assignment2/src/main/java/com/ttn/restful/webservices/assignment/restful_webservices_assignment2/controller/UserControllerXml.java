package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.controller;


import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.User;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.Users;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserControllerXml {

    @Autowired
    private UserService userService;

    // A) POST - Accept XML
    @PostMapping(
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE
    )
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    // B) GET - Return XML
    @GetMapping(
            produces = MediaType.APPLICATION_XML_VALUE
    )
    public Users getAllUsers() {
        return new Users(userService.findAll());
    }
}

