package com.task;

public class Customer {
	public int customerID;
	private String customerName;
	private long phoneNumber;
	private String location;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	String getCustomerName() {
		return customerName;
	}

	private void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	long getPhoneNumber() {
		return phoneNumber;
	}

	private void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	String getLocation() {
		return location;
	}

	private void setLocation(String location) {
		this.location = location;
	}

	public Customer(int customerID, String customerName, long phoneNumber, String location) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.location = location;
	}

	public void setCustomerPhone(int mobile) {
		// TODO Auto-generated method stub
		
	}

	public void setCustomerLocation(String location2) {
		// TODO Auto-generated method stub
		
	}
	
}
	
