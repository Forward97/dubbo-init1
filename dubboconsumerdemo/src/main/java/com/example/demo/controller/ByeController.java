package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.ByeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ii97 on 20.4.27.
 */
@RestController
public class ByeController {
    @Reference
    private ByeService byeService;

    @ResponseBody
    @RequestMapping("/dubbo/bye")
    public String bye(){
        String goodbye = byeService.goodbye("controller-bye");
        System.out.println(byeService.goodbye("controller"));
        return goodbye;
    }
}
