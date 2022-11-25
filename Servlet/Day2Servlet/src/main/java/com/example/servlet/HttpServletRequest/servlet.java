package com.example.servlet.HttpServletRequest;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


@WebServlet("/test1")

public class servlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String getname = req.getParameter("getname");
        String postname = req.getParameter("postname");
        System.out.println(getname+postname);

        resp.setContentType("text/html;charset  = utf-8");

        if (getname != null) {
            PrintWriter writer = resp.getWriter();
            writer.write("get方法" + "   从get框获得的数据是：" + getname + "<br>");
        }
        if (postname != null) {
            PrintWriter writer2 = resp.getWriter();
            String[] postnames = req.getParameterValues("postname");
            writer2.write("post方法" + "从post框获取的数据是:" + Arrays.toString(postnames));
        }


    }
}
