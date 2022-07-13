package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CabDriver;

public interface CabDriverRepository extends JpaRepository<CabDriver, Integer> {

CabDriver findByDriverName(String qryName);
	
}
