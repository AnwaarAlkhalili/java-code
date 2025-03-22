package Exercises;


import java.util.ArrayList;
import java.util.Scanner;

public class LoanSystem {
 private ArrayList<Loan> loans = new ArrayList<>();
 private Scanner scanner = new Scanner(System.in);

 public void addLoan(String loanNumber, String borrowerName, double loanAmount) {
     Loan newLoan = new Loan(loanNumber, borrowerName, loanAmount);
     loans.add(newLoan);
     System.out.println("Loan added successfully.");
 }

 public void showLoanInfo() {
     System.out.print("Enter loan number: ");
     String loanNumber = scanner.nextLine();  // Reading loan number as String
     boolean found = false;
     for (Loan loan : loans) {
         if (loan.getLoanNumber().equals(loanNumber)) {
             loan.displayLoanInfo();
             found = true;
             break;
         }
     }
     if (!found) {
         System.out.println("Loan not found.");
     }
 }

 public void makePayment() {
     System.out.print("Enter loan number: ");
     String loanNumber = scanner.nextLine();  // Reading loan number as String
     boolean found = false;
     for (Loan loan : loans) {
         if (loan.getLoanNumber().equals(loanNumber)) {
             System.out.print("Enter payment amount: ");
             double paymentAmount = scanner.nextDouble();
             scanner.nextLine(); // Clear the buffer
             try {
                 loan.makePayment(paymentAmount);
             } catch (Exception e) {
                 System.out.println("Error: " + e.getMessage());
             }
             found = true;
             break;
         }
     }
     if (!found) {
         System.out.println("Loan not found.");
     }
 }

 public static void main(String[] args) {
     LoanSystem loanSystem = new LoanSystem();
     Scanner scanner = new Scanner(System.in);

     while (true) {
         System.out.println("\nChoose an operation:");
         System.out.println("1. Add a new loan");
         System.out.println("2. Make a payment");
         System.out.println("3. Show loan info");
         System.out.println("4. Exit");

         int choice = scanner.nextInt();
         scanner.nextLine();  // Clear the buffer

         switch (choice) {
             case 1:
                 System.out.print("Enter loan number: ");
                 String loanNumber = scanner.nextLine();
                 System.out.print("Enter borrower name: ");
                 String borrowerName = scanner.nextLine();
                 System.out.print("Enter loan amount: ");
                 double loanAmount = scanner.nextDouble();
                 scanner.nextLine(); // Clear the buffer
                 loanSystem.addLoan(loanNumber, borrowerName, loanAmount);
                 break;
             case 2:
                 loanSystem.makePayment();
                 break;
             case 3:
                 loanSystem.showLoanInfo();
                 break;
             case 4:
                 System.out.println("Exiting program...");
                 return;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }
}
