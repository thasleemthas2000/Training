package com.training;

public class Application {
	public static void main(String[] agrs) {

    BankAccount account2= new BankAccount("Ramesh", 1000);


	System.out.println(account2.getUpdatedBalance(2000));
	System.out.println(account2.getUpdatedBalance(2000));
	System.out.println(account2.getAccountNumber());

	}


}
