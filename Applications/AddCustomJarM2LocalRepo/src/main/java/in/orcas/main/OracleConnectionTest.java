package in.orcas.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnectionTest {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl"; // or use service name like: @//localhost:1521/orclpdb1
        String username = "practice";
        String password = "1234";

        try {
            // Connect to the Oracle DB
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("✅ Connected to Oracle Database!");

            // Run a test query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT 'Hello from Oracle!' AS message FROM dual");

            while (rs.next()) {
                System.out.println("Message: " + rs.getString("message"));
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
