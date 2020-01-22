package com.epam.producer.api;

import com.epam.models.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
