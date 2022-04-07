package com.training.model;

public class HealthInsurance extends Insurance {
private String[] preExistingDisease;


	public HealthInsurance() {
	super();
	// TODO Auto-generated constructor stub
}


public HealthInsurance(int policyNumber, String policyHolderName) {
	super(policyNumber, policyHolderName);
	// TODO Auto-generated constructor stub
}


	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDisease) {
	super(policyNumber, policyHolderName);
	this.preExistingDisease = preExistingDisease;
}


	@Override
	public double calculatePremium() {
		double premium = 10000;
		for(String eachItem : preExistingDisease) {
			String item = eachItem.toLowerCase();
		
			if(eachItem.equals ("BP") || eachItem.equals("sugar")) {
				premium = 15000;
		}}
		// TODO Auto-generated method stub
		return premium;
	}
		
		
	

}
