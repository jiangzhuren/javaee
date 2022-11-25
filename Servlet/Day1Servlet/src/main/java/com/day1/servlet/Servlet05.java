package com.day1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/ser05")
public class Servlet05 extends HttpServlet {


    /**
     *
     *
     *
     * 就绪/服务方法
     * 系统方法，服务器自动调用
     * 请求到Servlet时，就会调用该方法
     * 方法可以被多次调用
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("SErvlet方法被调用了");
    }


    /**
     * 销毁方法
     * 系统方法，服务器自动调用
     * 方法只会执行一次
     *
     */
    @Override
    public void destroy() {
        System.out.println("servlet被销毁了");

    }
    /**
     * 初始化方法
     * 系统方法，服务器自动调用
     * 当请求到达Servlet容器时，Servlet容器会判断改Servlet对象是否存在，如果不存在，则创建实例并初始化
     *方法只会执行一次
     *
     */


    @Override
    public void init() throws ServletException {

        System.out.println("servlet 被创建了");

    }
}
