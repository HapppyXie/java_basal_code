package bookManagement½Ó¿ÚÁ·Ï°;

public class Book {
	int id;
	String name;
	String author;
	String publisher;
	String ISBM;
	double price;
	
	public Book() {
		
	}
	public Book(int id,String name,String author,String publisher,String ISBM,double price) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.ISBM=ISBM;
		this.price=price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getISBM() {
		return ISBM;
	}
	public void setISBM(String ISBM) {
		this.ISBM = ISBM;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", ISBM="
				+ ISBM + ", price=" + price + "]";
	}
	

}
