package com.training;

import java.util.Scanner;

import com.taining.exception.RangeCheckException;
import com.taining.model.Student;
import com.taining.services.StudentService;
import com.training.services.ExceptionHandling;

public class Application {

	public static void main(String[] args) {
		
		Student ram = null;
		try {
			ram = new Student (1020, "ramesh", 85);
		} catch (RangeCheckException e1) {
			
			e1.printStackTrace();
		}
		StudentService service = new StudentService (ram);
		//System.out.println(service.sendDetails());
		
		StudentService service2 = new StudentService(ram);
		try {
			//System.out.println("grade: "+service2.findRank());
		} catch (Throwable e) {
			//e.printStackTrace();
			//System.err.println("Name is not passed");
		}
          ExceptionHandling exHandling = new ExceptionHandling();
          //exHandling.usingArrayIndexException(args);
          //exHandling.usingNumberFormatException("FourtyFive");
          //exHandling.usingFinallyBlock();
          try {
			
        	System.out.println(exHandling.underStandFinallyBlock());
		} catch (Exception e) {
			System.out.println("welcomeeeee");
			e.printStackTrace();
		}
         try( Scanner sc = new Scanner(System.in)){
        	 System.out.println("enter number");
        	 int num = sc.nextInt();
        	 System.out.println(num);
        	 
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	}


