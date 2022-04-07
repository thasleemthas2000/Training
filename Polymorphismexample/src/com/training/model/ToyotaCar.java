package com.training.model;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Violet";
	}
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Bens";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 8000000.00;
	}

}
