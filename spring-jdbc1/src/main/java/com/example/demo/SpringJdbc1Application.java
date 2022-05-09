package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringJdbc1Application.class, args);
		
		ApplicationContext ctx = SpringApplication.run(SpringJdbc1Application.class, args);
		ProductRepository repo = ctx.getBean(ProductRepository.class);
//		repo.findAll().forEach(System.out::println);
		
//		Product tong = ctx.getBean(Product.class);
//		System.out.println("Row Added :"+repo.add(tong));
//		repo.findAll().forEach(System.out::println);
//		
		
		System.out.println("Row Deleted :"+ repo.remove(18));
		repo.findAll().forEach(System.out::println);
		
	
	System.out.println("Find by Id :"+ repo.findById(10));
	
	Product lip = ctx.getBean(Product.class);
	System.out.println("Update :"+ repo.update(lip));
	//repo.findAll().forEach(System.out::println);
	}
//	@Bean
	
//	public Product tong() {
//		return new Product(56, "Tong", 990);
//	}
	@Bean
	public Product cooler() {
		return new Product(56, "Chiller", 582 );
	}
	}


