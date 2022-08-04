package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Greeting;

public class GreetingTest {
@Test
@DisplayName(value="Test the get Message return a string of length 8 characters")
void testMaxLengthOfGetMessage() {
	Greeting grtObj = new Greeting();
	int actual = grtObj.getMessage().length();
	int expected = 5;
	assertEquals(expected, actual);
	
	
}
@Test
@DisplayName(value="Test the get Message return a string of length 8 characters")
void testbirthdayWish() {
	Greeting grtObj = new Greeting();
			String actual = grtObj.birthdayWish("thas");
	assertNotNull(actual);
}
@Test
@DisplayName("Test birthday wish should return Happy birthday with user name suffixed")
void testhappyBirthdayThas() {
	Greeting grtObj = new Greeting();
	String name= "Thas";
	String actual = grtObj.happyBirthdayThas(name);
	String expected= "Happy Birthday "+name ;
	assertEquals(expected, actual);
}
}
