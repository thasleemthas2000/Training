package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

@SpringBootApplication
public class DriverServiceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverServiceRestApiApplication.class, args);
		
		
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
