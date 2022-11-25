package com.day1.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Session02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //session域对象
        //设置域对象
        session.setAttribute("uname","admin");
        session.setAttribute("upwd","123456");
        //移除seeeion域对象
        session.removeAttribute("upwd");

        //request 域对象
        req.setAttribute("name","zhangsan");

        //请求转发跳转到jsp页面
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
