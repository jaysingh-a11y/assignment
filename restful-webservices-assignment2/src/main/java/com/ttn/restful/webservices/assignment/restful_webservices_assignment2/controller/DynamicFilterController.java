package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.UserWithPasswordDynamic;
import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service.UserWithPasswordDynamicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dynamic")
public class DynamicFilterController {

    private final UserWithPasswordDynamicService service;
    private final ObjectMapper objectMapper;

    public DynamicFilterController(UserWithPasswordDynamicService service, ObjectMapper objectMapper) {
        this.service = service;
        this.objectMapper = objectMapper;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> saveUser(
            @RequestBody UserWithPasswordDynamic user,
            @RequestParam(defaultValue = "false") boolean includePassword) {

        UserWithPasswordDynamic savedUser = service.saveUser(user);

        SimpleBeanPropertyFilter filter = includePassword
                ? SimpleBeanPropertyFilter.filterOutAllExcept("id", "username", "email", "password")
                : SimpleBeanPropertyFilter.filterOutAllExcept("id", "username", "email");

        SimpleFilterProvider filters = new SimpleFilterProvider()
                .addFilter("UserFilter", filter);

        Object filteredUser = objectMapper
                .setFilterProvider(filters)
                .convertValue(savedUser, Object.class);

        return ResponseEntity.ok(filteredUser);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Object>> getAllUsers(
            @RequestParam(defaultValue = "false") boolean includePassword) {

        List<UserWithPasswordDynamic> allUsers = service.getAllUsers();

        SimpleBeanPropertyFilter filter = includePassword
                ? SimpleBeanPropertyFilter.filterOutAllExcept("id", "username", "email", "password")
                : SimpleBeanPropertyFilter.filterOutAllExcept("id", "username", "email");

        SimpleFilterProvider filters = new SimpleFilterProvider().addFilter("UserFilter", filter);

        List<Object> filteredUsers = objectMapper
                .setFilterProvider(filters)
                .convertValue(allUsers, new com.fasterxml.jackson.core.type.TypeReference<List<Object>>() {});

        return ResponseEntity.ok(filteredUsers);
    }
}