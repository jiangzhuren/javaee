package com.example.day2022_11_24;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class httpsession extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String id = session.getId();
        long creationTime = session.getCreationTime();
        long lastAccessedTime = session.getLastAccessedTime();
        boolean aNew = session.isNew();
        session.setMaxInactiveInterval(10);//最大不活动时间
        int maxInactiveInterval = session.getMaxInactiveInterval();//获取最大不活动时间
        session.invalidate();//立即失效

    }
}
