package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {
		
		String dateOfBirth = "1998-08-26";
				Student ashi = new Student();
		ashi.setRollNumber(102);
		ashi.setStudentName("ASHI");
		ashi.setDateOfBirth(LocalDate.parse(dateOfBirth));
		ashi.setDateOfJoining(LocalDateTime.now());
		
		
		System.out.println("YEAR :" +ashi.getDateOfBirth().getYear());
		System.out.println(("MONTH :" +ashi.getDateOfBirth().getMonth()));
		System.out.println("DAY :"+ashi.getDateOfBirth().getDayOfMonth());
	}

}
