package com.example.jdbc_02;

import com.example.jdbc_02.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo09 {
    public static void main(String[] args) throws Exception{
        String sql = "insert into emp value(?,'test','f',3444,'2020-03-13','财务部')";
        Connection connection = DBUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        for (int i = 0; i <=11; i++) {
            ps.setInt(1,100+i);
            ps.addBatch();

        }
        ps.executeBatch();

    }
}
