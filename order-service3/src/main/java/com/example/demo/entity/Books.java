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

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity
@Table(name="Books_2022")
public class Books {

	@Id
	@Column(name="book_id")
	int id;
	
	@Column(name="author")
	String author;
	
	@Column(name="book_name")
	String bookName;
	
	@Column(name="printed_price")
	double printedPrice;
	
	@Column(name="discounted_price")
	double discountedPrice;
	
	@Column(name="published_year")
	int publishedYear;
	
	@Column(name="category")
	String category;
	
}


