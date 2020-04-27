package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ii97 on 20.4.26.
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/dubbo/hello")
    public String hello(){
        String hi = helloService.sayHi("consumer-controller");
        System.out.println(helloService.sayHi("SnailClimb"));
        return hi;
    }
}
