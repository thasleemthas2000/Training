package com.training.ifaces;

public interface AgeCondition<T>{

	default boolean Negate(Double age) {
		return age<52;
	}
}
