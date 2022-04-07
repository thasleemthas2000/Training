package com.training;
import com.training.model.*;
import com.training.model.Insurance;
import com.training.model.VehicleInsurance;

public class Application {

	public static void printPremium(Insurance object) {
		System.out.println("Premium:"+object.calculatePremium());
	}
	public static void main(String[] args) {
		VehicleInsurance car = new VehicleInsurance(1010, "thas", "car", 2019);
printPremium(car);
LifeInsurance life = new LifeInsurance(10, "Mat", 221);
printPremium(life);

String[] illness = {"bp", "sugar", "thyroid"};
HealthInsurance health = new HealthInsurance(2020, "Vivi", illness);
printPremium(health);
	}
}
