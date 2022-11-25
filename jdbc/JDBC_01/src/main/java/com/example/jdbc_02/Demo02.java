//package com.example.jdbc_02;
//
//
//import com.example.jdbc_01.Demo01;
//import org.junit.Test;
//
//import java.sql.*;
//
//public class Demo02 {
//    // 增加操作
//        @Test
//    public void insert() throws ClassNotFoundException, SQLException {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(Demo01.url, Demo01.username, Demo01.password);
//            Statement statement = connection.createStatement();
//            String sql = "insert into emp value(2,'张三','m','1.1','2020.1.1','草屋')";
//            statement.executeUpdate(sql);
//            connection.close();
//            System.out.println("增加完毕");
//        }
//        @Test
//    public void update() throws ClassNotFoundException, SQLException {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(Demo01.url, Demo01.username, Demo01.password);
//            Statement statement = connection.createStatement();
//            String sql = "update emp set ename = '呵呵' where eid = 1 ";
//            statement.executeUpdate(sql);
//            connection.close();
//            System.out.println("更新完毕");
//        }
//        @Test
//    public void delete() throws ClassNotFoundException, SQLException {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(Demo01.url, Demo01.username, Demo01.password);
//            Statement statement = connection.createStatement();
//            String sql = "delete  from emp where eid = 1";
//            String sql2 = "insert into emp value(1,'张三','m','1.1','2020.1.1','草屋')";
//            statement.executeUpdate(sql);
//            statement.executeUpdate(sql2);
//            connection.close();
//            System.out.println("删除完成");
//
//        }
//        @Test
//    public void select() throws SQLException, ClassNotFoundException {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(Demo01.url, Demo01.username, Demo01.password);
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery();
//
//
//        }
//
//
//}
