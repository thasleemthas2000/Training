package com.example;
import com.example.model.Student;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Student ram = new Student();
//public methd unable to access


ram.setRollNumber(56);
//default method unable to access=>
//because student class is in com.example.model package
//and Application is in com.example package


ram.setMarkScored(100);
// unable to access application is not a sub class of student


ram.setFirstName("Ramm");
//unable to access application is not a sub class of student


System.out.println("Roll Number :"+ram.getRollNumber());
System.out.println("Mark Scored :"+ram.getMarkScored());
System.out.println("FirstName :"+ram.getFirstName());
Student shyam = new Student(490, "shyam", 89, "Mech");
System.out.println("Roll Number:"+shyam.getRollNumber());
System.out.println("Student Name :"+shyam.getFirstName());
	}

}
