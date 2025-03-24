package com.training.assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class DatabaseConnection {
    private static Connection connection = null;

    // Method to get a database connection
    public static Connection getConnection() throws SQLException, IOException, ClassNotFoundException {
        if (connection == null || connection.isClosed()) {
            Properties props = new Properties();
            FileInputStream input = new FileInputStream("db.properties");
            props.load(input);  // Load database properties from the file
            String url = props.getProperty("db.url");
            String username = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            Class.forName("org.postgresql.Driver");  // Load PostgreSQL driver
            connection = DriverManager.getConnection(url, username, password);  // Establish the connection
        }
        return connection;
    }
}
