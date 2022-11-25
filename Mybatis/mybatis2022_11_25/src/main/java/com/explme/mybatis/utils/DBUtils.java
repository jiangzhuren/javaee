package com.explme.mybatis.utils;

import org.apache.commons.dbcp.BasicDataSource;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    public static Connection getConnection() throws Exception {
        InputStream resourceAsStream = DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties ps = new Properties();
        ps.load(resourceAsStream);
        String driver = ps.getProperty("jdbc.driver");
        String url = ps.getProperty("jdbc.url");
        String username = ps.getProperty("jdbc.username");
        String password = ps.getProperty("jdbc.password");
        BasicDataSource basicDataSource = new BasicDataSource() ;
        basicDataSource.setDriverClassName(driver);
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        Connection connection = basicDataSource.getConnection();
        return connection;
    }
}
