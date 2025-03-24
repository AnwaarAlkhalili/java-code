package com.training.assessment;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection();  // Establishing database connection
             Scanner scanner = new Scanner(System.in)) {  // Scanner for user input

            UserAuthentication auth = new UserAuthentication();  // Create instance of UserAuthentication
            BankSystem bankSystem = new BankSystem();  // Create instance of BankSystem
            boolean loggedIn = false;  // Flag to track if user is logged in

            System.out.println("=== Welcome to the Banking System ===");

            while (!loggedIn) {  // Loop until the user is logged in
                System.out.println("\n1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();  // Read user choice
                scanner.nextLine();  // Consume newline character
                switch (choice) {
                    case 1:
                        System.out.print("Enter Username: ");
                        String username = scanner.nextLine();  // Read username
                        System.out.print("Enter Password: ");
                        String password = scanner.nextLine();  // Read password
                        if (auth.login(connection, username, password)) {  // Validate login credentials
                            System.out.println("Login successful!");  // If valid, login successful
                            loggedIn = true;  // Set loggedIn flag to true
                        } else {
                            System.out.println("Invalid username or password. Try again.");  // If invalid, show error
                        }
                        break;

                    case 2:
                        System.out.print("Choose a Username: ");
                        String newUser = scanner.nextLine();  // Read new username
                        System.out.print("Choose a Password: ");
                        String newPassword = scanner.nextLine();  // Read new password
                        auth.register(connection, newUser, newPassword);  // Register the new user
                        break;

                    case 3:
                        System.out.println("Exiting system. Thank you!");  // Exit message
                        return;  // Exit the program

                    default:
                        System.out.println("Invalid choice. Please try again.");  // Invalid choice
                }
            }

            // After login, user can access banking menu
            boolean exit = false;  // Flag for exiting the banking menu
            while (!exit) {
                System.out.println("\n=== Banking System Menu ===");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Check Balance");
                System.out.println("5. Logout");
                System.out.print("Enter your choice: ");

                int menuChoice = scanner.nextInt();  // Read banking menu choice
                switch (menuChoice) {
                    case 1:
                        System.out.print("Enter Account Number: ");
                        int accountNumber = scanner.nextInt();  // Read account number
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter Account Holder Name: ");
                        String accountHolder = scanner.nextLine();  // Read account holder name
                        System.out.print("Enter Initial Balance: ");
                        double balance = scanner.nextDouble();  // Read initial balance
                        bankSystem.createAccount(connection, accountNumber, accountHolder, balance);  // Create account
                        break;

                    case 2:
                        System.out.print("Enter Account Number: ");
                        int accDeposit = scanner.nextInt();  // Read account number for deposit
                        System.out.print("Enter Amount to Deposit: ");
                        double depositAmount = scanner.nextDouble();  // Read deposit amount
                        bankSystem.deposit(connection, accDeposit, depositAmount);  // Perform deposit
                        break;

                    case 3:
                        System.out.print("Enter Account Number: ");
                        int accWithdraw = scanner.nextInt();  // Read account number for withdrawal
                        System.out.print("Enter Amount to Withdraw: ");
                        double withdrawAmount = scanner.nextDouble();  // Read withdrawal amount
                        try {
                            bankSystem.withdraw(connection, accWithdraw, withdrawAmount);  // Perform withdrawal
                        } catch (BankExceptions e) {
                            System.out.println("Error: " + e.getMessage());  // Handle error if withdrawal fails
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account Number: ");
                        int accCheck = scanner.nextInt();  // Read account number for balance check
                        bankSystem.checkBalance(connection, accCheck);  // Check balance
                        break;

                    case 5:
                        exit = true;  // Exit the banking menu
                        loggedIn = false;  // Set loggedIn flag to false
                        System.out.println("Logged out successfully.");  // Log out message
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");  // Invalid choice
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  // Catch and print errors
        }
    }
}



//import java.sql.Connection;
//
//public class Main {
//    public static void main(String[] args) {
//        try (Connection connection = DatabaseConnection.getConnection()) {
//            BankSystem bankSystem = new BankSystem();
//            
//            // Create an account
//            //bankSystem.createAccount(connection, 12346, "Anwaar", 1000.00);
//            
//            // Deposit money into the account
//           // bankSystem.deposit(connection, 12345, 500.00);
//            
//            // Withdraw money from the account
//            //bankSystem.withdraw(connection, 12345, 200.00);
//            
//            // Check balance
//            bankSystem.checkBalance(connection, 12345);
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}
