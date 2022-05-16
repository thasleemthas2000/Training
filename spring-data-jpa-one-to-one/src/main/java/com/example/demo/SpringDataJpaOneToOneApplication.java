package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringDataJpaOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(SpringDataJpaOneToOneApplication.class, args);
		
		SeminarUtils obj = ctx.getBean(SeminarUtils.class);
		obj.create();
		obj.findAll();
		ctx.close();
	}
	@Bean
	public Seminar english() {
		Seminar sub1 = new Seminar();
		sub1.setId(3);
		sub1.setDuration(10);
		sub1.setName("Maths");
		return sub1;
	}
	
	@Bean
	public Speaker thas() {
		return new Speaker(33, "NAZ", "BE");
	}

}
