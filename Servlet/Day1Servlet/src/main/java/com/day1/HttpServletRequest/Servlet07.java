package com.day1.HttpServletRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * request作用域
 * 只会在请求转发跳转时有效
 *
 */

@WebServlet("/ser11")
public class Servlet07 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet11.....");
        //获取域对昂
        String name = (String) req.getAttribute("name");
        System.out.println(name);
        Integer age = (Integer) req.getAttribute("age");
        System.out.println(age);
        List<String> list = (List<String>) req.getAttribute("list");
        System.out.println(list.get(0));


    }
}
