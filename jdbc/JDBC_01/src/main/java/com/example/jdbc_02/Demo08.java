package com.example.jdbc_02;

import com.example.jdbc_02.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Demo08 {
    public static void main(String[] args) throws Exception {
        String sql1 = "insert into emp value(3,'test','f',3444,'2020-03-13','财务部')";
        String sql2 = "insert into emp value(3,'test','f',3444,'2020-03-13','财务部')";
        String sql3 = "insert into emp value(3,'test','f',3444,'2020-03-13','财务部')";
        String sql4 = "insert into emp value(3,'test','f',3444,'2020-03-13','财务部')";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql1);
        //添加批处理
        preparedStatement.addBatch(sql1);
        preparedStatement.addBatch(sql2);
        preparedStatement.addBatch(sql3);
        preparedStatement.addBatch(sql4);
        //执行批量操作 操作数据库
        preparedStatement.executeBatch();
        System.out.println("执行完毕");
    }
}