package com.training.Maven_project1;


public class App 
{
    public static void main( String[] args )
    {
    	Book bok = new Book("Wings of Fire", 500.00);
    	
        System.out.println("Book name: "+bok.getBookName() );
        System.out.println("Book Price: "+bok.getBookPrice());
    }
}
