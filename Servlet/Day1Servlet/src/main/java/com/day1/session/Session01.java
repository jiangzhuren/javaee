package com.day1.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/ser001")

public class Session01 extends HttpServlet   {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Session对象
        HttpSession session = req.getSession();
        //获取 session会话标识符
        String id = session.getId();
        //获取session创建时间
        long creationTime = session.getCreationTime();
        //获取最后一次访问时间
        long lastAccessedTime = session.getLastAccessedTime();
        //是否是新的Session对象
        boolean aNew = session.isNew();

    }
}
