package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.ifaces.InsuranceRepository;

//@Service
//public class InsuranceService {
//	
//	@Autowired
//	InsuranceRepository repo;
//	
//	@Autowired
//	HealthInsurance entity;
//	
//	@Autowired
//	LifeInsurance entity1;
//	
//	public void addHealthPolicy() {
//		Object obj = repo.save(entity);
//		
//		if(obj!=null) {
//			System.out.println(("One Record Added"));
//		}
//	}
//		public void addLifePolicy() {
//			Object obj1 = repo.save(entity1);
//			if(obj1!=null) {
//				System.out.println(("One Record Added"));
//			}
//		}
//	
//
//	public void getHealthPolicy() {
//		repo.findAll().forEach(System.out::println);
//	}
//	public void findAll() {
//		repo.findAll().forEach(System.out::println);
//	}
//	
//	public void getAllPolicy() {
//		repo.findAll().forEach(System.out::println);
//	}
//}
@Service
public class InsuranceService {
	
	@Autowired
	InsuranceRepository repo;
	
	@Autowired
	HealthInsurance entity;
	
	@Autowired
	LifeInsurance entity1;
	
	public void addPolicy() {
		Object obj = repo.save(entity);
		Object obj1 = repo.save(entity1);
		if(obj!=null) {
			System.out.println(("One Record Added"));
		}
		if(obj1!=null) {
			System.out.println(("One Record Added"));
		}
	}

	public void getHealthPolicy() {
		repo.findAll().forEach(System.out::println);
	}
	public void findAll() {
		repo.findAll().forEach(System.out::println);
	}
}
