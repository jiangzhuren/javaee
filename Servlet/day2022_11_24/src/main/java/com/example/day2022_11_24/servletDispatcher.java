package com.example.day2022_11_24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class servletDispatcher extends HttpServlet   {
    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        if (username.equals(null) && password.equals(null)){
            System.out.println("没收到传递参数");
        }else {
            writer.write("正在重定向....");


            req.getRequestDispatcher("/servletLogin").forward(req, resp);//请求转发
        }

    }
}
