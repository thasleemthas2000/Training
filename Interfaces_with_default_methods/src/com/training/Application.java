package com.training;
import com.training.ifaces.*;
import com.training.services.StudentResultService;

public class Application {

	public static void main(String[] args) {
	
		StudentResultService service = new StudentResultService();
		System.out.println("Is Pass :"+ service.test(90.00));
		System.out.println("Is Fail :" +service.negate(90.00));
System.out.println(Conditional.getMessage());
	}

}
