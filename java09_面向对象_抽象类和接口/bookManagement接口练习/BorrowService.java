package bookManagement�ӿ���ϰ;

public interface BorrowService {
	boolean borrowBook(int bookId,int readerId);
	boolean returnBook(int BookId,int readerId);

}
