package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.services.InsuranceService;

@SpringBootApplication
public class SpringTablePerClassHierarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(SpringTablePerClassHierarchyApplication.class, args);
		InsuranceService service = ctx.getBean(InsuranceService.class);	
		service.addPolicy();	
		
		//service.getAllPolicy();
		service.findAll();
		ctx.close();
		}
	@Bean
	public LifeInsurance life() {
		return new LifeInsurance(145, "thas", 23, "IT Service");
	}
	@Bean
	public HealthInsurance health() {
		return new HealthInsurance(185, "nas", 50, "Tb");
	}
	}


