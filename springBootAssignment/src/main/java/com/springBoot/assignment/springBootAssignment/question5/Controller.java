package com.springBoot.assignment.springBootAssignment.question5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // This method maps to http://localhost:8080/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello! Spring Boot is running and DevTools is active!";
    }
}