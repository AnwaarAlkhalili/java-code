//package com.training.jdbc;
//
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Properties;
//
//public class JdbcDemo {
//
//	public static void main(String[] args) {
//		
		   // String url = jdbc:oracle:thin:@localhost:1521:FREE
//		    String url = "jdbc:postgresql://localhost:5432/postgres";
//	        String username = "postgres";
//	        String password = "pass123";
		
//		
//			try {
//				Properties props = new Properties();
//				FileInputStream input = new FileInputStream("db.properties");
//				props.load(input);
//				String url = props.getProperty("db.url");
//				String username = props.getProperty("db.user");
//				String password = props.getProperty("db.password");
//				
//				
//			  Class.forName("org.postgresql.Driver");
//	        // Connect to the database
//	          Connection connection = DriverManager.getConnection(url, username, password);
//	          
//	          //Statement stmt = connection.createStatement();
//	          
//	          PreparedStatement pstmt =connection.prepareStatement("Select * from employees where empName=?");
//	          pstmt.setString(1, "Anwaar");
//	          ResultSet rs = pstmt.executeQuery();
//	          
//	          //ResultSet rs = stmt.executeQuery("Select * from employees where empName=?");
//	          while (rs.next()) {
//	        	  System.out.println("ID:"+ rs.getInt(1)+ "Name:"+ rs.getString(2));
//	        	  }
//	          
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//	}  
//
//}

package com.training.jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcDemo {

    // الاتصال بقاعدة البيانات
    public static Connection getConnection() {
        try {
            Properties props = new Properties();
            FileInputStream input = new FileInputStream("db.properties");
            props.load(input);

            String url = props.getProperty("db.url");
            String username = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            Class.forName("org.postgresql.Driver"); // إذا كنت تستخدم PostgreSQL
            return DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.out.println("Error connecting to the database: " + e);
            return null;
        }
    }

    // إنشاء حساب جديد
    public static void createAccount(String accountNumber, String owner, double initialBalance) {
        String sql = "INSERT INTO bank_account (accountNumber,accountHolderName, balance) VALUES (?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, accountNumber);
            pstmt.setString(2, owner);
            pstmt.setDouble(3, initialBalance);
            pstmt.executeUpdate();
            System.out.println("Account created successfully.");
        } catch (SQLException e) {
            System.out.println("Error during account creation: " + e.getMessage());
        }
    }

    // إيداع الأموال
    public static void depositMoney(String accountNumber, double amount) {
        String sql = "UPDATE bank_account SET balance = balance + ? WHERE accountNumber = ?";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setString(2, accountNumber);
            pstmt.executeUpdate();
            System.out.println("Deposit successful. Amount: " + amount);
        } catch (SQLException e) {
            System.out.println("Error during deposit: " + e.getMessage());
        }
    }

    // سحب الأموال
    public static void withdrawMoney(String accountNumber, double amount) {
        String sql = "UPDATE bank_account SET balance = balance - ? WHERE accountNumber = ?";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setString(2, accountNumber);
            pstmt.executeUpdate();
            System.out.println("Withdrawal successful. Amount: " + amount);
        } catch (SQLException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
        }
    }

    // عرض رصيد الحساب
    public static void checkBalance(String accountNumber) {
        String sql = "SELECT balance FROM bank_account WHERE accountNumber = ?";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, accountNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Balance for account " + accountNumber + ": " + rs.getDouble("balance"));
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error during balance check: " + e.getMessage());
        }
    }

    // دالة main لاختبار جميع الوظائف
    public static void main(String[] args) {
        // 1. إنشاء حساب
        createAccount("123455", "Noor", 1000.0);
        
        // 2. إيداع الأموال
        depositMoney("123455", 500.0);
        
        // 3. سحب الأموال
        withdrawMoney("123455", 200.0);
        
        // 4. عرض الرصيد
        checkBalance("123455");
    }
}
