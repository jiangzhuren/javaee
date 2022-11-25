import org.apache.commons.dbcp.BasicDataSource;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.stream.Stream;


public class DBUtils {
    public static Connection getConnection() throws Exception{
        BasicDataSource basicDataSource = new BasicDataSource();
        InputStream resourceAsStream = DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties ps = new Properties();
        ps.load(resourceAsStream);
        String driver = ps.getProperty("driver");

        String url = ps.getProperty("url");

        String username = ps.getProperty("username");
        String password = ps.getProperty("password");
        basicDataSource.setDriverClassName(driver);
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        Connection connection = basicDataSource.getConnection();
        return connection;
    }
    public static void close(Connection connection, PreparedStatement stream) throws Exception{
        if (connection != null){
            connection.close();
        }
        if (stream != null){
            stream.close();
        }

    }

}
