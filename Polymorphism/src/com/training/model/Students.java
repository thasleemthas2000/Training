package com.training.model;

import com.training.ifaces.Conditional;

public class Students implements Conditional {
private int markScored;


	
	
	public int getMarkScored() {
	return markScored;
}




public void setMarkScored(int markScored) {
	this.markScored = markScored;
}




	public Students() {
	super();
	
}




	public Students(int markScored) {
	super();
	this.markScored = markScored;
}




	@Override
	public boolean test(Object value) {
		String strBranch = (String)value;
		boolean result = false;
		if(this.markScored>80 && strBranch.equalsIgnoreCase("ece")){
return true;
	}
return false;
	}}
