package com.example.myjdbc2;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtils {

    //普通jdbc  普通驱动连接 工具类连接
    public static Connection getConnectionCommon() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?userUnicode=true&characterEncoding=UTF-8","root","root");
        return connection;

    }
    //properties文件 普通驱动连接 工具类连接
    public static Connection getConnectionProperties() throws Exception{
        DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties ps = new Properties();
        String driverClassName = ps.getProperty("driverClassName");
        String url = ps.getProperty("url");
        String username = ps.getProperty("username");
        String password = ps.getProperty("password");
        Class.forName(driverClassName);
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }
    //properties文件  连接池连接  工具类连接
    public static Connection getConnectionPropertiesBasicdataSource() throws Exception{
        DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties ps = new Properties();
        String driverClassName = ps.getProperty("driverClassName");
        String url = ps.getProperty("url");
        String username = ps.getProperty("username");
        String password = ps.getProperty("password");
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(driverClassName);
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        Connection connection = basicDataSource.getConnection();
        return connection;
    }
}
