package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CabDriver;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

	private RestTemplate template;
	//private String baseURL = "http://CAB-DRIVER-SERVICE/api/v1";

	@Autowired
	public ClientController(RestTemplate template) {
		super();
		this.template = template;
	}
	@GetMapping(path = "/cabdrivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/cabdrivers", String.class);
	}
	@GetMapping(path = "/cabdrivers/json")
	public CabDriver[] getDriversAsJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/cabdrivers", CabDriver[].class);
	}
	@GetMapping(path="/srch/{name}")
	public String getDriversByName(@PathVariable("name") String name) {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/cabdrivers/srch/"+name,String.class);
	}
}
