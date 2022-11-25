package com.example.day2022_11_24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;


@WebServlet("/servletLogin")
public class servletLogin extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");

        if(Objects.equals(name, "admin") && Objects.equals(password, "admin")){

            writer.write("跳转到servletLoing登录成功");


        }else {
            writer.write("账号密码错误");
        }

    }
}
