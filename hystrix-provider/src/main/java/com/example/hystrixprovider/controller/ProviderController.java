package com.example.hystrixprovider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {


    @RequestMapping("/toIndex")
    public String toIndex(String name) {
        System.out.println(1/0);
        return "this is my feign name:" + name;
    }

}
