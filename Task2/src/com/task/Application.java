package com.task;
import java.util.*;
import com.task.model.*;
import com.task.model1.*;


public class Application {
	public static void main(String[] args) {
		Customer van = new Customer();
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the name");
				String name = sc.next();
				int number = 0;
				van.setCustomerID(number);
				
				
				System.out.println("Enter the mobile number");
			    int mobile = sc.nextInt();
				van.setCustomerPhone(mobile);
				
				System.out.println("Enter the location");
				String location = sc.next();
				van.setLocation(location);
				
		
		
	
		Customer details = new Customer(101, "Thas", 435262, "Chennai");
		System.out.println("Customer ID:"+details.getCustomerID());
		
		
		System.out.println("Customer Name:"+details.getCustomerName());
		
		
		System.out.println("Customer PhoneNumber:"+details.getPhoneNumber());
		
		
		System.out.println("Customer Location:"+details.getLocation());
	
	}

{
      System.out.println("-----------------------------");}
{
	
      Employee details = new Employee(01, "AAA",12345 );
      System.out.println("Employee ID:"+details.getEmployeeID());
      System.out.println("Employee Name:"+details.getEmployeeID());
      System.out.println("Employee Phone Number:"+details.getPhoneNumber());
}
{
Hotel details = new Hotel("TTT", 12345,"Spicot" );
System.out.println("Hotel Name:"+details.getHotelName());
System.out.println("Hotel Address:"+details.getHotelName());
System.out.println("Hotel Phone Number:"+details.getPhoneNumber());
}}
