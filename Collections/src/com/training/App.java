package com.training;
import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;
import com.training.utils.BookNameComparator;
public class App {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Thas");
		names.add("Nas");
		names.add("Naz");
		names.add("Fathi");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		
		Book java = new Book(101, "Java", "Suba", 450);
		Book spring = new Book(102, "Spring", "Deepa", 500);
		Book maven = new Book(103, "Maven", "Thas", 550);
		Book html= new Book(104, "HTML", "Kala", 600);
		Book python = new Book(105, "Python", "Mala", 650);
		
		CrudRepository service = new BookService();
		
		System.out.println("Is added: "+service.add(java));
		System.out.println("Is added: "+service.add(java));
		System.out.println("Is added: "+service.add(spring));
		System.out.println("Is added: "+service.add(maven));
		System.out.println("Is added: "+service.add(html));
		System.out.println("Is added: "+service.add(python));
		
		List<Book> bookList = service.findAll();
		Collections.sort(bookList);
		System.out.println(bookList);
		
		BookNameComparator bnc = new BookNameComparator();
		Collections.sort(bookList, bnc);
		 System.out.println("Sort by book");
		System.out.println(bookList);
	}

}
