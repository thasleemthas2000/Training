package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidirectional.Utility;

@SpringBootApplication
public class SpringDataJpaOneToManyBidirectionApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaOneToManyBidirectionApplication.class, args);
		
		
		 
		 Utility obj = ctx.getBean(Utility.class);
    // obj.create();
		 obj.findByDoctorFrmPatient();
     // obj.findAll();
		 
		 ctx.close();
		 
		 
		 
	}
	@Bean
	
	public Doctor ashu() {
		
		Doctor doc= new Doctor();
		doc.setDoctorId(10);
		doc.setDoctorName("Ashu");
		doc.setDepartment("ortho");
		doc.setPhoneNumber(9456439);
		return doc;
	}
	
	@Bean
	public Patient archu() {
		
		return new Patient(20,9443821,"archu");
	}
	
	@Bean
	public Patient archu1() {
		
		return new Patient(21,94435768,"archu1");
	}
	
	@Bean
	public Patient archu2() {
		
		return new Patient(22,94435768,"archu2");
	}
	
	}

