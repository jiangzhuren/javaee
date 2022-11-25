package com.example.jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
    public static String url = "jdbc:mysql://localhost:3306/jdbc?userUnicode=true&characterEncoding=UTF-8";
    public static String username = "root";
    public static String password = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册 驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接（数据库连接对象）

        /**
         *
         * url :mysql 服务器地址
         * username ：
         * password
         */

//        DriverManager.getConnection("localhost:3306","root","root");
        Connection connection = DriverManager.getConnection(url, username, password);

        //3.sql语句操作(创建表)  创建一个statement  对象
        Statement statement = connection.createStatement();
        //将sql语句statement对象绑定，
        String sql = "create table emp( " +
                "eid int , " +
                "ename varchar(20)," +
                "sex char(1)," +
                "salary double," +
                "hire_date date," +
                "dept_name varchar(20)" +
                ")";
        String sql2 = "insert into emp value (1,'哈啊哈','m','12.1','2020.1.1','你好');";

        //4.执行sql语句  statement执行sql语句
//        statement.execute(sql);
        statement.executeUpdate(sql2);
        //5.关闭资源
        connection.close();
        System.out.println("执行完毕");


    }
}
