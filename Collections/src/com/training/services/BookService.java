package com.training.services;

import java.util.List;
import java.util.ArrayList;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {
	private ArrayList<Book> bookList;
	

	public BookService() {
		super();
		this.bookList = new ArrayList<>();
	}

	@Override
	public  boolean add(Book book) {
		
		return bookList.add(book);
	}

	@Override
	public Book findByID(int id) {
		Book found = null;
		for(Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
			found = eachBook;	
			}
			
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		
		return false;
		
	}

	@Override
	public List<Book> findAll() {
		
		return this.bookList;
	}

	@Override
	public Book update(Book oldbook, Book newBook) {
		if(this.bookList.contains(oldbook)) {
			int idxPos = this.bookList.indexOf(oldbook);
			//System.out.println("inside if block ########");
			
		
			//System.out.println("inside else block #########");
		}
		return newBook;
	//public List<Book> getBook
	}
}
