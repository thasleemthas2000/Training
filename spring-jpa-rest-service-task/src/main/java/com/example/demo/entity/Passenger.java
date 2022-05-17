package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "thas_passenger")
public class Passenger {
	
	@Id
	@Column(name = "passenger_Id")
	private int passengerId;
	
	@Column(name = "passenger_Name")
	private String passengerName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "location")
	private String location;

	@OneToMany(targetEntity = TripHistory.class, fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "passenger_ref", referencedColumnName = "passenger_id")
	List<TripHistory> tripHistoryList;
}
