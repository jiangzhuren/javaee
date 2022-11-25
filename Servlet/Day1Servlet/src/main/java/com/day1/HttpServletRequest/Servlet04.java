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
 * 特点
 *  1.地址栏不改变
 *  2.一直只有一个请求
 *  3.request数据可以共享
 *
 */

@WebServlet("/ser08")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收服务器参数
        String uname = req.getParameter("uname");
        System.out.println("ser08" + uname);
        //请求转发到Servlet05
//        req.getRequestDispatcher("ser09").forward(req,resp);
        //请求转发到jsp页面
        req.getRequestDispatcher("index.html").forward(req,resp);
    }
}
