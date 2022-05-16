package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
