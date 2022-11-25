package com.example.mvc2022_11_25.web;

import com.example.mvc2022_11_25.service.UserService;
import com.example.mvc2022_11_25.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/insertUser")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try {
            userService.insertUser();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
