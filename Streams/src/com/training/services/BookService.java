//package com.training.services;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collector;
//
//import com.training.ifaces.CrudRepository;
//import com.training.model.Book;
//
//public class BookService implements CrudRepository {
//	private ArrayList<Book> bookList;
//	
//
//	public BookService() {
//		super();
//		this.bookList = new ArrayList<>();
//	}
//
//	@Override
//	public  boolean add(Book book) {
//		
//		return bookList.add(book);
//	}
//
//	@Override
//	public Book findByID(int id) {
//		Book found = null;
//		for(Book eachBook:this.bookList) {
//			if(eachBook.getBookNumber()==id) {
//			found = eachBook;	
//			}
//			
//		}
//		return found;
//	}
//
//	@Override
//	public boolean remove(Book book) {
//		
//		return false;
//		
//	}
//
//	@Override
//	public List<Book> findAll() {
//		
//		return this.bookList;
//	}
//
//	@Override
//	public Book update(Book oldbook, Book newBook) {
//		if(this.bookList.contains(oldbook)) {
//			int idxPos = this.bookList.indexOf(oldbook);
//			//System.out.println("inside if block ########");
//			
//		
//			//System.out.println("inside else block #########");
//		}
//		return newBook;
//	}
//	//public List<Book> getBook
//		
//		public List<Book> findBooksGrtThan(double price){
//			return this.bookList.stream().filter(e ->e.getPrice()>price)
//					.collect(toList());
//			
//			public List<String> getBookNames(){
//				return this.bookList
//						.stream()
//						.filter(e->e.getPrice()>price)
//						.map(e-> e.getBookName())
//						.collect(toList());
//				
//			}
//		}
//		public List<Book> getBooksGrtThan(double price){
//			
//		}
//	List<Book> grtThanList = new ArrayList<>();
//	public List<Book> getBookGrtThan(double price){
//		List<Book> grtThanList=new ArrayList<>();
//		Predicate<Double> grtThan = (value)->value>price;
//	}
//
//}
//



package com.training.services;

import java.util.List;
import static java.util.stream.Collectors.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {
	
	private ArrayList<Book>bookList;
	
	
    public BookService() {
		super();
		this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
	    //boolean result=bookList.add(book);
		//return result
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		Book found=null;
		for (Book eachBook:this.bookList) {
			if (eachBook.getBookNumber()==id) {
				found=eachBook;
				
			}
		}
			return found;
			
		
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldbook,Book newBook) {
	      if(this.bookList.contains(oldbook)) {
	    	  //System.out.println("INSIDE IF BLOCK #######");
	    	  
	    	  int idxPos=this.bookList.indexOf(oldbook);
	    	  this.bookList.set(idxPos, newBook);
	      }
	    
		return newBook;
		
	}
	public List<Book> findBooksGrtThan(double price){
		return this.bookList.stream().filter(e -> e.getPrice()>price).collect(toList());
	}
	public List<String> getBookNames(){
		return this.bookList
				.stream()
				.map(e-> e.getBookName()).collect(toList());
	}
	public List<String> getBookNameGrtThanPrice(double price){
		return this.bookList
				.stream()
				.filter(e->e.getPrice()>price)
				.map(e-> e.getBookName())
				.collect(toList());
	}
			
		

}