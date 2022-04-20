package com.training.Maven_project1;

public class Book {
private String bookName;
private double bookPrice;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(String bookName, double bookPrice) {
	super();
	this.bookName = bookName;
	this.bookPrice = bookPrice;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}
@Override
public String toString() {
	return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
}


}
