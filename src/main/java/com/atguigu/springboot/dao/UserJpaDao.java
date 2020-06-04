package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaDao extends JpaRepository<User,Integer> {
}
