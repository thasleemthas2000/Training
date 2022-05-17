package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
 List<Passenger> findByPassengerName(String name);
 
}
