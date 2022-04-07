package com.training.model;

public class BankAccount {
private int accountNumber;
private String accountHolderName;
private double balance;
private String accountType;
public double getAccountType() {
	return accountType;
}
public void setAccountType(double accountType) {
	this.accountType = accountType;
}
public BankAccount(int accountNumber, String accountHolderName, BankAccount account, BankAccount account2) {
	super();
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.balance = account;
	this.accountType = account2;
}
public BankAccount(int accountNumber, String accountHolderName, double balance) {
	super();
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
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
public BankAccount() {
	super();
	// TODO Auto-generated constructor stub
}
public BankAccount(int accountNumber2, String accountHolderName2, double balance2, String accountType2) {
	// TODO Auto-generated constructor stub
}
public int BankAccount() {
	// TODO Auto-generated method stub
	return 0;
}

}
