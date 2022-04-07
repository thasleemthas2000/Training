package com.training.model;

public class VehicleInsurance extends Insurance {

	private String vehicleModel1;
	private int yearOfManufacture;
	
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleInsurance(int policyNumber, String policyHolderName, String vehiceModel1,
			int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vehicleModel1 = vehiceModel1;
		this.yearOfManufacture = yearOfManufacture;
	}

	public VehicleInsurance(int policyNumber, String policyHolderName ) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double calculatePremium() {
		double premium = 1000;
		
		if(yearOfManufacture<2020 && vehicleModel1.equals("car")) {
		premium = 2000;
		
	}
		return premium;
		
}

}
