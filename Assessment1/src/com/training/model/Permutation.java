               package com.training.model;

public class Permutation {
	public static void main(String[] args) {

	String str = "CAT";
	int n = str.length();
	Permutation permut = new Permutation();
	Permutation.permutation(str, 0, n-1);
	
	
	
}

	private static void permutation(String str, int a, int b) {
		
		if(a == b) {
			System.out.println(str);
		}else {
			for(int i=a; i<=b; i++ ) {
				str = swap(str, a, i);
				permutation(str, a+1, b);
				str = swap(str, a, i);
				
			}
		}
			
	}

	private static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		
		return String.valueOf(charArray);
	}
}