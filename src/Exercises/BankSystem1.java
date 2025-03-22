/*
 * Write a Java program to manage bank accounts using exceptions and an ArrayList. 
 * The program should include the following operations:
 * 1. Deposit an amount into the account.
 * 2. Withdraw an amount from the account.
 * 3.Display account information 
 * (such as account number, account holder's name, and balance).
 * 4. Ensure there are sufficient funds for withdrawal.
 * 5. Handle exceptions such as invalid input amount or attempting 
 * to withdraw more than the available balance.
 * 
 * The program should be able to handle multiple bank accounts using an ArrayList 
 * and a BankAccount1 class, with a user interface that allows data input through
 *  the console (using Scanner).
 * 
 */
package Exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount1> accounts = new ArrayList<>();

        // Ask user for account details
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        // Create a new account
        BankAccount1 account = new BankAccount1(accountNumber, accountHolder, balance);
        accounts.add(account);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Account Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                } else if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                } else if (choice == 3) {
                    System.out.println(account.getAccountInfo());
                } else if (choice == 4) {
                    System.out.println("Exiting... Thank you!");
                    break;
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }
            } catch (BankAccount1.InvalidAmountException | BankAccount1.InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

