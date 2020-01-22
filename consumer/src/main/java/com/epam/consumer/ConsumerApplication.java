package com.epam.consumer;

import com.epam.consumer.services.ApiService;
import com.epam.consumer.services.UserService;
import com.epam.consumer.services.impl.ApiServiceImpl;
import com.epam.consumer.services.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public ApiService apiService() {
        return new ApiServiceImpl();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
