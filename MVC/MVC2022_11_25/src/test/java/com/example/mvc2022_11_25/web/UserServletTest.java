package com.example.mvc2022_11_25.web;

import com.example.mvc2022_11_25.service.UserService;
import com.example.mvc2022_11_25.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServletTest {
    @Test
    public void test() throws Exception {
        UserService user = new UserServiceImpl();
        user.insertUser();
    }

}