package bookManagement½Ó¿ÚÁ·Ï°;

public interface BorrowService {
	boolean borrowBook(int bookId,int readerId);
	boolean returnBook(int BookId,int readerId);

}
