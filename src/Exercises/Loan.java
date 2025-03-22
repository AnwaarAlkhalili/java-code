package Exercises;

import Exercises.LoanExceptions.InsufficientBalanceException;
import Exercises.LoanExceptions.InvalidLoanAmountException;
import Exercises.LoanExceptions.InvalidPaymentException;

public class Loan {
 private int loanNumber;
 private String borrowerName;
 private int customerID;
 private double loanAmount;
 private double remainingBalance;

 public Loan(int loanNumber, String borrowerName, int customerID, double loanAmount) throws InvalidLoanAmountException {
     if (loanAmount <= 0) {
         throw new InvalidLoanAmountException("Loan amount must be greater than zero.");
     }
     this.loanNumber = loanNumber;
     this.borrowerName = borrowerName;
     this.customerID = customerID;
     this.loanAmount = loanAmount;
     this.remainingBalance = loanAmount;
 }

 public int getLoanNumber() {
     return loanNumber;
 }

 public int getCustomerID() {
     return customerID;
 }

 public double getRemainingBalance() {
     return remainingBalance;
 }

 public void makePayment(double amount) throws InvalidPaymentException, InsufficientBalanceException {
     if (amount <= 0) {
         throw new InvalidPaymentException("Payment amount must be greater than zero.");
     }
     if (amount > remainingBalance) {
         throw new InsufficientBalanceException("Payment exceeds the remaining balance.");
     }
     remainingBalance -= amount;
     System.out.println("Payment successful. Remaining balance: " + remainingBalance);
 }

 public void displayLoanInfo() {
     System.out.println("Loan Number: " + loanNumber);
     System.out.println("Borrower Name: " + borrowerName);
     System.out.println("Customer ID: " + customerID);
     System.out.println("Loan Amount: " + loanAmount);
     System.out.println("Remaining Balance: " + remainingBalance);
 }
}
