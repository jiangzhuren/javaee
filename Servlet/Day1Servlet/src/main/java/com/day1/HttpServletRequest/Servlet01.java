package com.day1.HttpServletRequest;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;


@WebServlet("/ser06")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


         // 1.获取请求时的完整路径（http开始，到？结束）
        String s = req.getRequestURL().toString();
        System.out.println("1.获取请求时的完整路径"+s);

        // 2.获取请求时的部分路径（从项目的站点名开始，到？结束）
        String s1 = req.getRequestURI().toString();
        System.out.println("2.获取请求时的部分路径"+s1);
        //3.获取请求时的参数字符串（从？开始，到最后的字符串）
        String queryString = req.getQueryString();
        System.out.println("3.获取请求时的参数字符串" + queryString);
        //4.获取请求的方式（GET/Post）
        String method = req.getMethod();
        System.out.println("4.获取请求的方式" + method);
        //5.获取协议版本（Http/1.1）
        String protocol = req.getProtocol();
        System.out.println("5.获取协议版本" + protocol);

        //6.获取项目的站点名  项目的访问路径
        String contextPath = req.getContextPath();
        System.out.println("6.获取项目的站点名 "+contextPath);

        //7.获取指定名称的参数
        String name = req.getParameter("name");
        System.out.println(name);

        //8.获取指定名称参数的所有值
        String[] names = req.getParameterValues("name");
        System.out.println(Arrays.toString(names));


    }
}
