package com.example.day20201123;

import com.example.utils.dbutils;
import org.junit.Test;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class jdbc {
    @Test
    public void test1() throws Exception{
        String sql = "";
        InputStream resourceAsStream = jdbc.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties ps = new Properties();
        ps.load(resourceAsStream);
        String driveClassName = ps.getProperty("driveClassName");
        String url = ps.getProperty("url");
        String username = ps.getProperty("username");
        String password = ps.getProperty("password");
        Class.forName("driverClassName");
        Connection connection = DriverManager.getConnection(url,username,password);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.addBatch();
        preparedStatement.executeBatch();
        connection.close();
        resourceAsStream.close();
    }
    @Test
    public void test2() throws Exception{
        String sql = "";
        Connection connection = dbutils.getConnection();
        PreparedStatement pre = connection.prepareStatement(sql);
        pre.addBatch();
        pre.executeBatch();


    }
}
