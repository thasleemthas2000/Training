package com.training.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
import com.training.service.Fruits;

public class FruitsService implements Fruits {
	HashSet<String>fruit = new HashSet<>();

	@Override
	public String add(String[] obj) {
		for(int i = 0; i<obj.length; i++) {
			String elements = obj[i];
			fruit.add(elements);
		}
		ArrayList<String> list = new ArrayList<String>(fruit);
		Collections.sort(list);
		for(String str:list) {
			System.out.println(str);
			
		}
		return null;
	}
	

}
