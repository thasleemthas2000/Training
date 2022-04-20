package com.example;
import java.util.*;
import java.sql.*;
import java. time.*;



public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		//step1: creating util date
		java.util.Date date1 = new java.util.Date();
		//java.sql.Date date2 = new java.sql.Date(102355);
		
		System.out.println(date1);
		System.out.println(date1.getTime());// it give millisec value of time
		//step2 : util date to sql date
		java.sql.Date date2 = new java.sql.Date(date1.getTime());// it give time
		System.out.println(date2);
		
		//step3 : Sql date to local date
		LocalDate localDate = date2.toLocalDate();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getMonth());

	}

}
