package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101, "Ram", 100);
		Student tom = new Student(102, "Tom", 99);
		Student com = new Student(103, "Com", 98);
		
		
        HashMap<Integer, Student> map = new HashMap<>();
        
        //map.put(500, ram);
       // map.put(501, tom);
        
        // put means null bcoz only assigning value.
        //get means getting output
        
        System.out.println(map.put(500, ram));
        System.out.println(map.put(501, tom));
        System.out.println(map.put(502, com));
        
        System.out.println(map.get(500));
        System.out.println(map.get(501));
        System.out.println((map.get(502)));
        //System.out.println(map.get(504));
        // null means it is not replace..it is unique
	}

}




  
