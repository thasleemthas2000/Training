package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Employees;
import com.example.demo.repo.EmployeeRepository;
@Service
public class EmployeeServices {

	private EmployeeRepository repo;

	@Autowired
	public EmployeeServices(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Employees add(Employees entity) {
		return this.repo.save(entity);
	}

	public List<Employees> findAll() {
		return this.repo.findAll();
	}
	public List<Employees> findByEmployeeId(int id){
		return this.repo.findByEmployeeId(id);
	}
	public List<Employees> findByEmployeeName(String empName){
		return this.repo.findByEmployeeName(empName);
	}
}
