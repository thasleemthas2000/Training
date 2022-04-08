package com.training.services;

public class StringService {
	public void StringEquals(String str1, String str2) {
	System.out.println("is value same:"+ str1.equals(str2));
	System.out.println("are they pointing to same location:"+str1==str2);
}
	public void stringObjectEquals() {
		String ram = new String("ram");
		String ramudu = new String("ram");
		
		System.out.println("is value same:"+ ram.equals(ramudu));
		System.out.println("are they pointing to same location:"+ram==ramudu);
	}
	public String usingTrim(String name) {
		System.out.println("without trim:"+name);
		System.out.println("trim:"+name.trim());
		return name.trim();
	}
	
	public void lengthOfString(String name) {
		//String resp = usingTrim(name);
		System.out.println("String length:"+ name.trim().length());
}
	
	public void usingSubString(String name) {
		System.out.println(name.substring(3));
		System.out.println(name.substring(0,3));
	}
	public void usingCharAtAndIndexOf(String name) {
		System.out.println("index position of @"+name.indexOf('@'));
		System.out.println("character at position 3"+name.charAt(3));
	}
	public void usingReplace(String str1, String str2) {
		System.out.println("with replace: "+str1.replace(".com", "org"));
		System.out.println("with replaces: "+str2.replace('c', 'm'));
	}
	public void usingConcat(String str1, String str2) {
		System.out.println("using contact: "+str1.concat(str2));
		//string builder is mutable, so it can change
		
		StringBuilder builder = new StringBuilder(str1);
		builder.append(str2);
		System.out.println(builder.toString());
	}
	public void usingCompareTo(String str1, String str2) {
		System.out.println(str1.compareTo(str2));
	}
	public void usingStringFormat(String str1, double mark) {
	    String frmtString = String.format("%s", str1);
	    System.out.println(frmtString);
	    System.out.println(String.format("Mark %.2f", mark));
		
	}
	public void usingStringFormat(int mark) {
		System.out.println(String.format("octal %o", mark));
		System.out.println(String.format("hexa decimal %x", mark));
	}
	public void usingStringFormat(int mark1, int mark2) {
		System.out.println(String.format("octal %1$o, hexa %2$x", mark1,mark2));
	}
	public void usingStringFormat(String str1, String str2) {
		System.out.println(String.format("%1$s, %2$S", str1,str2));
	}
	public void usingStringFormat(long value) {
		System.out.println(String.format("%d",+value));
	}
}