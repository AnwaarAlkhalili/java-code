package Exercises;

public class Loan {
 private String loanNumber;
 private String borrowerName;
 private double loanAmount;
 private double remainingBalance;

 public Loan(String loanNumber, String borrowerName, double loanAmount) {
     this.loanNumber = loanNumber;
     this.borrowerName = borrowerName;
     this.loanAmount = loanAmount;
     this.remainingBalance = loanAmount;
 }

 public String getLoanNumber() {
     return loanNumber;
 }

 public String getBorrowerName() {
     return borrowerName;
 }

 public double getRemainingBalance() {
     return remainingBalance;
 }

 public void makePayment(double amount) throws Exception {
     if (amount <= 0) {
         throw new Exception("Payment amount must be greater than zero.");
     }
     if (amount > remainingBalance) {
         throw new Exception("Payment amount exceeds the remaining balance.");
     }
     remainingBalance -= amount;
     System.out.println("Payment successful. Remaining balance: " + remainingBalance);
 }

 public void displayLoanInfo() {
     System.out.println("Loan Number: " + loanNumber);
     System.out.println("Borrower Name: " + borrowerName);
     System.out.println("Loan Amount: " + loanAmount);
     System.out.println("Remaining Balance: " + remainingBalance);
 }
}
