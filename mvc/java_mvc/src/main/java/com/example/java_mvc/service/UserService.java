package com.example.java_mvc.service;


import com.example.java_mvc.pojo.User;

import java.util.List;

/**
 *
 * 业务层接口
 */
public interface UserService {

    List<User> findUserAll();

}
