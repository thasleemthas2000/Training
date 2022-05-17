package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repo.PassengerRepository;
import com.example.demo.services.PassengerService;


@SpringBootApplication
public class SpringJpaRestServiceTaskApplication {

	public static void main(String[] args) {
			SpringApplication.run(SpringJpaRestServiceTaskApplication.class, args);
	
			
	}
	
	
	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
		
			@Autowired
			PassengerRepository repo;
			@Override
			public void run(String... args) throws Exception {
				Passenger pass = new Passenger();
				pass.setPassengerId(1);
				pass.setPassengerName("Thas");
				pass.setEmail("thas123@gmail.com");
				pass.setLocation("Banglore");
			
				List<TripHistory> list = Arrays.asList(new TripHistory(101, LocalDateTime.of(2022, 05, 01, 10, 30),"Kallai bus stop", "Ooty bus stop", 5500.00 ));
				
				pass.setTripHistoryList(list);
				
				repo.save(pass);
			}
		};
	}

}
