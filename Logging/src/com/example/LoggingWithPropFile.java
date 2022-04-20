package com.example;

import java.util.logging.Logger;

import com.example.model.Book;

public class LoggingWithPropFile {

	public static void main(String[] args) {
		 
		String file = LoggingWithPropFile.class.getClassLoader()
		.getResource("logging.properties")
		.getFile();
		
		//System.setProperty("java.util.logging config.file", file);
		//Book.log.info("logging properties done right");
		Book java = new Book();
		
		Logger log = Logger.getLogger("com.example");
		log.info(java.toString());
		
	}

}
