package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;

import com.example.demo.ifaces.SeminarRepository;

@Component
public class SeminarUtils {
	
	@Autowired
 private Speaker speakList;
	
	@Autowired
	Seminar semi;
	
	@Autowired
	SeminarRepository repo;
	
	public void create() {
	
		semi.setSpeaker(speakList);
		Seminar added = repo.save(semi);
		
		if(added!=null) {
			System.out.println("One Record Added");
		}

	}
		public void findAll() {
			System.out.println(semi);
			
		}
}


