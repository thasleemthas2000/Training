package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "thas_trip_history")
public class TripHistory {

	@Id
	@Column(name = "trip_Id")
	private int tripId;
	
	@Column(name = "trip_Date_Time")
	private LocalDateTime tripDateTime;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "amount")
	private double amount;
}
