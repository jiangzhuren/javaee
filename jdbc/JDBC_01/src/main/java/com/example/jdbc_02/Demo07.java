package com.example.jdbc_02;

import com.example.jdbc_02.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) throws Exception{
        PreparedStatement ps = null ;
        ResultSet resultSet = null;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入页数");
        int page = in.nextInt();
        System.out.println("请输入当前也的条数");
        int count = in.nextInt();

        try(Connection connection = DBUtils.getConnection()){
            //查询语句
             String sql = " select * from emp limit ?,?";
             ps = connection.prepareStatement(sql);
            ps.setInt(1,(page-1*count));
            ps.setInt(2,count);
            resultSet = ps.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("emane");
                String sex  = resultSet.getString("sex");
            }

        }finally {
            DBUtils.close(null,ps,resultSet);
        }
    }
}
