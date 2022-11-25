package com.example.day2022_11_24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
@WebServlet("/resp")
public class HttpServletResponse extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.sendRedirect("login");

    }
}
