package com.training.reportservice.model;

public class AccountSummary {
    private Long accountId;
    private double balance;

    // Constructors
    public AccountSummary() {}

    public AccountSummary(Long accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    // Getters and Setters
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

