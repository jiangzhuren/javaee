package com.example.myjdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class test2 {
    static String  sql = "";
    public static void main(String[] args) throws Exception{
        Connection connection = dbutils.getConnection();
        Statement statement = connection.createStatement();
        statement.execute(sql);



    }
}
