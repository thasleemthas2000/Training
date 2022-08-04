package com.example.demo.repository;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Books;
import com.example.demo.entity.Cart;



public interface CartRepository extends JpaRepository<Cart, Integer> {

	public Cart findByUserId(int id);
	//public Cart findByBookId(int id);
	public Cart findBookIdByUserId(int id);
	public Cart deleteBookIdByOrderId(int id);
	//public Cart addBooksByCart(int id);
public List<Books>  findByOrderId(int id);
}

