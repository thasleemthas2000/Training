package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Driver Service -Api", version = "1.0"))
public class ApiApplicationDriverServiceRest {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplicationDriverServiceRest.class, args);
		
		
	}
@Bean
	public CommandLineRunner runner() {
	 return new CommandLineRunner() {
		
		 
		 @Autowired
		 DriverRepository repo;
		@Override
		public void run(String... args) throws Exception {
			repo.save(new Driver(100, "archu", 12345, 4.4));
			
			
		}
	};
}
}
