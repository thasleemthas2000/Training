package com.task.model;

public class Employee {

	
	private int employeeID;
	private String customerName;
	private long phoneNumber;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Employee(int employeeID, String customerName, long phoneNumber) {
		super();
		this.employeeID = employeeID;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
