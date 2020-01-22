package com.epam.consumer.services.impl;

import com.epam.common.UserData;
import com.epam.consumer.repositories.UserRepository;
import com.epam.consumer.services.UserService;
import com.epam.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUsers(List<User> userList) {
        userRepository.saveAll(userList);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public UserData getUsers() {
        UserData userData = new UserData();
        userData.setData((List<User>) userRepository.findAll());
        return userData;
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).get();
    }
}
