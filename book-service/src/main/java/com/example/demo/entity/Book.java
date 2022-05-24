package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Table(name = "thasbook")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Book {

	@Id
	@Column(name = "Book_Number")
	int bookNumber;
	
	@Column(name = "Book_Name")
	String bookName;
	
	@Column(name = "Author")
	String author;
	
	@Column(name = "Price")
	double price;
}
