package com.training.model;

public class SavingsAccount extends BankAccount {
private String nominee;
//whenever sub class constructor is called its super class
//constructor also called even super() keyword is not present
//public SavingsAccount() {
//	super();
//	System.out.println("Constructor of SUB CLASS Called");
//}

public String getNominee() {
	return nominee;
}

public void setNominee(String nominee) {
	this.nominee = nominee;
}

public SavingsAccount(int accountNumber2, String accountHolderName2, double balance2, String accountType2,
		String nominee) {
	super(accountNumber2, accountHolderName2, balance2, accountType2);
	this.nominee = nominee;
}


//public SavingsAccount() {
//	super(1020, "ram", 5000);
//	System.out.println("Constructor of SUB CLASS Caleed");
//}
}
