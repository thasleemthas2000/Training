package com.training;
import com.training.ifaces.Automobile;
import com.training.model.MarutiCar;
import com.training.model.ObjectFactory;
import com.training.model.ToyotaCar;

public class Application {

	public static void main(String[] args) {
		ObjectFactory obj = new ObjectFactory();
		Automobile MarutiCar =obj.getObject(1);
				Automobile ToyotaCar = obj.getObject(2);
				obj.printQuote(MarutiCar);
				obj.printQuote(ToyotaCar);
	}
}
