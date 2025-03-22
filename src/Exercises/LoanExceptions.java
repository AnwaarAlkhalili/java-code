package Exercises;

//LoanExceptions.java
public class LoanExceptions {

 // Exception for insufficient balance when making a loan payment
 public static class InsufficientBalanceException extends Exception {
     public InsufficientBalanceException(String message) {
         super(message);
     }
 }

 // Exception for invalid payment amounts
 public static class InvalidPaymentException extends Exception {
     public InvalidPaymentException(String message) {
         super(message);
     }
 }

 // Exception for invalid loan amount
 public static class InvalidLoanAmountException extends Exception {
     public InvalidLoanAmountException(String message) {
         super(message);
     }
 }

 // Exception for loan not found
 public static class LoanNotFoundException extends Exception {
     public LoanNotFoundException(String message) {
         super(message);
     }
 }
}
