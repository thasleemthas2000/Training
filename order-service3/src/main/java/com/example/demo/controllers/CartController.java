package com.example.demo.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Books;
import com.example.demo.entity.Cart;
import com.example.demo.services.CartService;


@RestController
@RequestMapping(path="/api/v1/orders")
public class CartController {

	@Autowired
	private CartService service;
	
	@PostMapping
	public Cart add(@RequestBody Cart entity) {
		return this.service.save(entity);
	}

@GetMapping
public List<Cart> findAll() {
	return this.service.findAll();
}
@GetMapping(path="/{userId}")
public Cart findByUserId(@PathVariable("userId")int id) {
	return this.service.findByUserId(id);
}
@GetMapping(path="/srch/{orderId}")
public List<Books> findByOrderId(@PathVariable("orderId")int id) {
	return this.service.findByOrderId(id);
}
@GetMapping(path="/srch/{userId}")
public Cart findBookIdByUserId(@PathVariable("userId")int id) {
	return this.service.findBookIdByUserId(id);
}
@GetMapping(path="/srch/delete/{bookId}")
public Cart deleteBookIdByOrderId(@PathVariable("bookId")int id) {
return this.service.deleteBookIdByOrderId(id);

}
}
