package com.example.demo.controllers;

import java.util.Arrays;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {

	@GetMapping(path = "/books")
	public List<String> getBooks(){
		//log.info("Get books called");
		return Arrays.asList("Java", "Spring boot", "C#");
		
	}
	@GetMapping(path = "/books/{id}")
	public String getBookById(@PathVariable int id) {
		if(id==1) {
			return "Java";
		}else {
			return "Spring boot";
			
		}
	}
}
