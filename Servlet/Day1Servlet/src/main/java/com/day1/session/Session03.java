package com.day1.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Session03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置Session最大不活动时间
        HttpSession session = req.getSession();
        //单位秒
        session.setMaxInactiveInterval(10);
        //获取Session最大不活动时间
        int maxInactiveInterval = session.getMaxInactiveInterval();
        System.out.println(maxInactiveInterval);
        //立即失效
        session.invalidate();
        //关闭浏览器失效
            }
}
