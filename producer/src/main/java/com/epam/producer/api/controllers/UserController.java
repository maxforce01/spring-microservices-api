package com.epam.producer.api.controllers;

import com.epam.models.User;
import com.epam.producer.api.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private ApiService apiService;

    @RequestMapping
    public List<User> getUsers(@RequestParam(name = "limit", required = false) String limit) {
        return apiService.getUsers(Integer.getInteger(limit));
    }
}
