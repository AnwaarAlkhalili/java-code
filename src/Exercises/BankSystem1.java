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
import java.util.Scanner;

public class BankSystem1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Creating a bank account instance
     BankAccount1 account = new BankAccount1("12345", "Anwaar", 5000.0);

     while (true) {
         // Display menu options
         System.out.println("\nChoose an operation:");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Show Account Info");
         System.out.println("4. Exit");

         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

         try {
             switch (choice) {
                 case 1:
                     System.out.print("Enter deposit amount: ");
                     double depositAmount = scanner.nextDouble();
                     account.deposit(depositAmount);
                     break;
                 case 2:
                     System.out.print("Enter withdrawal amount: ");
                     double withdrawAmount = scanner.nextDouble();
                     account.withdraw(withdrawAmount);
                     break;
                 case 3:
                     account.showAccountInfo();
                     break;
                 case 4:
                     System.out.println("Exiting system...");
                     scanner.close();
                     return;
                 default:
                     System.out.println("Invalid choice! Please select a valid option.");
             }
         } catch (CustomExceptions.InsufficientFundsException | CustomExceptions.InvalidAmountException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
 }
}
