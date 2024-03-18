import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    public DatabaseConnector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "password123");
            if(connection.isValid(10)) {
                System.out.println("Connected to database successfully");
            }
        } catch (Exception ex) {
            System.err.println("An error occurred while connecting to the database: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
