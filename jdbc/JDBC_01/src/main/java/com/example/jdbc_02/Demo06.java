package com.example.jdbc_02;

import com.example.jdbc_02.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo06 {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in );
        System.out.println("请输入用户名");
        String username = in.nextLine();
        System.out.println("请输入性别");
        String sex = in.nextLine();


        try (Connection connection = DBUtils.getConnection()){
//            //statement
//            Statement statement = connection.createStatement();
//            String sql = "select * from emp where ename = '"+username+"' and sex = '"+sex+"';";
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()){
//                String name = resultSet.getString(2);
//                String sex2 = resultSet.getString("sex");
//                System.out.println(name+sex2);
            //preparedStatement
            String sql = "select * from emp where ename = ? and sex = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,sex);
            //执行语句
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString(2);
                String sex2 = resultSet.getString("sex");
                System.out.println(name+sex2);



        }


        }

    }
}
