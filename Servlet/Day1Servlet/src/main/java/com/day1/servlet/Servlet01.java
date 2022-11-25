package com.day1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *
 * 实现servlet
 * 1.创建java类
 * 2.实现servlet的规范，请求httpservlet类
 * 3.重写service方法，用来处理请求
 * 4.设置注解，指定访问路径
 *
 */

@WebServlet("/ser01")
//@WebServlet(name = "Servlet01" , value = "/ser01")
//@WebServlet(name = "Servlet01",value = {"/ser01","/ser001"})
// @WebServlet(name = "Servlet01" ,urlPatterns = "")
public class Servlet01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //打印内容
        System.out.println("hello servlet");
        //通过流输出数据到浏览器
        resp.getWriter().write("hello");
    }
}
