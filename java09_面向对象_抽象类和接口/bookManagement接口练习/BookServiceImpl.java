package bookManagement�ӿ���ϰ;

import java.util.Arrays;
import java.util.Scanner;




public class BookServiceImpl implements BookService{
	public static Book [] book1 = new Book[20]; 
	public static Scanner sc = new Scanner(System.in);
	public static int maxIndex = -1;
	
	public static void main(String[] args) {
	while(true) {
		System.out.println("ͼ�������ѡ�����");
		System.out.println("1.����ͼ�飬2.ɾ��ͼ�飬3.����ͼ��");
		System.out.println("4.ͨ��ͼ��Id��ѯͼ��,5.�˳�ϵͳ");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("����ͼ�飬������Book���͵Ķ���");
		
//int id,String name,String author,String publisher,String ISBM,double price			
			//id���Զ�����
			maxIndex++;
			int id = maxIndex+1;
			System.out.println("ͼ�����ƣ�");
			String name = sc.next();
			System.out.println("ͼ�����ߣ�");
			String author = sc.next();
			System.out.println("ͼ������̣�");
			String publisher = sc.next();
			System.out.println("ͼ��ISBM,��Ϊ4���ַ�");
			String ISBM = sc.next();
			System.out.println("ͼ��۸�");
			double price = sc.nextDouble();
			Book bo1 = new Book(id,name,author,publisher,ISBM,price);
			book1[maxIndex]=bo1;
			System.out.println("��ӳɹ�");
			System.out.println(book1[maxIndex].toString());
			break;
		case 2:
			System.out.println("ɾ��ͼ�飬������ͼ���Id");
			int id_delete = sc.nextInt();     
			for(int i = 0;i<maxIndex+1;i++) {
				 if(id_delete==book1[i].id) {
					 System.out.println("�ҵ�ͼ�飬����ϰ��ֻ����");
					 System.out.println(book1[i]);
				 }
			}
			break;
		case 3:
			System.out.println("����ͼ�飬������Book���͵Ķ���");
			break;
		case 4:
			System.out.println("ͨ��ͼ��Id��ѯͼ��");
			break;
		case 5:
			System.out.println("�˳�ϵͳ�ɹ���");
			System.exit(0);
		default:
			System.out.println("ѡ������������ѡ��");
			break;
			
		}
	}
}
	
	public boolean addBook(Book b) {
		
		return false;
	}

	
	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBook(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
