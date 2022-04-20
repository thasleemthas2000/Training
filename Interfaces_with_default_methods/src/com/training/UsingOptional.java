package com.training;

import java.util.Optional;

public class UsingOptional {

	public static Optional<String> getValue(int key) {
		Optional<String> response = Optional.empty();
		if(key == 1) {
			response = Optional.of("Hi");
		}
		return response;
	}
		public static Object getString(int key) {
		
		switch (key) {
		case 1:
			return new String("Chocolate");
			
		case 2:
			return new String("Cassatta");
		default:
			return null;
		}
	}
		
		
	
//	public static void main(String[] args) {
//	//will throw null pointer exception
//		//if u put values more than 3
////System.out.println(getString(1).toString());// if u put value more than 2 it show null point exeption bcoz case is only 1, 2
//	//}
////to avoid nullpointer exception and return a default value
//	//new feature of java 8 optional is used
//	
//	Optional<Object> optional = Optional.ofNullable(getString(3));
//	System.out.println(optional.orElse("VANNILA").toString());
//	
//	
//}}
//




public static void main(String[] args) {
	
	
	Optional<Object> optional = Optional.ofNullable(getValue(3));
	System.out.println(optional.orElse("Vannila").toString());
	
	Optional<Object> opt2=Optional.ofNullable(getValue(2));
	if(opt2.isPresent()) {
		System.out.println("value is present " + opt2.get());
		
	}else {
		System.out.println("value is not present");
	}
	
	//using the lambda expression with optional
//	Optional<Object> opt3=Optional.ofNullable(getValue(3));
//	opt3.orElseThrow(
//			()->new RuntimeException("no object for value 3"));
//			}

//call the getValue Method by passing 1 as argument
//call the same method again by passing 2 as argument
//print the results

Optional<String> resp = getValue(1);

if(resp.isPresent()) {
	System.out.println(resp.get().toString());
}else {
	System.out.println("Invalid Choice enter 1");
}
}
}
	
	

