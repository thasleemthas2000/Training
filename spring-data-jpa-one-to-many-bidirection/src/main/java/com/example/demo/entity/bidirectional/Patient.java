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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "P11patient_one_To_Many_bid")
@Getter
@Setter
@Data
@NoArgsConstructor
public class Patient {
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", mobileNumber=" + mobileNumber + ", patientName=" + patientName
				+ ", doctor=" + doctor + "]";
	}

	@Id
	@Column(name = "patient_id")
	int patientId;
    

	@Column(name = "mobile_number")
	long mobileNumber;
	
	@Column(name = "patient_name")
	String patientName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "doctor_ref", referencedColumnName = "doctor_id")
	private Doctor doctor;

	public Patient(int patientId, long mobileNumber, String patientName) {
		super();
		this.patientId = patientId;
		this.mobileNumber = mobileNumber;
		this.patientName = patientName;
	}
	
}

