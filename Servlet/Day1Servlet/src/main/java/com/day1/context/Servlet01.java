package com.day1.context;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/ser1111")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过request获取\
        ServletContext servletContext = req.getServletContext();
        //通过session获取
        ServletContext servletContext1 = req.getSession().getServletContext();
        //通过ServletConfig获取
        String servletContextName = getServletContext().getServletContextName();
        //直接获取
        ServletContext servletContext2 = getServletContext();
        //常用方法
        //获取当前服务器的版本信息
        String servletPath = req.getServletPath();
        //2. 真实路径
        String realPath = req.getServletContext().getRealPath("/");
    }
}
