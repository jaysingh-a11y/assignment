package com.ttn.security.applicationsecurity.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/home")
    public String home() {
        return "Welcome User";
    }
}