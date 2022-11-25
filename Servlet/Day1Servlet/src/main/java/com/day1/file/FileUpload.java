package com.day1.file;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;


@WebServlet("/serup")
@MultipartConfig//上传表单一定要加的注解
public class FileUpload extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("文件上传.....");
        // 设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //获取表单普通项
        String name = req.getParameter("name");
        System.out.println(name);
        //获取part对象上传文件
        Part part = req.getPart("myfile");//表单中文件域的name属性
        //通过part对象得到上传的文件名
        String submittedFileName = part.getSubmittedFileName();
        System.out.println(submittedFileName);
        //得到文件的存放路径
        String realPath = req.getServletContext().getRealPath("/");
        System.out.println(realPath);
        //上传文件到指定目录
        part.write(realPath + "/" + submittedFileName);


    }
}
