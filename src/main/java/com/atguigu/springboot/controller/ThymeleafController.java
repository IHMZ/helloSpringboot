package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String hello(Model model){
        model.addAttribute("hello","helloThymeleaf");
        System.out.println("跳转成功");
        List<User> users = new ArrayList<User>();
        users.add(new User("张三","深圳"));
        users.add(new User("李四","北京"));
        users.add(new User("王五","武汉"));
        model.addAttribute("users",users);

        return "hello";
    }
}
