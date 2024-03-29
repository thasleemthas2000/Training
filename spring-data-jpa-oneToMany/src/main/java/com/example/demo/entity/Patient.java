package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "P1patient_one_To_Many")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	@Id
	@Column(name = "patient_id")
	int patientId;
    

	@Column(name = "mobile_number")
	long mobileNumber;
	
	@Column(name = "patient_name")
	String patientName;
}
