package com.training;
import java.util.*;
import com.training.task.Appointment;
import com.training.model.*;

public class Application {

	public static void main(String[] args) {
		
HashSet<Patient> patien = new HashSet<Patient>();
 Patient p1 = new Patient(01, "Thas", "Kallai", 12345);
 Patient p2 = new Patient(02, "Ashi", "Cbe", 14845);
 Patient p3 = new Patient(03, "Unab", "Madurai", 13945);
 Patient p4 = new Patient(04, "Zia", "Chennai", 12785);
 
 patien.add(p1);
 patien.add(p2);
 patien.add(p3);
 patien.add(p4);
 
 Doctor tada = new Doctor(143, "TTT", "Gynagologist", patien);
 
// for(Patient details:tada.getPatient()) {
	// System.out.println(details);
	
// }
 
	//HashSet<Patient> patients2=new HashSet<>();
	//patients2.add(Patient4);
	//patients2.add(Patient5);
	//patients2.add(Patient6);

	//Doctor rev=new Doctor(222, "REV", "VPD", patients2);
	
	 Map<Doctor,Set<Patient>> map=new HashMap<>();

	 map.put(tada, patien);
	
	 Appointment app=new Appointment(map);
	 System.out.println(app.getPatients(tada));
	}
}

 
 //HashMap<Doctor,Set<Patient>> patients=new HashMap<>();
// System.out.println(patients.equals(patients));
// if() {
	 
 

 
//     Patient p11 = new Patient(011, "Has", "Kallai", 14545);
//     Patient p22 = new Patient(022, "Ahi", "Cbe", 14785);
//     Patient p33 = new Patient(033, "Nab", "Madurai", 17845);
//     Patient p44 = new Patient(044, "Ziana", "Chennai", 14585);
//     
//     Map<Doctor,Set<Patient>> patients=new HashMap<>();
//      System.out.println(patients.put(101, "has" ));
// 
 
// Patient p11 = new Patient(011, "Has", "Kallai", 14545);
// Patient p22 = new Patient(022, "Ahi", "Cbe", 14785);
// Patient p33 = new Patient(033, "Nab", "Madurai", 17845);
// Patient p44 = new Patient(044, "Ziana", "Chennai", 14585);
// 
// patien.add(p11);
// patien.add(p22);
// patien.add(p33);
// patien.add(p44);
// 
// Doctor pada = new Doctor(183, "PPP", "ChildSpecialist", patien);
// 
// 

	


