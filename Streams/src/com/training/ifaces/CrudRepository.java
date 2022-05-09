package com.training.ifaces;
import com.training.model.Book;
import java.util.*;
public interface CrudRepository {

	public boolean add(Book book);
	public Book findByID(int id);
	public boolean remove(Book book);
	public List<Book>findAll();
	public Book update(Book oldbook, Book recentBook);
	Book findById(int id);
	
}
