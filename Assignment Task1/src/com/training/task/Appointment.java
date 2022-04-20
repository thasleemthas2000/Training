package com.training.task;

import java.util.*;
import com.training.model.Patient;
import com.training.model.Doctor;

public class Appointment {

	private Map<Doctor, Set<Patient>>Pat;

	public Appointment() {
		super();
		
	}

	public Appointment(Map<Doctor, Set<Patient>> pat) {
		super();
		Pat = pat;
	}

	public Map<Doctor, Set<Patient>> getPat() {
		return Pat;
	}

	public void setPat(Map<Doctor, Set<Patient>> pat) {
		Pat = pat;
	}

	@Override
	public String toString() {
		return "Appointment [Pat=" + Pat + "]";
	}
	
	public Set<Patient>getPatients(Doctor key){
		return this.Pat.get(key);
	}
	
}
