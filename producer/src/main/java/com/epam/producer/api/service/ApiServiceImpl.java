package com.epam.producer.api.service;

import com.epam.common.UserData;
import com.epam.models.User;
import com.epam.producer.api.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
    public List<User> getUsers(Integer since) {
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(apiUrl)
                .queryParam("since", since);
        System.out.println(builder.toUriString());
        User[] data = restTemplate.getForObject(builder.toUriString(), User[].class);
        UserData userData = new UserData();
        userData.setData(data);
        return userData.getData();
    }
}
