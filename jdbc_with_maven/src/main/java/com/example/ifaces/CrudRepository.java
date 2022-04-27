package com.example.ifaces;
import java.lang.reflect.Member;

import java.util.List;


public interface CrudRepository<T> {

	public int add(T obj);
	public List<T> findAll();
	public int remove(int d);
	public T findById(int id);
	public int update(int Id,T obj);
	
	//ArrayList<CrudRepository> alist = new ArrayList<CrudRepository>();
	
	
}
