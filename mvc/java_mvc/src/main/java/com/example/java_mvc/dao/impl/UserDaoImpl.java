package com.example.java_mvc.dao.impl;


import com.example.java_mvc.dao.UserDao;
import com.example.java_mvc.pojo.User;

import java.util.List;

/**
 * 模型曾实现类
 *
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findUserAll() {
        /**
         *
         *
         * jdbc操作
         *
         * 1.依据工具类来获取链接
         * 2.通过连接对象获取预编译对象
         * 3.声明全表查询sql语句
         * 4。
         * 5.使用预编译对象来完成铲鲟所有user的操作
         */
        return null;
    }
}
