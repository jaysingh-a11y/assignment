package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service;



import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public User save(User user) {
        users.add(user);
        return user;
    }

    public List<User> findAll() {
        return users;
    }
}

