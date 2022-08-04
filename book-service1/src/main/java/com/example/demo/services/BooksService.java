package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Books;
import com.example.demo.repo.BooksRepository;

@Service
public class BooksService {
	@Autowired
	private BooksRepository repo;
	 
	public Books save(Books entity) {
	    return repo.save(entity);
}

	public Books removeById(Books entity) {
		boolean result=this.repo.existsById(entity.getId());
		if(result) {
			this.repo.delete(entity);
		}
		else {
			throw new NoSuchElementException("element with id "+entity.getId()+"not present");
		}
		return entity;
			}
	
	  public Optional<Books> findById(int id){
		  return repo.findById(id);
	  }
	  public List<Books> findAll(){
		  return repo.findAll();
	  }
	  public List<Books> findByBookName(String name) {
		  return repo.findByBookName(name);
	  }
	  public List<Books> findByCategory(String category) {
		  return repo.findByCategory(category);
	  }

//	  public int updatePrintedPrice(int id, double updatedPrintedPrice) {
//			return this.repo.modifyPrintedPrice(id, updatedPrintedPrice);
//  } 
//	  public int updateDiscountedPrice(int id, double updatedDiscountedPrice) {
//			return this.repo.modifyDiscountedPrice(id, updatedDiscountedPrice);
//}   
	  public Books saveOrUpdate(Books entity) {
		  return this.repo.save(entity);
	  }


}
//public int updateRating(int id, double updatedRating) {
//return this.repo.modifyRating(id, updatedRating);
