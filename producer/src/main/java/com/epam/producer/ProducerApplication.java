package com.epam.producer;

import com.epam.producer.api.ApiService;
import com.epam.producer.api.service.ApiServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {
    @Bean
    public ApiService apiService() {
        return new ApiServiceImpl();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

}
