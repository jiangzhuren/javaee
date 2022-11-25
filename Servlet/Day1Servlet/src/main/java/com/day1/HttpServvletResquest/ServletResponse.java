package com.day1.HttpServvletResquest;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 响应数据
 * getWriter（）   字符流   输出字符串
 * getOutputStream（）  字节流  输出一切数据
 *
 * 两种方法不能同时使用
 *
 */

@WebServlet("/ser20")
public class ServletResponse extends HttpServlet     {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //getWriter（）字符输出流
//        //获取字符输出流
//        PrintWriter writer = resp.getWriter();
//        writer.write("hello");
        //getOutputStream()  字节输出流
        //得到字节输出流
        ServletOutputStream outputStream = resp.getOutputStream();
        //输出字节
        outputStream.write("hei".getBytes());
        String uname = req.getParameter("uname");
        System.out.println(uname);


    }
}
