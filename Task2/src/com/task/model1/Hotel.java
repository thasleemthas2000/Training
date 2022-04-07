package com.task.model1;

public class Hotel {

	
	private String hotelName;
	private long phoneNumber;
	private String location;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Hotel(String hotelName, long phoneNumber, String location) {
		super();
		this.hotelName = hotelName;
		this.phoneNumber = phoneNumber;
		this.location = location;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
