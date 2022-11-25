package com.learn.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class demo1 {
    @Test
    public void test() throws Exception {
        String sql = "";
        Connection connection = Utils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.addBatch();
        preparedStatement.executeBatch();
        Utils.close(connection,preparedStatement);

    }
}