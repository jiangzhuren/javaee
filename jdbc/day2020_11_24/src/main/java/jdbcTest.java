import org.junit.Test;

import java.sql.*;

public class jdbcTest {
    @Test
    public void test() throws  Exception{
        String sql = "insert into emp values (4,?,'m',123,'2020-1-1',?)";
        String sql1 = "select * from emp";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,"haha1");
        preparedStatement.setString(2,"haha2");
        preparedStatement.addBatch();
        preparedStatement.setString(1,"haha3");
        preparedStatement.setString(2,"haha4");
        preparedStatement.addBatch();
        preparedStatement.executeBatch();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql1);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            int salary = resultSet.getInt(4);
            Date date = resultSet.getDate(5);
            String dept_name = resultSet.getString(6);
            System.out.println(id + name + sex + salary + date + dept_name);
        }

        DBUtils.close(connection,preparedStatement);
    }

}
