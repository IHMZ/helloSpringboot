package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface UserDao {

//    @Select("select * from user") 注解形式，不要配置文件，
    List<User> findAll();
}
