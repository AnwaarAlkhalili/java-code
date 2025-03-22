package Exercises;
public class CustomExceptions {

 // Exception for insufficient funds
 public static class InsufficientFundsException extends Exception {
     public InsufficientFundsException(String message) {
         super(message);
     }
 }

 // Exception for invalid deposit or withdrawal amount
 public static class InvalidAmountException extends Exception {
     public InvalidAmountException(String message) {
         super(message);
     }
 }
}
