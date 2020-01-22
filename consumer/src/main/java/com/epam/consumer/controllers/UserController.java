package com.epam.consumer.controllers;

import com.epam.common.UserData;
import com.epam.consumer.services.ApiService;
import com.epam.consumer.services.UserService;
import com.epam.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/database/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ApiService apiService;

    @RequestMapping("/save")
    public String saveUsers() {
        UserData userData = apiService.getUsers();
        userService.saveUsers(userData.getData());
        return "200";
    }

    @RequestMapping("/get")
    public List<User> getUsers() {
        return userService.getUsers().getData();
    }

    @RequestMapping("/user/{id}")
    public User getUsers(@PathVariable(name = "id") String id) {
        System.out.println(id);
        return userService.getUser(id);
    }

}
