package Homeork03图书管理系统;
/*
 * 关于命名规范：1.字母，数字，(下划线，$)慎用
 *           2.类名，大骆驼命名法
 *           3.属性，方法名：小骆驼命名法
 *           4.禁止使用拼音和中文
 *           5.缩写词：使用公众通用的词语 
 * */
public class Book {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookConcern;
	private String bookISBN;
	private double bookPrice;
	private String bookDescribtion;
	
	
	
	
	public Book() {
		
		
	}
	
	public Book(int bookId, String bookName, String bookAuthor, String bookConcern, String bookISBN, double bookPrice,
			String bookDescribtion) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookConcern = bookConcern;
		this.bookISBN = bookISBN;
		this.bookPrice = bookPrice;
		this.bookDescribtion = bookDescribtion;
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

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookConcern() {
		return bookConcern;
	}

	public void setBookConcern(String bookConcern) {
		this.bookConcern = bookConcern;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookDescribtion() {
		return bookDescribtion;
	}

	public void setBookDescribtion(String bookDescribtion) {
		this.bookDescribtion = bookDescribtion;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookConcern="
				+ bookConcern + ", bookISBN=" + bookISBN + ", bookPrice=" + bookPrice + ", bookDescribtion="
				+ bookDescribtion + "]";
	}
	
	
	

}
