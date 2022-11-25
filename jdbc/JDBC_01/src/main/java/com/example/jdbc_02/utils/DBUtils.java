package com.example.jdbc_02.utils;


import org.apache.commons.dbcp.BasicDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 *
 *
 *
 * 1.数据库的配置信息放在一个外部文件，jdbc.properties
 * 2.封装方法：
 *      1.获取链接方法
 *      2.关闭连接方法
 *      3.静态代码块
 */
public class DBUtils {
    //声明全局变量（存储数据库配置信息）
    private static String driverClassname;
    private static String url;
    private static String username;
    private static String password;
    private static String initialSize;
    private static String maxActive;
    private static String minIdle;
    private static String maxIdle;
    //DBCP连接池
    private static BasicDataSource dataSource;
    //静态代码块初始化,读取文件的数据然后赋值给上面的变量
    static {
        dataSource = new BasicDataSource();
        InputStream inputStream = DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        try {
            //输入流数据加载到properties对象
            properties.load(inputStream);
            driverClassname = properties.getProperty("driverClassName");
             url = properties.getProperty("url");
             username = properties.getProperty("username");
             password = properties.getProperty("password");
             //将变量值通过数据源兑现赋值给dataSoure
            dataSource.setDriverClassName(driverClassname);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //关闭inputStream流
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    //封装数据库的连接对象
    public static Connection getConnection() throws Exception{
        return dataSource.getConnection();
    }

    //关闭数据库资源(Connection Statement ResultSet)
    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws Exception {
        if (connection != null){
            connection.close();
        }
        if (statement != null){
            statement.close();
        }
        if (resultSet != null){
            resultSet.close();
        }

    }


}
