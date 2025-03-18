/*
 * Create a class name SAVINACCOUNT with attributes ACCOUNTNUMBER, NAME, ROI, AND AMOUNT 
 * create a method calculate inside this class and return the total amount after one year.
 * 
 * 
 */
package com.training.bank;

public class SavingAccount extends Account implements PrimaryAccount {
	
	//Attributes
	private double roi;
	private double minBalance;

	public Saving
	
	//create constructor
	public SavingAccount(int accountNumber, String accountHoldNumber, double roi, double amount) {
		super(accountNumber,accountHolderName, roi)
		this.roi = roi;
		this.minBalance = minBalance;
	}
	
public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	//Behaviour
	public double calculate(double amount,double roi) {
		return amount + (amount * roi/100);
		
	}

	@Override
	public String display() {
		return super.display()+ ", Minimum Balance:" +this.minBalance;
	}
	//Method Override
	public String display(int roi) {
		return "Overloaded method";
	}
	
	@Override
	public double calculateTotalAmount() {
		
	}
	
}
