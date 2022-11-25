import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbc {
    @Test
    public void jdbcTest() throws Exception{
        String sql  = "select * from emp";
        Connection connection = utils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String string = resultSet.getString(1);
            String string1 = resultSet.getString(2);
            System.out.println(string + string1);
        }
    }
    @Test
    public void commitTest() throws Exception{
        Connection connection = null;
        try {
            String sql = "insert into emp value(1,'haha')";
            connection = utils.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            System.out.println("执行回滚程序");
        }finally {
            connection.close();
        }


    }
}
