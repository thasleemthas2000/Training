package com.example.demo.repo;

import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

	public Optional<Books> findById(int id);
	public List<Books> findByBookName(String name);
	public List<Books> findByCategory(String category);
	
//
//	@Query(value = "update Books set printedPrice =:updatedPrintedPrice where id=:srchId")
//	@Modifying
//	@Transactional
//	public int modifyPrintedPrice(@Param("srchId")int id,@Param("updatedPrintedPrice") double updatedPrintedPrice);
//	
//	@Query(value = "update Books set discountedPrice =:updatedDiscountedPrice where id=:srchId")
//	@Modifying
//	@Transactional
//	public int modifyDiscountedPrice(@Param("srchId")int id,@Param("updatedDiscountedPrice") double updatedDiscountedPrice);
}
//@Query(value = "update Driver set rating =:updatedRating where driverId=:srchId")





