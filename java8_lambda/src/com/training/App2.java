package com.training;

import java.util.Arrays;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("India", "SriLanka", "Indonesia", "Japan");
		//names.forEach(value-> System.out.println(value));(take the value and print it using sysout 1 by 1)
		//normal forEach method
		
		names.forEach( System.out::println);//Method reference
		// take the each value passing the method as a reference(::) here not 1by 1. at a time in 1 place.
	}

}
