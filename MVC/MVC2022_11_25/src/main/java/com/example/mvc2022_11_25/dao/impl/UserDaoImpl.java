package com.example.mvc2022_11_25.dao.impl;

import com.example.mvc2022_11_25.dao.UserDao;
import com.example.mvc2022_11_25.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
//    public int insertUser() {
//        String sql = "insert into emp value (1,'a')";
//        Connection connection = null;
//        try {
//            connection = DBUtils.getConnection();
//            connection.setAutoCommit(false);
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.addBatch();
//            preparedStatement.executeBatch();
//            connection.commit();
//        } catch (Exception e) {
//            try {
//                connection.rollback();
//            } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            }
//
//        }finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        return 0;
//    }
    public int insertUser() throws Exception {
        String sql = "insert into emp value (1,'haha','h','123123','2020-1-1','haha')";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.execute();
        System.out.println("添加成功");
        return 0;
    }
}
