package com.example.hystrixdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HystrixdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixdemoApplication.class, args);
    }

}
