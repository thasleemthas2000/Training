package com.example.demo;
import java.util.*;

public class Application {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.next();
		
		System.out.println("Enter the Farenheit Temp");
		double farenTemp = sc.nextDouble();
		
		Converter convObj = new Converter();
		System.out.println(convObj.convert(name));
		System.out.println("Celsius Temp:"+convObj.convert(farenTemp));
		
		System.out.println("Enter the Amount");
		double amount = sc.nextDouble();
		
		System.out.println("Enter the current amount to convert 1-USD 2-Euro");
		int frm = sc.nextInt();
				
				System.out.println(convObj.convert(amount, frm));
		
	sc.close();	
	}

}
