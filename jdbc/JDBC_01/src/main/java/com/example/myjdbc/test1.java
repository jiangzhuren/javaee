package com.example.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test1 {
    public static void main(String[] args) throws Exception{

        String sql = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("");
        Statement statement = connection.createStatement();
        statement.execute(sql);
        connection.close();
    }
}
