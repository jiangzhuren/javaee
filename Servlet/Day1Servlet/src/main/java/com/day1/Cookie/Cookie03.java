package com.day1.Cookie;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *
 * Cookie到期时间
 */
@WebServlet("/cookie")
public class Cookie03 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //到期时间 负整数，  只在浏览器内存存活，关闭失效

        Cookie cookie = new Cookie("uname1", "zhangsan");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
        //正整数，表示存活 秒数， 存在磁盘中
        Cookie cookie1 = new Cookie("uname2", "lisi");
        cookie1.setMaxAge(30);
        resp.addCookie(cookie1);
        //0 表示即刻删除
        Cookie cookie2 = new Cookie("uname3", "wangwu");
        cookie2.setMaxAge(0);
        resp.addCookie(cookie2);
    }
}
