package com.training.ifaces;

@FunctionalInterface
public interface Converter<T, R> {
	
	public R convert(T value);
	//public R change(T value);
// E - element
	//K - key
	// T - argument type
	// R - return type
}
