package com.example.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.model.Book;

public class BookService {
	
private Set<Book> bookList;

	
	public BookService() {
	super();
	this.bookList = new HashSet<>();
}


	public Set<Book> getBookList(){
		return this.bookList;
	}
 public int addBook(Book book) {
	return this.bookList.add(book)?0:1; 
 }
 
 public boolean removeBook(Book book) {
		boolean result=false;
		if (this.bookList.contains(book)) {
			this.bookList.remove(book);
			result=true;
		}else {
			throw new RuntimeException("Not There");
		}
		return result;
	}
 public List<String> getBestBooks(){
	 List<String> list=Arrays.asList("FaceBook", "Passbook", "Cookbook");
	 return list;
 }

	
}
