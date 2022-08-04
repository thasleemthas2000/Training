package com.example.model;

public class Book {
   private int BookId;
   private String bookName;
   private double price;

public Book(int bookId, String bookName, double price) {
	super();
	BookId = bookId;
	this.bookName = bookName;
	this.price = price;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + BookId;
	result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (BookId != other.BookId)
		return false;
	if (bookName == null) {
		if (other.bookName != null)
			return false;
	} else if (!bookName.equals(other.bookName))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	return true;
}

public int getBookId() {
	return BookId;
}

public void setBookId(int bookId) {
	BookId = bookId;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

}
