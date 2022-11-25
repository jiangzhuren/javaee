package com.example.mvc2022_11_25.service.impl;

import com.example.mvc2022_11_25.dao.UserDao;
import com.example.mvc2022_11_25.dao.impl.UserDaoImpl;
import com.example.mvc2022_11_25.service.UserService;
import jakarta.servlet.annotation.WebServlet;


public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();
    @Override
    public int insertUser() throws Exception {
        int i = userDao.insertUser();
        return i;

    }
}
