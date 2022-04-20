package com.training.ifaces;

//@FunctionalInterface // if u use functional interface only 1 method should be used.
public interface Conditional <T>{
	public boolean test(T t);
	default boolean negate(Double value){
	
	return value<=80.00;
}
	
	public static String getMessage() {
		return "Static method in Interface - Yes its Real :)";
	}
}
