package com.training;
import java.util.Set;
import java.util.TreeSet;

class Fruit implements Comparable<Fruit>{
	
	public String fruitsName;

	public String getFruitsName() {
		return fruitsName;
	}

	public void setFruitsName(String fruitsName) {
		this.fruitsName = fruitsName;
	}

	public Fruit(String fruitsName) {
		super();
		this.fruitsName = fruitsName;
	}

	@Override
	public int compareTo(Fruit value) {
		return this.fruitsName.compareTo(value.fruitsName);
	}

	@Override
	public String toString() {
		return this.fruitsName;
	}
	
	
}

public class Application {

	public static void main(String[] args) {
	
		Fruit fruit1=new Fruit("apple");
		Fruit fruit2=new Fruit("orange");
		Fruit fruit3=new Fruit("apple");
		Fruit fruit4=new Fruit("pineapple");
		Fruit fruit5=new Fruit("orange");
		Fruit fruit6=new Fruit("banana");
		
		Set<Fruit> set =new TreeSet<>();
		set.add(fruit1);
		set.add(fruit2);
		set.add(fruit3);
		set.add(fruit4);
		set.add(fruit5);
		set.add(fruit6);
		
		
		System.out.println(set);
		}
	}
	