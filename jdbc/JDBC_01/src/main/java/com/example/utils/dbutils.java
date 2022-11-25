package com.example.utils;


import org.apache.commons.dbcp.BasicDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.stream.Stream;

public class dbutils {
    public static String driverName;
    public static String url;
    public static String username;
    public static String password;
    public static Connection getConnection() {
        Connection connection = null;
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = dbutils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            driverName = properties.getProperty("driverClassName");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName(driverName);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            connection = dataSource.getConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                resourceAsStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return connection;
    }
    public void getClose(Connection connection , Stream stream , ResultSet resultSet) throws Exception{
        if (connection != null){
            connection.close();
        }
        if (stream != null){
            stream.close();
        }
        if(resultSet != null){
            resultSet.close();
        }

    }
}