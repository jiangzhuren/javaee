package com.example.java_mvc.web;

import com.example.java_mvc.pojo.User;
import com.example.java_mvc.service.UserService;
import com.example.java_mvc.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;


/**
 *
 * 1.获取前端请求数据
 * 2.传递给service层，service层依据数据做业务
 * 3.控制层获取service处理结果
 * 4.控制层将获取的数据转移给view层，才可以解析数据
 */

@WebServlet("/users")
public class UserServlet extends HttpServlet     {
    //控制层依赖于业务层
    private UserService userService = new UserServiceImpl();




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //1.获取前端的请求数据

        //2.传递给service层
        List<User> users =userService.findUserAll();

        //3.控制层获取service层的处理结果（是否成功做判断）
        if (users == null){
            throw new RuntimeException("没查到数据 ");
        }
        //4.控制层将获取的数据转移给VIEW 层，数据转发的形式传递给下一个view




    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }




}
