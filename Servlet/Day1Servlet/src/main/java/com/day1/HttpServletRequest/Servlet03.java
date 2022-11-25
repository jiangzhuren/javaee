package com.day1.HttpServletRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *
 * 请求乱码问题
 *
 * get请求不会乱码
 *
 * post会出现乱码
 * request.setCharacterEncoding("utf-8")
 *
 *
 *
 *
 */
@WebServlet("/ser07")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //获取前台传递的参数
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        System.out.println("姓名" + uname + "密码" + pwd);
    }
}
