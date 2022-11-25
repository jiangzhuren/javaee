import org.apache.commons.dbcp.BasicDataSource;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class utils {
    public static Connection getConnection() throws Exception{
        InputStream resourceAsStream = utils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties ps = new Properties();
        ps.load(resourceAsStream);
        String driver = ps.getProperty("jdbc.driver");
        String url = ps.getProperty("jdbc.url");
        String username = ps.getProperty("jdbc.username");
        String password = ps.getProperty("jdbc.password");
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(driver);
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        Connection connection = basicDataSource.getConnection();


        return connection;
    }
}
