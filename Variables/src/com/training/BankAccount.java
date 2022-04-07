package com.training;

public class BankAccount {
	//Static variable
private static int count;
// instance variable
private String accountHolderName;
private double balance;
private int accountNumber;
//static method
public static int getCount() {
	return ++count;
}
//instance method
public double getUpdatedBalance(double amount) { //parameter variable
	//local variable
	double updatedBalance;
	//local variable
	double currentBalance = 0;
	
	//local variable should be initialized before using
// System.out.println(updatedBalance);	
	this.balance = this.balance+amount;
	return this.balance;
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
public BankAccount(String accountHolderName, double balance) {
	super();
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	this.accountNumber = getCount();
}
public int getAccountNumber() {
	return accountNumber;
}
}
