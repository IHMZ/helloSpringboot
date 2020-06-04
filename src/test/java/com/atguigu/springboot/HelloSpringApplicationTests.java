package com.atguigu.springboot;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringApplicationTests {

    @Autowired
    UserService userService;
    @Autowired
    DataSource dataSource;
    @Test
    public void contextLoads() {
        List<User> users = userService.findAll();
        for (User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void dataSourceTest() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
