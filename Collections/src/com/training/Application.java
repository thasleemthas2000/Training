package com.training;
import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import java.util.List;
import com.training.services.BookService;

public class Application {
	
	public static void print(List<Book> books) {
		
		for(Book eachBook:books) {
			System.out.println(eachBook);
		}
		
	}

	public static void main(String[] args) {
		
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
		for(Book eachbook : bookList) {
			System.out.println(eachbook);
			System.out.println(eachbook.getBookNumber());
			System.out.println(eachbook.getBookName());
			System.out.println(eachbook.getAuthor());
			System.out.println(eachbook.getPrice());
		}
		
		print(service.findAll());
		Book foundBook = service.findByID(101);
		System.out.println("Found"+foundBook);
		
		service.remove(html);
		System.out.println("=============");
		List<Book> secondList = service.findAll();
		
		System.out.println("=============");
		
		print(service.findAll());
		Book react = new Book(106, "react", "hp", 10000);
		service.add(react);
		print(service.findAll());
		print(service.findAll());
		Book reactnew = new Book(109, "reactth", "Thasss", 15000);
		service.update(react, reactnew);
		System.out.println("=============");
		print(service.findAll());
		
	}

}