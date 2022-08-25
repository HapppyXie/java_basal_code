package com.study.library.pojo;

public class Book {
	private int bookId;
	private String bookName;
	private int bookISBM;
	private String author;
	private double price;
	public Book() {
		super();
	}
	public Book(int bookId, String bookName, int bookISBM, String author, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookISBM = bookISBM;
		this.author = author;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookISBM() {
		return bookISBM;
	}
	public void setBookISBM(int bookISBM) {
		this.bookISBM = bookISBM;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookISBM=" + bookISBM + ", author=" + author
				+ ", price=" + price + "]";
	}
	
	

}
