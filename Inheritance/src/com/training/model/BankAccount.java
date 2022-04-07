package com.training.model;

public class BankAccount {
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
private int accountNumber;
private String accountHolderName;
private double balance;
private String accountType;
public BankAccount() {
	super();
	System.out.println("THREE Arg constructor of SUPER CLASS Called");
}
public BankAccount(int accountNumber, String accountHolderName, BankAccount account, BankAccount account2, String nominee) {
	super();
	System.out.println("Four Arg constructor of SUPPER CLASS Called");
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	this.accountType = accountType;

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
public BankAccount(int accountNumber2, String accountHolderName2, double balance2, String accountType2) {
	// TODO Auto-generated constructor stub
}
public int BankAccount() {
	// TODO Auto-generated method stub
	return 0;
}

}
