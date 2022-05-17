package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Passenger;

import com.example.demo.services.PassengerService;
@RestController
@RequestMapping(path = "api/v1")
public class PassengerController {

	private PassengerService service;
	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}
	@GetMapping(path = "/passengers")
	public List<Passenger> getAllPassengers(){
	return this.service.findAll();	
}
	@PostMapping(path = "/passengers")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger entity){
		Passenger pass = service.addPassenger(entity);
		return ResponseEntity.ok(pass);
	}
	@GetMapping(path ="/passengers/srch/name/{passengerName}")
	public List<Passenger> getPassengerByName(@PathVariable("passengername")String srchName){
		return this.service.findByPassengerName(srchName);
	}
}
