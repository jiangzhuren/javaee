package com.example.myjdbc2;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class jdbcTest {
    String driverName="com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/jdbc?userUnicode=true&characterEncoding=UTF-8";
    String username  = "root";
    String password = "root";
    String sql = "insert into emp value (123,'测试','男','2000','2020-10-11','保卫科')";

    String preparsql = "select * from emp where eid = ?" ;
    // 基本jdbc
    @Test
    public void jdbc() throws Exception {
        Class.forName(driverName);
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("插入成功");
        connection.close();
    }
    //工具类 普通创建Conection 创建普通Statement对象 jdbc
    @Test
    public void jdbc0() throws Exception{
        Connection connectionCommon = DBUtils.getConnectionCommon();
        Statement statement = connectionCommon.createStatement();
        statement.executeUpdate(sql);
        connectionCommon.close();
    }
    //工具类 连接池创建Connection 创建perparedStament对象 批量处理sql语句 jdbc
    @Test
    public void jdbc1() throws Exception{
        Connection connectionPropertiesBasicdataSource = DBUtils.getConnectionPropertiesBasicdataSource();
        PreparedStatement ps = connectionPropertiesBasicdataSource.prepareStatement(preparsql);
        ps.setString(1,"1");
        ps.addBatch();
        ps.executeBatch();
        connectionPropertiesBasicdataSource.close();


    }
}
