package com.training;

import java.io.File;
import java.security.Provider.Service;

import com.training.model.Book;
import com.training.services.BookService;

public class AppForStreams {

	public static void main(String[] args) {
	
		Book book = new Book(105, "Oracle", "Ashi", 1452);
		
		BookService service = new BookService();
		File file = new File("book.ser");
		int ch = 1;
		if(ch == 1) {
	
		boolean result = service.writeToStream(file, book);
		if(result) {
			System.out.println("One Record Serialized");
			
		}
	}else {
		Book fromFile = (Book)service.readFromStream(file);
		System.out.println(fromFile.getBookName());
		System.out.println(fromFile);
		}
		
	}
}
