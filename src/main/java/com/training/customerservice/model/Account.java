package com.training.customerservice.model;

import java.util.UUID;

import lombok.Data;

@Data
public class Account {
	
	private UUID id;	

	private UUID customerId;

	private double balance;

	private String accountType;

	public UUID getId() {

		return id;

	}

	public void setId(UUID id) {

		this.id = id;

	}

	public UUID getCustomerId() {

		return customerId;

	}

	public void setCustomerId(UUID customerId) {

		this.customerId = customerId;

	}

	public double getBalance() {

		return balance;

	}

	public void setBalance(double balance) {

		this.balance = balance;

	}

	public String getAccountType() {

		return accountType;

	}

	public void setAccountType(String accountType) {

		this.accountType = accountType;

	}

}
