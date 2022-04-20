package com.training.services;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double>, AgeCondition<Double> {


	@Override
	public boolean test(Double t) {
		
		return t>80;
	}

	@Override
	public boolean negate(Double value) {
		
		if(value>100) {
			return true;
		}else {
				return false;
			}
		}
		//boolean result1 = Conditional.super.negate(value);
		//boolean result2 = AgeCondition.super.negate(value);
		
//		if(result1 && result2) {
//			return true;
//		}else {
//			return false;
//		}
//		
//		return Conditional.super.negate(value);
	}


