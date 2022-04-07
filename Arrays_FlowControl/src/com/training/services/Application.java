package com.training.services;
import com.training.model.BankAccount;

public class Application {
public static void main(String[] args) {
	
	BankAccountService service = new BankAccountService();
	BankAccount  ram = new BankAccount(5000, "ram", 5000);
	double simpleInterest = service.calculateeInterest(ram);
	System.out.println("Simle interest @6%:"+ simpleInterest);
	
	BankAccount  suresh = new BankAccount(6200, "suresh", 5000);
	double simpleInterest2 = service.calculateeInterest(suresh);
	System.out.println("Simle interest @5%:"+ simpleInterest2);
	
	//BankAccount[] accounts = new BankAccount[2];
	//accounts[0] = ram;
	//accounts[1] = suresh;
	
	//service.calculateInterest(accounts);
	
	BankAccount[] accounts = {ram, suresh};
	service.calculateInterest(accounts);
	System.out.println("=========================");
	
	double[] values = service.findInterest(accounts);
	for(double eachValue : values) {
		System.out.println(eachValue);
	}
}
}
