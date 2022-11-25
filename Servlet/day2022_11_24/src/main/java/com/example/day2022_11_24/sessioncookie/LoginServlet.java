package com.example.day2022_11_24.sessioncookie;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/sessionlogin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        if (! username.equals("admin") && !password.equals("admin")){
            writer.write("账号密码输入错误");
            return;
        }
        writer.write("登录成功");
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("username",username);
        httpSession.setAttribute("password",password);
        httpSession.setMaxInactiveInterval(10);
        httpSession.setAttribute("loginCount",0);
        resp.sendRedirect("index");
    }
}
