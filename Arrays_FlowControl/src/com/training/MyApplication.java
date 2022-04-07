package com.training;
import com.training.model.BankAccount;
import com.training.services.BankAccountService;
import java.util.*;

public class MyApplication {
public static void main(String[] agrs) {
	
	BankAccountService service = new BankAccountService();
	Scanner sc = new Scanner(System.in);
	BankAccount[] list = new BankAccount[0];
	BankAccount[] bank = null;
	int idx = 0;

	do {
		BankAccount account = new BankAccount();
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter the Account number");
		String accountHolderName = sc.next();
		System.out.println("Enter the Account holder name");
		double balance = sc.nextDouble();
		System.out.println("Enter the account balance");
		String accountType =sc.next();
		System.out.println("Enter the account type[savings, fixed, recurring]");
		BankAccount account1= new BankAccount(accountNumber, accountHolderName, balance, accountType );
		list[idx] = account1;
		System.out.println("0to Stop and 1 to Continue");
		choice = sc.nextInt();
		
	}while(choice==0);
	
	double[] values = service.findInterest(list);
	for(double eachValue:values) {
		if(eachValue!=0) {
			System.out.println(eachValue);
		}
	}
	service.findInterest(list);
	
	sc.close();
			
	}
}
