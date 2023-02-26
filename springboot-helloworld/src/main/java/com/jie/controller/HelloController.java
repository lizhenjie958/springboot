package com.jie.controller;

import com.jie.bean.Car;
import com.jie.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

//    @ConfigurationProperties(prefix = "mycar") 使用该组件，从配置文件中直接导入单例对象
    @Resource
    private Car car;

    @Resource
    private Person person;

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2!";
    }

    @RequestMapping("car")
    public String handler01(){
        return car.toString();
    }

    @RequestMapping("person")
    public String handler02(){
        return person.toString();
    }


}
