package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

	List<Driver> findByDriverName(String srchName);
	
	List<Driver> findByMobileNumber(long mobileNumber);
	
	@Query(value = "from Driver where rating=:srchValue")
	List<Driver> searchByRating(@Param("srchValue")double rating);//My own way of writing method name by using query.
	
	@Query(value = "update Driver set rating =:updatedRating where driverId=:srchId")
	@Modifying
	@Transactional
	int modifyRating(@Param("srchId")int driverId,@Param("updatedRating") double updatedRating);//when using modify use should use int bcoz it gives int row value as O/P
	
	
	
	
}
