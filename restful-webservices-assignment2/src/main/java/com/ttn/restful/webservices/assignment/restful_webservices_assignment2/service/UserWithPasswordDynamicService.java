package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.service;

import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.UserWithPasswordDynamic;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserWithPasswordDynamicService {
    private final List<UserWithPasswordDynamic> userList = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    public UserWithPasswordDynamic saveUser(UserWithPasswordDynamic user) {
        user.setId(counter.getAndIncrement());
        userList.add(user);
        return user;
    }

    public List<UserWithPasswordDynamic> getAllUsers() {
        return userList;
    }
}