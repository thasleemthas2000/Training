package com.example.demo.entity.bidirectional;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "P1patient_one_To_Many_bid")

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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "doctor_ref")
	private Doctor doctor;
}
