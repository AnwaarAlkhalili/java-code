package com.training.assessment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAuthentication {

    // Method to validate login credentials (username and password)
    public boolean login(Connection connection, String username, String password) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username); // Set the username in the SQL query
            pstmt.setString(2, password); // Set the password in the SQL query
            ResultSet rs = pstmt.executeQuery(); // Execute the query
            return rs.next(); // If a matching user is found, return true
        }
    }

    // Method to register a new user with username and password
    public void register(Connection connection, String username, String password) throws SQLException {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username); // Set the username in the SQL query
            pstmt.setString(2, password); // Set the password in the SQL query
            pstmt.executeUpdate(); // Execute the insert query
            System.out.println("User registered successfully."); // Print success message
        }
    }
}
