package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.controller;




import com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
@Tag(
        name = "User Controller",
        description = "APIs for creating, retrieving and deleting users"
)
public class UserController {

    private final Map<Integer, User> userStore = new HashMap<>();

    // GET user
    @Operation(
            summary = "Get user details",
            description = "Fetch user details using user ID"
    )
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable int id) {
        return userStore.get(id);
    }

    // POST user
    @Operation(
            summary = "Create user",
            description = "Save user details in the system"
    )
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody User user) {
        userStore.put(user.getId(), user);
        return user;
    }

    // DELETE user
    @Operation(
            summary = "Delete user",
            description = "Delete user from the system using user ID"
    )
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        userStore.remove(id);
        return "User deleted successfully";
    }
}

