package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by ii97 on 20.4.26.
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {
        return "provider2"+name;
    }
}
