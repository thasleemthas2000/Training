package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class DriverServiceClientRestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DriverServiceClientRestApiApplication.class, args);
		
		Client client = ctx.getBean(Client.class);
		System.out.println(client.invokeGetAll());
		
//		Driver[] list = client.invokeAllAsObject();
//		for(Driver eachDriver:list) {
//			System.out.println("driver name :"+eachDriver.getDriverName());
//			System.out.println("mobile number :"+eachDriver.getMobileNumber());
//			System.out.println("rating :"+eachDriver.getRating());
//			System.out.println("driver id :"+eachDriver.getDriverId());
//		}
		//client.add();
		ctx.close();
	
		// here driver-service-rest-api project application class and this client project app.class is running at same time but 2 
		
		//different port. and original class is running frst then only client class app. run.
	}
//	@Bean
//	public RestTemplate template() {
//		return new RestTemplate();
//	}
	@Bean
	public BasicAuthenticationInterceptor interceptor() {
		
		
		return  new BasicAuthenticationInterceptor("Japan","Jap123");
	}
	
	
	@Bean
	
	public RestTemplate template() {
		
		RestTemplate template = new RestTemplate();
		
		template.getInterceptors().add(interceptor());
		return  template;
		
		
	}
}
