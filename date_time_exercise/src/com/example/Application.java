package com.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class Application {

	public static void main(String[] args) {
		Student thas = new Student(101, "Thas", 
				LocalDate.of(2000, 10, 31),
				LocalDateTime.of(2000, 10, 31, 8, 30));
		
		System.out.println("Thas Year of Birth :" +thas.getDateOfBirth().getYear());
		System.out.println(thas.getRollNumber());
		System.out.println(thas.getStudentName());
		System.out.println(thas.getDateOfBirth());
		System.out.println(thas.getDateOfJoining());
		System.out.println(thas);
		
		System.out.println("Thas Fifth Birthday :"+thas.getDateOfBirth().plus(5, ChronoUnit.YEARS));
	}

}
