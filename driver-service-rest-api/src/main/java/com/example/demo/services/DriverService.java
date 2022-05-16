package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

@Service
public class DriverService {

	private DriverRepository repo;
@Autowired
public DriverService(DriverRepository repo) {
	super();
	this.repo = repo;
}


public List<Driver> findAll() {
	return this.repo.findAll();
    }

public Driver addDriver(Driver entity) {
	return this.repo.save(entity);
    }

	public Driver findById(int id) {
		return this.repo.findById(id).orElseThrow( ()-> new RuntimeException(id+ "Not Found"));
	}


	public Driver add(Driver entity) {
		return this.repo.save(entity);
	}
	
    public void deleteById(int id) {
       this.repo.deleteById(id);

}
//	public Driver removeById(Driver entity) {
//		   
//		   Optional<Driver> optional = Optional.empty();
//		if(this.repo.existsById(entity.getDriverId())) {
//		this.repo.delete(entity);
//		optional = Optional.of(entity);
//		}
//
//		      return this.repo.save(entity);  
//	}

}