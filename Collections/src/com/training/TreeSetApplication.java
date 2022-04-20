package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101, "Ram", 100);
		Student tom = new Student(102, "Tom", 99);
		Student com = new Student(103, "Com", 98);
        Student pom = new Student(103, "Pom", 98);
        
        Set<Student> set = new TreeSet<>();
        set.add(ram);
        set.add(tom);
        set.add(com);
        set.add(pom);
        
        // for(Student e:set) // e is obj name, you can put anything. // Student is come
        //from Set<Student> set = new Treeset<>();
        
        for(Student eachStudent:set) {
        	System.out.println(eachStudent.getFirstName());
        }
        
		System.out.println(set);
		System.out.println(set.size());
	}

}
