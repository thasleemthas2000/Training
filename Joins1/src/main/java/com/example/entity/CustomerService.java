package com.example.entity;

import java.sql.Connection;
import java.util.List;

import com.example.ifaces.CrudRepository;

public class CustomerService implements CrudRepository<LoanApplication> {

	
	public int add(LoanApplication obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<LoanApplication> findAll() {
		
		return null;
	}
	public int remove(int d) {
		// TODO Auto-generated method stub
		return 0;
	}
	public LoanApplication findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public int update(int Id, LoanApplication customer) {
		// TODO Auto-generated method stub
		return 0;
	}
}