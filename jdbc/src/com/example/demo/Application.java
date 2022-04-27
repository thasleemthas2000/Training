package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductServices;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {
		Connection con;
		try {
			 con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
			 
			 ProductServices service = new ProductServices(con);
			 
             Product toAdd = new Product(95, "ups", 153.00);
             
			 int rowAdded = service.addProduct(toAdd);
			 System.out.println("Row Added :" +rowAdded);
			 service.findAll().forEach(System.out::println);
			 System.out.println("*************");
		
			 int Deleted = service.deleteById(11);
			 System.out.println("Row Deleted :"+ Deleted);
			 service.findAll().forEach(System.out::println);
			 System.out.println("********************");
			 
			 int updatePriceByName = service.updatePriceByName("ironbox", 8502);
			 System.out.println("Updated Price :" +updatePriceByName);
			 service.findAll().forEach(System.out::println);
			 System.out.println("**************");
			 
			 Optional<Product> found = service.findById(15);
			 if(found.isPresent()) {
				 System.out.println(found.get());
			 
		}else {
			System.out.println("Product is not present");
		}
			
			
			 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}
}


