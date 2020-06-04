package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
        System.out.println(userService.getClass());
        return users;
    }

    @RequestMapping("/save")
    public void saveUser(User user){
        userService.saveUser(user);
    }

}
