package com.training.services;
import com.training.model.Book;
import java.io.*;
import java.util.*;
public class BookService {

	public boolean writeToFile(File file, Book book) {
		boolean result = false;
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(file,true));)
			
			
{
	writer.println(book);
	result = true;
	//return result;

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return result;
		
	}
	
	public List<Book> reafFromFile(File file){
		List<Book> bookList = new ArrayList<Book>();
		String line = null;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			while((line = reader.readLine())!=null) {	
				String[] values = line.split(",");
				Book book = new Book(Integer.parseInt(values[0]), values[1], values[2], Double.parseDouble(values[3]));
				
				bookList.add(book);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		return bookList;
		
	}
}
