package com.training.reportservice.model;

import java.util.List;

public class AccountStatement {
    private Long accountId;
    private List<String> transactions;

    // Constructors
    public AccountStatement() {}

    public AccountStatement(Long accountId, List<String> transactions) {
        this.accountId = accountId;
        this.transactions = transactions;
    }

    // Getters and Setters
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
}

