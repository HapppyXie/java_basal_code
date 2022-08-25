package bookManagement接口练习;
/*
 * 图书管理业务与实现
 * */
public interface BookService {
	boolean addBook(Book b);
	boolean deleteBook(int id);
	boolean updateBook(Book b);
	public Book findById(int id);
	

}
