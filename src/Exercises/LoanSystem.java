package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

import Exercises.LoanExceptions.InsufficientBalanceException;
import Exercises.LoanExceptions.InvalidLoanAmountException;
import Exercises.LoanExceptions.InvalidPaymentException;
import Exercises.LoanExceptions.LoanNotFoundException;

public class LoanSystem {
 private static ArrayList<Loan> loans = new ArrayList<>();
 private static Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
     while (true) {
         System.out.println("\nChoose an operation:");
         System.out.println("1. Add a new loan");
         System.out.println("2. Make a payment");
         System.out.println("3. Show loan info");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         switch (choice) {
             case 1:
                 addNewLoan();
                 break;
             case 2:
                 makePayment();
                 break;
             case 3:
                 showLoanInfo();
                 break;
             case 4:
                 System.out.println("Exiting system...");
                 return;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }

 private static void addNewLoan() {
     try {
         System.out.print("Enter loan number: ");
         int loanNumber = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         System.out.print("Enter borrower name: ");
         String borrowerName = scanner.nextLine();

         System.out.print("Enter customer ID: ");
         int customerID = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         System.out.print("Enter loan amount: ");
         double loanAmount = scanner.nextDouble();
         scanner.nextLine(); // Consume newline

         Loan loan = new Loan(loanNumber, borrowerName, customerID, loanAmount);
         loans.add(loan);
         System.out.println("Loan added successfully.");
     } catch (InvalidLoanAmountException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }

 private static void makePayment() {
     try {
         System.out.print("Enter loan number: ");
         int loanNumber = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         Loan loan = findLoanByNumber(loanNumber);
         if (loan == null) {
             throw new LoanNotFoundException("Loan not found.");
         }

         System.out.print("Enter payment amount: ");
         double amount = scanner.nextDouble();
         scanner.nextLine(); // Consume newline

         loan.makePayment(amount);
     } catch (InvalidPaymentException | InsufficientBalanceException | LoanNotFoundException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }

 private static void showLoanInfo() {
     try {
         System.out.print("Enter loan number: ");
         int loanNumber = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         Loan loan = findLoanByNumber(loanNumber);
         if (loan == null) {
             throw new LoanNotFoundException("Loan not found.");
         }

         loan.displayLoanInfo();
     } catch (LoanNotFoundException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }

 private static Loan findLoanByNumber(int loanNumber) {
     for (Loan loan : loans) {
         if (loan.getLoanNumber() == loanNumber) {
             return loan;
         }
     }
     return null;
 }
}
