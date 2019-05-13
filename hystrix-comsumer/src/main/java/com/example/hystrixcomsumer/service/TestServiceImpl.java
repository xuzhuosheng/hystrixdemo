package com.example.hystrixcomsumer.service;


import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {
    @Override
    public String toIndexService(String name) {
        return "hystrix is working";
    }
}
