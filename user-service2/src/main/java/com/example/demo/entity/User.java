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

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity
@Table(name="Users_2022")
public class User {

	@Id
	@Column(name="user_id")
	 int userId;
	
	@Column(name="user_name")
	String userName;
	
//	@OneToMany(targetEntity = Patient.class, fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name = "doctor_ref", referencedColumnName = "doctor_id")
//	List<Patient> patientList; 
}
