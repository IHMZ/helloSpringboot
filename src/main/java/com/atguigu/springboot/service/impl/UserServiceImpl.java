package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.dao.UserDao;
import com.atguigu.springboot.dao.UserJpaDao;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
@Transactional //添加事务，面向切面编程，生成对象其实是代理对象
public class UserServiceImpl implements UserService {

//    @Autowired
    @Resource
    UserDao userDao;

    @Transactional(isolation = Isolation.DEFAULT)
    @Override
    public List<User> findAll() {
        // redis的key
        String key = "alluser";
        // 先查询redis中是否有数据，如果有直接返回redis的数据
        List<User> users = (List<User>) redisTemplate.boundValueOps(key).get();
        if (users!=null) {
            System.out.println("Redis中的数据");
            return users;
        }
        // 如果没有，查询数据库
        users = userDao.findAll();
        // 将数据库数据存入到redis中
        if (users != null && users.size()>0) {
            System.out.println("将数据放入Redis中");
            redisTemplate.boundValueOps(key).set(users);
        }
        return users;

    }
    @Autowired
    UserJpaDao userJpaDao;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public List<User> findUsers() {
        List<User> all = userJpaDao.findAll();
        return all;
    }

    @Override
    public User findUserById(Integer id) {
        Optional<User> byId = userJpaDao.findById(id);
        return byId.get();
    }

    @Override
    public void saveUser(User user) {
        userJpaDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userJpaDao.save(user);

    }

    @Override
    public void deleteUserById(Integer id) {
        userJpaDao.deleteById(id);
    }
}
