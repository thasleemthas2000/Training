package com.training;
import java.util.function.*;
import java.util.*;

public class UsingPredicate {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("India", "SriLanka", "Indonesia", "Japan");
		Predicate<String> containsChar = (country)-> country.toUpperCase().startsWith("I");
		Consumer<String> consumer = (value) -> {
		if(containsChar.test(value)) {
		System.out.println(value);
		}
		};
		//more than 1 line of code in lambda, {} is must
		//but for a single line of code {} is optional
			names.forEach(consumer);
			//names.forEach((value)-> System.out.println(value));

	}

}
