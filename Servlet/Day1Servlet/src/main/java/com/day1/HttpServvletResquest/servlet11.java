package com.day1.HttpServvletResquest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 *
 *
 * 重定向
 *
 * 服务端指导，客户端行为
 * 存在两次请求
 */
@WebServlet("/ser19")
public class servlet11 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uname = req.getParameter("uname");
        System.out.println(uname);

        //重定向
        resp.sendRedirect("ser20");
    }
}
