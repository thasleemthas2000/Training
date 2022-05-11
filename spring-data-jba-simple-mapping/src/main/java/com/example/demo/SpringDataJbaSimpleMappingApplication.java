package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataJbaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJbaSimpleMappingApplication.class, args);
		Doctor ashu=ctx.getBean(Doctor.class);
//		Doctor nasse=ctx.getBean(Doctor.class);
		DoctorService service=ctx.getBean(DoctorService.class);
		//System.out.println(service.findByNameOrDept("thassu","ent"));
		
		Doctor added = service.add(ashu);
		if(added != null) {
			System.out.println("One Doctor Added");
		}
		ctx.close();
	
	}
//	@Bean
//	public Doctor thassu() {
//		return new Doctor(2020,"thassu","ent",8248);
//	}
	@Bean
	//@Primary
	public Doctor ashu() {
		return new Doctor(2081,"ashu","dentist",3091);
	}

}