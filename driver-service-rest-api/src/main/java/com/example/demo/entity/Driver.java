package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "thas_driver")
public class Driver {
	
	@Id
	@Column(name = "driver_id")
	private int driverId;
	
	@Column(name ="driver_name")
	private String driverName;
	
	@Column(name = "mobileNumber")
	private long mobileNumber;
	
	@Column(name = "rating")
	private double rating;


	
	
	

}
