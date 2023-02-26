package com.jie.controller;

import com.jie.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerStarterController {

    @Resource
    private HelloService helloService;

    @GetMapping("/customer")
    public String customer(){
        return helloService.sayHello("hhhhhhhhhhhhhhhhhhhhhh");
    }
}
