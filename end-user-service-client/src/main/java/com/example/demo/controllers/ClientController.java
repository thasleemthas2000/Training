package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.UserDTO;

@RestController
@RequestMapping(path = "/client")
public class ClientController {
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private UserDTO dto;
	
	@GetMapping(path = "/books")
    public String getBooks() {
		return this.template.getForObject("http://BOOK-SERVICE1/api/v1/onlinebooks",  String.class);
	}
	@GetMapping(path = "/books/srch/name/{bookName}")
    public String getBooksByTitle(@PathVariable("bookName") String name) {
		return this.template.getForObject("http://BOOK-SERVICE1/api/v1/onlinebooks/books/srch/name/" +name,  String.class);
	}
	
	@GetMapping(path = "/books/srch/category/{category}")
    public String getBooksByCategory(@PathVariable("category") String category) {
		return this.template.getForObject("http://BOOK-SERVICE1/api/v1/onlinebooks/books/srch/category/" +category,  String.class);
	}
	@PostMapping(path="/srch/{userId}")
	public String findBookIdByUserId(@PathVariable("userId") String books) {
		return this.template.getForObject("http://ORDER-SERVICE3/api/v1/orders/srch/" +books, String.class);
	}
}
