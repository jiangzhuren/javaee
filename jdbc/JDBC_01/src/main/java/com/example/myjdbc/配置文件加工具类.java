package com.example.myjdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class 配置文件加工具类 {
    public static Connection getConment() throws IOException, SQLException, ClassNotFoundException {
        InputStream resourceAsStream = 配置文件加工具类.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties pro = new Properties();
        pro.load(resourceAsStream);
        String driverClassName = pro.getProperty("driverClassName");
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        Class.forName(driverClassName);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
