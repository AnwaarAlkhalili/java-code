package Exercises;

import Exercises.CustomExceptions.InsufficientFundsException;
import Exercises.CustomExceptions.InvalidAmountException;

public class BankAccount1 {
 private String accountNumber;
 private String accountHolder;
 private double balance;

 // Constructor to initialize account details
 public BankAccount1(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Method to deposit money into the account
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than zero.");
     }
     balance += amount;
     System.out.println("Deposit successful. New balance: " + balance);
 }

 // Method to withdraw money from the account
 public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds! Current balance: " + balance);
     }
     balance -= amount;
     System.out.println("Withdrawal successful. New balance: " + balance);
 }

 // Method to display account information
 public void showAccountInfo() {
     System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance);
 }
}
