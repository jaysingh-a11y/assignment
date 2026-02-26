package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service;

import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.UserWithPassword;

import java.util.ArrayList;
import java.util.List;

public class UserWithPasswordService {

    private final List<UserWithPassword> users = new ArrayList<>();

    public UserWithPassword save(UserWithPassword user) {
        users.add(user);
        return user;
    }

    public List<UserWithPassword> findAll() {
        return users;
    }
}
