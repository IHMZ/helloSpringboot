package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApplicationController {

    @Value(value = "${person.name}")
    private String name;

    @Value(value = "${person.phone}")
    private String phone;

    @GetMapping(value = "/hello")
    public String hello(){
        System.out.println(name);
        System.out.println(phone);

        return "helloSpringboot auto" + name + phone;
    }

}
