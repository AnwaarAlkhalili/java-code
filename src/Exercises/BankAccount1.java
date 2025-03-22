package Exercises;

public class BankAccount1 {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Exception class for insufficient funds
    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    // Exception class for invalid amounts
    public static class InvalidAmountException extends Exception {
        public InvalidAmountException(String message) {
            super(message);
        }
    }

    public BankAccount1(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero!");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public String getAccountInfo() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance;
    }
}
