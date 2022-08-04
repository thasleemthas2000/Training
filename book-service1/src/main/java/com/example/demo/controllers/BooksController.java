package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Books;
import com.example.demo.services.BooksService;

@RestController
@RequestMapping(path= "/api/v1/onlinebooks")
public class BooksController {
  
	@Autowired
	public BooksService service;
	
	

	
	@PostMapping
	public Books add(@RequestBody Books entity) {
		return this.service.save(entity);
	}
	@GetMapping
	public List<Books> findAll(){
		return this.service.findAll();
	}
   @DeleteMapping(path="/{id}")
	public ResponseEntity<String> remove(@PathVariable("id")Books entity) {
   	Books var=this.service.removeById(entity);
       if (var!=null) {
       	return  ResponseEntity.status(204).build();
       }else {
       	return  ResponseEntity.ok("no record matching");
   	
   	
       }
   }

//   @PutMapping(path = "/mrpupdate/{id}/{printedPrice}")
//   public ResponseEntity<String> updateprintedPrice(@PathVariable("id")int id, @PathVariable("printedPrice")double updatedPrintedPrice){
//   	int update = this.service.updatePrintedPrice(id, updatedPrintedPrice);
//   	return ResponseEntity.status(HttpStatus.CREATED).body("Record updated!"+update);
//   	
//   }
//   
//   @PutMapping(path = "/dsntupdate/{id}/{discountedPrice}")
//   public ResponseEntity<String> updatediscountedPrice(@PathVariable("id")int id, @PathVariable("discountedPrice")double updatedDiscountedPrice){
//   	int update = this.service.updateDiscountedPrice(id, updatedDiscountedPrice);
//   	return ResponseEntity.status(HttpStatus.CREATED).body("Record updated!"+update);
//   	
//   }
   @GetMapping(path="/books/srch/name/{bookName}")
   public List<Books> findByBookName(@PathVariable("bookName") String name) {
	   return this.service.findByBookName(name);
   }
   @GetMapping(path="/books/srch/category/{category}")
   public List<Books> findByCategory(@PathVariable("category") String category) {
	   return this.service.findByCategory(category);
   }
   @PutMapping(path="/update")
	public Books saveOrUpdate(@RequestBody Books entity) {
		return this.service.saveOrUpdate(entity);
	}
}

//@PutMapping(path = "/drivers/update/{id}/{rating}")
//public ResponseEntity<String> updaterating(@PathVariable("id")int id, @PathVariable("rating")double updatedRating){
//	int update = this.service.updateRating(id, updatedRating);
//	return ResponseEntity.status(HttpStatus.CREATED).body("Record updated!"+update);




