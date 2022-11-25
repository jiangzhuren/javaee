package com.example.jdbc_02;

import com.example.jdbc_01.Demo01;
import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo05 {
    public static void main(String[] args) throws SQLException {
        //创建一个数据源对象（用来设置连接数据库的配置信息）
        BasicDataSource basicDataSource = new BasicDataSource();
        //设置数据库了解的配置信息
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUrl(Demo01.url);
        basicDataSource.setUsername(Demo01.username);
        basicDataSource.setPassword(Demo01.password);
        //设置最大连接数
        basicDataSource.setMaxActive(5);
        //设置数据据库的初始化连接池的大小
        basicDataSource.setInitialSize(10);
        //ds对象来获取数据库的连接对象
        Connection connection = basicDataSource.getConnection();

        //增删改查


        System.out.println(connection);
    }
}
