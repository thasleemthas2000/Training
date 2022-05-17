package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Passenger;
import com.example.demo.repo.PassengerRepository;

@Service
public class PassengerService {

	private PassengerRepository repo;
@Autowired
	public PassengerService(PassengerRepository repo) {
		super();
		this.repo = repo;
	}
public List<Passenger> findAll(){
return this.repo.findAll();
}

public Passenger addPassenger(Passenger entity) {
	return this.repo.save(entity);
    }
public List<Passenger> findByPassengerName(String name){
	return this.repo.findByPassengerName(name);
}
}
