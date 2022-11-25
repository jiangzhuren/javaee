package com.day1.HttpServletRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;


/**
 * request作用域
 * 只会在请求转发跳转时有效
 *
 */

@WebServlet("/ser10")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name","admin");
        req.setAttribute("age",10);
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        req.setAttribute("list",list);
        System.out.println("ser10运行");
//        req.getRequestDispatcher("ser11").forward(req,resp);

        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
