package com.example.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = { "com.example" })
@EnableAsync
public class TestprojectApplication {

    @Bean
    protected RestTemplate getTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestprojectApplication.class, args);
    }




}
