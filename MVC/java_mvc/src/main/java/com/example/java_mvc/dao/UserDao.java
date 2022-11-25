package com.example.java_mvc.dao;

import com.example.java_mvc.pojo.User;

import java.util.List;

/**
 *
 *
 *
 * 模型岑的接口：User模块的接口
 *
 *
 *
 */


public interface UserDao {
    List<User> findUserAll();
}
