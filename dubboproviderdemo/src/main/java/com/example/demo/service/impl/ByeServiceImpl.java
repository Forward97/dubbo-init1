package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.ByeService;
import org.springframework.stereotype.Component;

/**
 * Created by ii97 on 20.4.27.
 */
@Component
@Service
public class ByeServiceImpl implements ByeService {
    @Override
    public String goodbye(String word) {
        return "provider bye"+word;
    }
}
