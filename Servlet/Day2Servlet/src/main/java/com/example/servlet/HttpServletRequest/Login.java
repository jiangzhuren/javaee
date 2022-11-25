package com.example.servlet.HttpServletRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class Login extends HttpServlet   {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usernames = req.getParameter("username");
        String passwords = req.getParameter("password");
        System.out.println(usernames + passwords);
        resp.setContentType("text/html;charset = utf-8");
        PrintWriter writer = resp.getWriter();
        if (usernames.equals("admin") && passwords.equals("admin")) {
            writer.write("登录成功");
        }
        if (!usernames.equals("admin") || !passwords.equals("admin")) {
            writer.write("账号密码错误");

        }

        if (usernames.equals("")) {
            writer.write("请输入用户名");
        }
        if (passwords.equals("")) {
            writer.write("请输入密码");
        }
    }

}
