package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Employees;
import com.example.demo.service.EmployeeServices;

@SpringBootApplication
public class SpringDataJbaSimpleMappingTast1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJbaSimpleMappingTast1Application.class, args);
		//Employees thas=ctx.getBean(Employees.class);
		//Employees kutty=ctx.getBean(Employees.class);
		
		EmployeeServices service = ctx.getBean(EmployeeServices.class);
		//service.findAll().forEach(System.out::println);
		service.findByEmployeeId(2).forEach(System.out::println);
		System.out.println("****************");
		service.findByEmployeeName("Apple").forEach(System.out::println);
		System.out.println("****************");
		service.findByDateOfBirth(LocalDate.of(2000, 01, 01)).forEach(System.out::println);
		System.out.println("****************");
		service.findByLocation("Mumbai").forEach(System.out::println);
		System.out.println("****************");
		service.findBySkillSet("#C").forEach(System.out::println);
		System.out.println("****************");
		service.findBySkillSetOrLocation("java", "Cbe").forEach(System.out::println);
		System.out.println("****************");
		service.findByLocationAndSkillSet("Delhi", "C++").forEach(System.out::println);
//		Employees added = service.add(kutty);
//		
//		
//		if(added!=null) {
//			System.out.println("One Employee added");
//		}
		ctx.close();
	}
//	@Bean
//	
//	public Employees thas() {
//		return new Employees(1, "Abi", LocalDate.of(2000, 01, 01), "Chennai", "java", 98745);
//	}
//	@Bean
//	@Primary
//	public Employees Kutty() {
//		return new Employees(4, "Pomo", LocalDate.of(2001, 04, 04), "Mumbai", "Python", 66645);
//	}
	
}
