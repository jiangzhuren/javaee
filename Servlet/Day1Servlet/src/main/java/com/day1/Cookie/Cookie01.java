package com.day1.Cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;




@WebServlet("/ser30")
public class Cookie01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //cookie创建
        Cookie cookie = new Cookie("name", "admin");
        cookie.setMaxAge(0);
        //发送cookie对象
        resp.addCookie(cookie);

    }
}
