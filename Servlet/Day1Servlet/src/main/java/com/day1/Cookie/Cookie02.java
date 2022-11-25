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
 * Cookie的获取
 */
@WebServlet("/ser31")
public class Cookie02 extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Coolkies
        Cookie[] cookies = req.getCookies();


        //判断Cookies是否为空
        if (cookies != null && cookies.length > 0){
            for (Cookie cookie : cookies){
                //获取cookie的名称和值
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println("名字：" + name + "值： " + value);
            }
        }

    }
}
