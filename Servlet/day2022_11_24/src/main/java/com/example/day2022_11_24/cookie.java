package com.example.day2022_11_24;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class cookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("username","admin");
        Cookie cookie1 = new Cookie("password","admin");

        resp.addCookie(cookie);
        resp.addCookie(cookie1);
        cookie1.setMaxAge(100);

    }
}
