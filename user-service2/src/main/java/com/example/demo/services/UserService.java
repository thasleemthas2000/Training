package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service 
public class UserService {

	@Autowired
	private UserRepository repo;

public User findByUserId(int id) {
	return repo.findByUserId(id);
}
public List<User> findAll() {
	return repo.findAll();
}
public User save(User entity) {
	return repo.save(entity);
}
}