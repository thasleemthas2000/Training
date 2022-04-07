package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional {
private String typeOfCollege;


	public String gettypeOfCollege() {
	return typeOfCollege;
}


public void settypeOfCollege(String typeOfCollege) {
	this.typeOfCollege = typeOfCollege;
}


	public Principal() {
	super();
	// TODO Auto-generated constructor stub
}


	public Principal(String typeOfCollege) {
	super();
	this.typeOfCollege = typeOfCollege;
}


	@Override
	public boolean test(Object value) {
	String type = (String)value;
	boolean result = false;
	if(type.equals("engg")) {
		result = true;
	}
		return result;
	}

}
