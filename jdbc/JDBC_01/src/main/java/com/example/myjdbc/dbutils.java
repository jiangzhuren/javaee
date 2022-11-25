package com.example.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbutils {



    public static Connection getConnection() throws Exception{
        Class.forName("1");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?userUnicode=true&characterEncoding=UTF-8","root","root");
        return connection;
    }
}
