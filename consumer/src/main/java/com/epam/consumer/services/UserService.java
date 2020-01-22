package com.epam.consumer.services;

import com.epam.common.UserData;
import com.epam.models.User;

import java.util.List;

public interface UserService {
    void saveUsers(List<User> userList);

    void saveUser(User user);

    UserData getUsers();

    User getUser(String userId);
}
