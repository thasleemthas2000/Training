package com.training;

public class Application {

	public static void main(String[] args) {
	Greeting getObj = new Greeting();
	//System s = new System();[system is constructor private, if u give system it will be error because already system is default]
	System.out.println(getObj.getMessage());
	System.out.println(Greeting.getInfo());
	}

}
