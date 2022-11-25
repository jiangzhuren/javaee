package com.day1.HttpServletRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 * 请求转发
 * 让请求从服务端跳转到客户端
 * 服务端行为
 *
 */

@WebServlet("/ser09")
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收服务器参数
        String uname = req.getParameter("uname");
        System.out.println("ser09" + uname);
    }
}
