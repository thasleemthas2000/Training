package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(SpringDataJpaOneToManyApplication.class, args);
		
		DoctorUtils obj = ctx.getBean(DoctorUtils.class);
		//obj.findAll();
		obj.findByDoctorId(6).forEach(System.out::println);
		//obj.create();
		ctx.close();
	}	
		@Bean
		public Doctor naz() {
			Doctor doc=new Doctor();
			doc.setDoctorId(6);
			doc.setDepartment("MBBS");
			doc.setDoctorName("Nazeer");
			doc.setPhoneNumber(58464);
			return doc;
		}
		@Bean
		public Patient suhail() {
			
			return new Patient(18,12356,"Suhail");
		}
		
	}


