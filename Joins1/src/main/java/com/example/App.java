package com.example;

import java.sql.*;

import com.example.entity.Customer;
import com.example.entity.CustomerService;
import com.example.entity.LoanApplication;

public class App 
{
    public static void main( String[] args )
    {
    	Connection con;
	try {
		 con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
		 
    		 System.out.println(con);
    		 
    		 
    		 CustomerService service = new CustomerService(con);
    		 System.out.println("Data is: ");
    		 service.findAll().forEach(System.out::println);
			 System.out.println("**************");
			 
			 
			 Customer id = new Customer(687, "Vishnu", 1234567890 , 789.00 );
			 LoanApplication app = new LoanApplication(30005, id,  24000.00 );
			 
			 System.out.println("Row Added :" +service.add(app));
			 service.findAll().forEach(System.out::println);
			 System.out.println("**************");
    		 
			 service.remove(30005);
			 service.findAll().forEach(System.out::println); 
    	 	} catch (Exception e) {
    	 		e.printStackTrace();
	}

    }
}
