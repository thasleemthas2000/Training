package com.training.model;

public class Streams {

	private String Country;
	private String place;
	private Long population;
	
	public Streams() {
		super();
	}
	
	public Streams(String country, String place, Long population) {
		super();
		Country = country;
		this.place = place;
		this.population = population;
	}
	
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return "Streams [Country=" + Country + ", place=" + place + ", population=" + population + "]";
	}
	
	
	
}
