
import com.training.model.BankAccount;

public class BankAccountService {
private static final int  = 0;
public double calculateeInterest(BankAccount account) {
	
	double simpleInterest = 0.05;
	if(account.getAccountNumber()<=5000) {
		simpleInterest = 0.06;
		
	}
	return account.getBalance()*1*simpleInterest;
	
}

public void calculateInterest(BankAccount[] accounts) {
		for(BankAccount eachAccount : accounts) {
		System.out.println(calculateeInterest(eachAccount));
	}
}

public double[] findInterest(BankAccount[] accounts) {
	
	double[] values = new double[2];
	int i=0;
	for(BankAccount eachAccount:accounts) {
		values[i] = calculateeInterest(eachAccount);
		i++;
		
		
	}
	return values;
}
private double calculatByAccountType(BankAccount account,double rateOfInterest) {
	return account.getBalance()*1*rateOfInterest;
	
}
public double[] findInterestByAccountType(BankAccount[] accounts) {
	double[] values=new double[accounts.length];
	int i=0;
	
	//using new feature of java7 (i.e) switch case with string
	for(BankAccount eachAccount : accounts) {
		String key = eachAccount.getAccountType();
		switch (key) {
		case "savings":
			values[i] = calculatByAccountType(eachAccount, 0.05);
			break;
			
		case "fixed":
			values[i] = calculatByAccountType(eachAccount, 0.07);
			break;
			
		case "recurring":
			values[i] = calculatByAccountType(eachAccount, 0.07);

		default:
			break;
		}
	}
	return values;
}
}
