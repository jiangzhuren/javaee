package com.example.java_mvc.service.impl;


import com.example.java_mvc.dao.UserDao;
import com.example.java_mvc.dao.impl.UserDaoImpl;
import com.example.java_mvc.pojo.User;
import com.example.java_mvc.service.UserService;

import java.util.List;

/**
 *
 *  业务层实现类
 *  依赖于模型层返回数据的
 */
public class UserServiceImpl implements UserService {
//    private UserDaoImpl userDao = new UserDaoImpl();
    //依赖接口，而非实现类，面向接口编程：
    //功能模块组织形式依赖于接口
    //多态实现接口
    private UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findUserAll() {
        //调用dao层方法获取数据
        List<User> users = userDao.findUserAll();
        return users;

    }
}
