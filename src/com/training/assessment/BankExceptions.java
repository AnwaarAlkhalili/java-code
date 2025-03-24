package com.training.assessment;

public class BankExceptions extends Exception {
    public BankExceptions() {
        super("An error occurred in the banking system.");
    }

    public BankExceptions(String message) {
        super(message);
    }

    public BankExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public BankExceptions(Throwable cause) {
        super(cause);
    }
}
