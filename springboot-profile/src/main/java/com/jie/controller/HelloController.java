package com.jie.controller;

import com.jie.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    // :后面代表默认值
    @Value("${person.name:haha}")
    private String name;

    @Value("${MAVEN_HOME}")
    private String msg;

    @Value("${os.name}")
    private String osName;

    @Resource
    private Person person;

    @GetMapping("/")
    public String hello(){
        System.out.println("Hello=============" + name);
        return person.toString();
    }


    @GetMapping("/msg")
    public String msg(){
        return msg;
    }


    @GetMapping("/osName")
    public String osName(){
        return osName;
    }
}
