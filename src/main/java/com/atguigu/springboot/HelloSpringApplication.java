package com.atguigu.springboot;

import com.atguigu.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

//@MapperScan("com.atguigu.springboot.dao")
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class HelloSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HelloSpringApplication.class, args);
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(HelloSpringApplication.class, args);
//        for (String configurableApplicationContext:applicationContext.getBeanDefinitionNames()){
//            System.out.println("============================");
//            System.out.println(configurableApplicationContext);
//        }
//        System.out.println("==========================");
//        User user = (User) context.getBean("user");
//        User user2 = (User) context.getBean("user2");
//        System.out.println(user);
//        System.out.println(user2);
    }

}
