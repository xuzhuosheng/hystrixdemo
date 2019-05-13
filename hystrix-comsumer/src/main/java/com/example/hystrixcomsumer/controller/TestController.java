package com.example.hystrixcomsumer.controller;

import com.example.hystrixcomsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/toIndex")
    public String toIndex() {

        String a = testService.toIndexService("xuzhuosheng");

        return a;
    }

}
