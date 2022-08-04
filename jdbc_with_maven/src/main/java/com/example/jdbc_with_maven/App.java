package com.example.jdbc_with_maven;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import java.util.Optional;

import com.example.dao.MemberRepository;
import com.example.demo.services.ProductService;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;




public class App 
{
public static void member(){
	Connection con;
	
	try{
		 con = ConnectionFactory.getOracleConnection();
	
	 MemberRepository service = new MemberRepository(con);
	 System.out.println(con);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void product() {
	//Connection con = ConnectionFactory.getOracleConnection();
	Connection con = ConnectionFactory.getPostgresConnection();
	
	 ProductService service = new ProductService(con);
	 
     Product toAdd = new Product(82, "Tawa", 1500.00);
     service.findAll().forEach(System.out::println);
     
	 int rowAdded = service.addProduct(toAdd);
	 System.out.println("Row Added :" +rowAdded);
}
    public static void main( String[] args )
    {
    	
    	product();
//       Connection con;
//       try {
//    	   con = ConnectionFactory.getPostgresConnection();
//       con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
//       con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Test", "postgres", "root");
//        System.out.println(con); 
//        
    	
    	
    	
    	
    	
    	
    	
    	
//        LocalDate date = LocalDate.of(2022,4,12);
//		Date sqlDate = Date.valueOf(date);
//      MemberRepository service = new MemberRepository(con);
//     Member toAdd = new Member(122, "Gowse", "Cuddalore", date, "Lifetime",710, 25, 911.00);
//		int rowAdded = service.add(toAdd);
//		System.out.println("Row Added : "+rowAdded);
//      System.out.println("Data :");
//      service.findAll().forEach(System.out::println);
     	
		 
//	} catch (Exception e) {
//		
//		e.printStackTrace();
//	}
	
        
        
        
        
        
        
        
        
//  System.out.println(con);
//       }catch(SQLException e) {
//    	   e.printStackTrace();
       }
        
    }

