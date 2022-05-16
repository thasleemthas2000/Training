package com.example.demo.service;

import java.time.LocalDate;
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
	public List<Employees> findByDateOfBirth(LocalDate date){
		return this.repo.findByDateOfBirth(date);
	}
	public List<Employees> findByLocation(String loc ){
		return this.repo.findByLocation(loc);
	}
	public List<Employees> findBySkillSet(String skills){
		return this.repo.findBySkillSet(skills);
	}
	public List<Employees> findBySkillSetOrLocation(String skill, String loc){
		return this.repo.findBySkillSetOrLocation(skill, loc);
	}
	public List<Employees> findByLocationAndSkillSet(String location, String skill){
	return this.repo.findByLocationAndSkillSet(location, skill);
	}
}
