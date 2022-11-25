package com.example.jdbc_02;

import com.example.jdbc_01.Demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUtils {

public static Object getConnection() throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(Demo01.url, Demo01.username, Demo01.password);
    return connection;


}
}
