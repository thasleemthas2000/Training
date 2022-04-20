package com.training;
import java.util.Arrays;
import java.util.Scanner;

import com.training.service.FruitsService;


public class Application {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Size");
int noOfLetters = sc.nextInt();
String[] str = new String[noOfLetters];
System.out.println("Enter Strings :");
for(int i = 0; i<noOfLetters; i++) {
	str[i] = sc.nextLine();
	FruitsService service = new FruitsService();
	service.add(str);
}
	}

}
