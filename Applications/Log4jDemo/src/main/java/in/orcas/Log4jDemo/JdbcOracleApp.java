package in.orcas.Log4jDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class JdbcOracleApp {

    private static Logger logger = Logger.getLogger(JdbcOracleApp.class);
    
    static {
        SimpleLayout layout = new SimpleLayout();
        ConsoleAppender appender = new ConsoleAppender(layout);
        logger.addAppender(appender);
        logger.setLevel(Level.ALL);
    }

    public static void main(String[] args) {

        logger.debug("Control entering main()");

        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            logger.debug("Oracle JDBC Driver loaded successfully");

            String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // update as per your setup
            String user = "practice"; // replace with Oracle username
            String password = "1234"; // replace with Oracle password

            connection = DriverManager.getConnection(url, user, password);
            logger.info("Connection established successfully");

            String query = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, 1001);
            pstmt.setString(2, "Anil");
            pstmt.setDouble(3, 65000.00);
 
    
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                logger.info("Record inserted successfully into employees table");
            }

        } catch (ClassNotFoundException e) {
            logger.error("Oracle JDBC Driver not found", e);
        } catch (SQLException e) {
            logger.error("SQL Exception occurred", e);
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
                logger.info("Resources closed");
            } catch (SQLException e) {
                logger.error("Exception while closing resources", e);
            }
        }
    }
}
