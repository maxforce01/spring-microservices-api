package com.epam.consumer.services.impl;

import com.epam.common.UserData;
import com.epam.consumer.services.ApiService;
import com.epam.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${api_url}")
    private String apiUrl;

    public ApiServiceImpl() {
    }

    @Override
    public UserData getUsers() {
        User[] data = restTemplate.getForObject(apiUrl, User[].class);
        UserData userData = new UserData();
        userData.setData(data);
        return userData;
    }
}
