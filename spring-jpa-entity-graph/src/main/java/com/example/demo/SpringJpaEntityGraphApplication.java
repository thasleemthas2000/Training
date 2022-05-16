package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repo.AddressRepository;
import com.example.demo.services.AddressService;

@SpringBootApplication
public class SpringJpaEntityGraphApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaEntityGraphApplication.class, args);
		
		AddressService service = ctx.getBean(AddressService.class);
		//service.task1();
		service.task2();
		
		ctx.close();
	}

	@Bean
	public CommandLineRunner runner() {    //Inbuild // Interface so can't instantiate // anonymous so doesnt have name
		return new CommandLineRunner() { // gap b/w () { inside implement class called anonymous class.
			
			@Autowired
			AddressRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				 
			
				City chennai = new City(200,"Chennai");	
				City madurai = new City(250,"Madurai");	
				
				User thas = new User(100, "Thas", 58236);
				User nas = new User(101, "Nas", 45698);
				
				Address address1 = new Address(500, "Mr", chennai, thas);
				Address address2 = new Address(501, "Dr", madurai, nas);
				
				this.repo.save(address1);
				this.repo.save(address2);
				
			}
		};
	}
}
