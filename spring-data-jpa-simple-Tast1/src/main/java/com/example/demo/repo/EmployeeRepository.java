package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
	
	public List<Employees> findByEmployeeId(int id);
	
	public List<Employees> findByEmployeeName(String empName);
 
	public List<Employees> findByDateOfBirth(LocalDate date);
	
	public List<Employees> findByLocation(String location);
	
	public List<Employees> findBySkillSet(String skill);
	
	public List<Employees> findBySkillSetOrLocation(String skill, String loc);
	
	@Query(nativeQuery=true,value="select * from ammu_employees where location=:location and skill_set=:skillSet")
	public List<Employees> findByLocationAndSkillSet(@Param("location") String location, @Param("skillSet") String skill);
	
}


