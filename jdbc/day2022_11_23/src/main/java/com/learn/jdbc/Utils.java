package com.learn.jdbc;

import org.apache.commons.dbcp.BasicDataSource;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.stream.Stream;

public class Utils {
    public static Connection getConnection() throws Exception{
        String driver;
        String url;
        String username;
        String password;
        BasicDataSource basicDataSource = null;
        InputStream resourceAsStream = Utils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        driver = properties.getProperty("driver");
        System.out.println(driver);
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        basicDataSource.setDriverClassName(driver);
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        Connection connection = basicDataSource.getConnection();
        return connection;
    }

    public static void close(Connection connection, Statement statement){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
