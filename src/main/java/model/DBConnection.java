
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    

    private static final String dbname = "cv_builder";
    private static final String url = "jdbc:mysql://localhost:3306/" + dbname;
    private static final String user = "root";
    private static final String password = "your_password";

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Database Connected Successfully!");
            }
        } catch (Exception e) {
            System.out.println("Database Connection Failed!");
            
        }

        return connection;
    }
    public static void main(String[] args) {
    DBConnection.getConnection();
}
}

