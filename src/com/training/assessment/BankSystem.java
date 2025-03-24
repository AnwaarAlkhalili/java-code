package com.training.assessment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankSystem {

    // Create a new account
    public void createAccount(Connection connection, int accountNumber, String accountHolder, double balance) throws SQLException {
        String sql = "INSERT INTO bank_account (account_number, account_holder, balance) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, accountNumber);
            pstmt.setString(2, accountHolder);
            pstmt.setDouble(3, balance);
            pstmt.executeUpdate();
            System.out.println("Account created successfully.");
        }
    }

    // Deposit money
    public void deposit(Connection connection, int accountNumber, double amount) throws SQLException {
        String sql = "UPDATE bank_account SET balance = balance + ? WHERE account_number = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, accountNumber);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Account not found.");
            }
        }
    }

    // Withdraw money
    public void withdraw(Connection connection, int accountNumber, double amount) throws SQLException, BankExceptions {
        String sql = "SELECT balance FROM bank_account WHERE account_number = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                double currentBalance = rs.getDouble("balance");
                if (currentBalance >= amount) {
                    sql = "UPDATE bank_account SET balance = balance - ? WHERE account_number = ?";
                    try (PreparedStatement updatePstmt = connection.prepareStatement(sql)) {
                        updatePstmt.setDouble(1, amount);
                        updatePstmt.setInt(2, accountNumber);
                        updatePstmt.executeUpdate();
                        System.out.println("Withdrawal successful.");
                    }
                } else {
                    throw new BankExceptions("Insufficient balance.");
                }
            } else {
                System.out.println("Account not found.");
            }
        }
    }

    // Check balance
    public void checkBalance(Connection connection, int accountNumber) throws SQLException {
        String sql = "SELECT balance FROM bank_account WHERE account_number = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Current Balance: " + rs.getDouble("balance"));
            } else {
                System.out.println("Account not found.");
            }
        }
    }
}
