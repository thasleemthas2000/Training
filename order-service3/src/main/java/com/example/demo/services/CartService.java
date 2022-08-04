package com.example.demo.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Books;
import com.example.demo.entity.Cart;
import com.example.demo.repository.CartRepository;


@Service
public class CartService {
	
  @Autowired
  public CartRepository repo;


public List<Cart> findAll() {
	return repo.findAll();
}


public Cart save(Cart entity) {
	return repo.save(entity);
}

public Cart findByUserId(int id) {
	return repo.findByUserId(id);
}
public List<Books> findByOrderId(int id) {
	return repo.findByOrderId(id);
}
public Cart findBookIdByUserId(int id) {
	return repo.findBookIdByUserId(id);
}
public Cart deleteBookIdByOrderId(int id) {
	return repo.deleteBookIdByOrderId(id);
}
}
