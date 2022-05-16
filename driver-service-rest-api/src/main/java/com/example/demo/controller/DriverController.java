package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;

@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {

	private DriverService service;

	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	@GetMapping(path ="/drivers")
	public List<Driver> getAllDrivers(){
		return this.service.findAll();			
	}
	
	@GetMapping(path = "/drivers/{id}")
	public Driver getDriverById(@PathVariable("id") int id) {
		return this.service.findById(id);
	}
	
	@PostMapping(path = "/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
		Driver driver=this.service.add(entity);
		URI locations = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getDriverId()).toUri();
		return ResponseEntity.created(locations).body(driver);
		}
	
@DeleteMapping(path = "/drivers/{id}")
public ResponseEntity<String> deleteById(@PathVariable int id){
		   this.service.deleteById(id);
			return ResponseEntity.status(204).body("One Record Deleted "+id);
		
	}



	


//@DeleteMapping(path = "/drivers/{id}")
//public ResponseEntity<Driver> removeById(@RequestBody Driver entity) {
//
//Driver invoice = this.service.removeById(entity).orElseThrow(()-> new RuntimeException("Element NOT FOUND"));
//
//    return ResponseEntity.ok().body(entity);
//    
//}
}

