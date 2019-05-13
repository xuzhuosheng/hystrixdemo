package com.example.hystrixcomsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value="hystrix-provider",fallback = TestServiceImpl.class)
public interface TestService {
    //在hystrix-provider的对应方法上，输出1/0 故意报错。
    @RequestMapping("/toIndex")
    String toIndexService(@RequestParam("name") String name);

}
