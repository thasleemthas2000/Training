package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
	
	public List<Employees> findByEmployeeId(int id);
	
	public List<Employees> findByEmployeeName(String empName);

}
