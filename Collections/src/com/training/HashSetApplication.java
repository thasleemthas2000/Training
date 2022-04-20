package com.training;
import com.training.model.Student;
import java.util.*;

public class HashSetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101, "Ram", 100);
		Student tom = new Student(102, "Tom", 99);
		Student com = new Student(103, "Com", 98);
        Student pom = new Student(103, "Com", 98);
        
        Set<Student> set = new HashSet<>();
        set.add(ram);
        set.add(tom);
        set.add(com);
        set.add(pom);
        
		System.out.println(set);
		System.out.println(set.size());
	}

}
