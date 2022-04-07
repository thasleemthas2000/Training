package com.training.model;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {
	

	@Override
	public String getColor() {		
		return "Red";
	}

	@Override
	public String getModel() {		
		return "Jaguar";
	}

	@Override
	public double getPrice() {
		return 500000.00;
	}

}
