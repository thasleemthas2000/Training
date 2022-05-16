package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.ifaces.DoctorRepository;

@Component
public class DoctorUtils {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create() {
		doc.setPatientList(patientList);
		
		Doctor added = repo.save(doc);
		
		if(added!=null) {
			System.out.println("One Record Added");
		}
		
	}

	public void findAll() {
		List<Doctor> doctor = repo.findAll();
		for(Doctor eachDoctor:doctor) {
			System.out.println("Doctor Name :"+eachDoctor.getDoctorName());
			System.out.println("Department :"+eachDoctor.getDepartment());
			
			List<Patient> patients = eachDoctor.getPatientList();
			
			for(Patient eachPatient:patients) {
				System.out.println("Patient Name :"+eachPatient.getPatientName());
				System.out.println("Phone Number :"+eachPatient.getMobileNumber());
			
		}
		}
	}
				public List<Doctor> findByDoctorId(int id){
			 return this.repo.findByDoctorId(id);
			}
	
	
}

