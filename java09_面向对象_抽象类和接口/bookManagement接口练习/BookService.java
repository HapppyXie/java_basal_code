package bookManagement�ӿ���ϰ;
/*
 * ͼ�����ҵ����ʵ��
 * */
public interface BookService {
	boolean addBook(Book b);
	boolean deleteBook(int id);
	boolean updateBook(Book b);
	public Book findById(int id);
	

}
