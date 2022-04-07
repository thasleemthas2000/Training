package com.training.model;

import com.training.ifaces.Conditional;
import com.training.utils.ObjectFactory;


public class Application {

	public static void main(String[] args) {
		NewObjectFactory factory = new NewObjectFactory();
	//ObjectFactory factory = new ObjectFactory();
	Conditional proObj = factory.getConditional(1);
	Conditional stuObj = factory.getConditional(2);
	
	System.out.println("Allowance: "+factory.getValue(proObj,"chennai"));
	System.out.println("Allowance: "+factory.getValue(stuObj, "90"));
Conditional principalObj = factory.getConditional(3);
System.out.println("Allowance: "+factory.getValue(principalObj, "engg"));
	}

}
