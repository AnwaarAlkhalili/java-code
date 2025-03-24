package com.training.assessment;

import java.sql.Connection;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection();
             Scanner scanner = new Scanner(System.in)) {

            BankSystem bankSystem = new BankSystem();
            boolean exit = false;

            while (!exit) {
                System.out.println("\n=== Banking System Menu ===");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Check Balance");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Account Number: ");
                        int accountNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Account Holder Name: ");
                        String accountHolder = scanner.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double balance = scanner.nextDouble();
                        bankSystem.createAccount(connection, accountNumber, accountHolder, balance);
                        break;

                    case 2:
                        System.out.print("Enter Account Number: ");
                        int accDeposit = scanner.nextInt();
                        System.out.print("Enter Amount to Deposit: ");
                        double depositAmount = scanner.nextDouble();
                        bankSystem.deposit(connection, accDeposit, depositAmount);
                        break;

                    case 3:
                        System.out.print("Enter Account Number: ");
                        int accWithdraw = scanner.nextInt();
                        System.out.print("Enter Amount to Withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        try {
                            bankSystem.withdraw(connection, accWithdraw, withdrawAmount);
                        } catch (BankExceptions e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account Number: ");
                        int accCheck = scanner.nextInt();
                        bankSystem.checkBalance(connection, accCheck);
                        break;

                    case 5:
                        exit = true;
                        System.out.println("Exiting system. Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
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
