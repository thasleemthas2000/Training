package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="Orders_2022")
public class Cart {

	@Id
	@Column(name="order_id")
	int orderId;
	
	
	@Column(name="user_id")
	 int userId;
	
	@Column(name="book_id")
	int bookId;
	
	@OneToMany(targetEntity = Books.class, fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "order_ref", referencedColumnName = "book_id")
	List<Books> bookList; 
}
