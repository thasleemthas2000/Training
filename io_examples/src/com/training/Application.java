package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void main(String[] agrs) {
		Book java = new Book(105, "Head  Java", "Thasgir", 800);
		BookService service = new BookService();
//		boolean result = service.writeToFile(new File("Book.txt"), java);
//		if(result) {
//			System.out.println("One Record Added to File");
//		}
		
		service.reafFromFile(new File("Book.txt")).forEach(System.out::println);;
	}
	
	
}
