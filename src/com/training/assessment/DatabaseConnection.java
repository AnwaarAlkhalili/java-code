package com.training.assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class DatabaseConnection {
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException, IOException, ClassNotFoundException {
        if (connection == null || connection.isClosed()) {
            Properties props = new Properties();
            FileInputStream input = new FileInputStream("db.properties");
            props.load(input);
            String url = props.getProperty("db.url");
            String username = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}

