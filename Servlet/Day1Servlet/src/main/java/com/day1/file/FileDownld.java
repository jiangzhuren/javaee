package com.day1.file;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/serdown")
public class FileDownld extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("文件下载.......");
        // 设置请求编码
        req.setCharacterEncoding("utf-8");
        //获取文件下载路径
        String realPath = getServletContext().getRealPath("/Download/");
        //获取要下载的文件名
        String filename = req.getParameter("filename");
        //通过路径得到file对象
        File file = new File(realPath + filename);
        if (file.exists() && file.isFile()){
            //设置相应类型（浏览器无法使用魔种方式或激活某个程序来处理的类型
            resp.setContentType("application/x-msdownload");
            //设置头信息
            resp.setHeader("Content-Disposition", "attachment;filename = " + filename);
            //得到输入流
            InputStream is = new FileInputStream(file);
            //得到输出流
            ServletOutputStream outputStream = resp.getOutputStream();
            //定义byte数组
            byte[] car = new byte[1024];
            //定义长度
            int len = 0;
            //循环输出
            while ((len = is.read(car))!= -1){
                outputStream.write(car,0,len);
            }
            //关闭流
            outputStream.close();
            is.close();

        }
    }
}
