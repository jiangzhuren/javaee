package com.example.day2022_11_24.sessioncookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession(false);
        if (session == null){
            resp.sendRedirect("login.html");
            return;
        }

        String username = (String) session.getAttribute("username");
        Integer loginCount = (Integer) session.getAttribute("loginCount");
        loginCount++;
        session.setAttribute("loginCount",loginCount);

        StringBuffer html = new StringBuffer();
        html.append("<h1>"+ username +"</h1>");
        html.append("<h1>" + loginCount + "</h1>");
        writer.write(html.toString());
    }
}
