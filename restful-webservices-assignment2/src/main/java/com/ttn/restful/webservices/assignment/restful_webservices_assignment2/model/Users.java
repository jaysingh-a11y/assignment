package com.ttn.restful.webservices.assignment.restful_webservices_assignment2.model;



import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "users")
public class Users {

    private List<User> users;

    public Users() {}

    public Users(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

