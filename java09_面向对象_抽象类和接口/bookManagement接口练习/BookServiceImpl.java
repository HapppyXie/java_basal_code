package bookManagement接口练习;

import java.util.Arrays;
import java.util.Scanner;




public class BookServiceImpl implements BookService{
	public static Book [] book1 = new Book[20]; 
	public static Scanner sc = new Scanner(System.in);
	public static int maxIndex = -1;
	
	public static void main(String[] args) {
	while(true) {
		System.out.println("图书管理，请选择服务");
		System.out.println("1.增加图书，2.删除图书，3.更新图书");
		System.out.println("4.通过图书Id查询图书,5.退出系统");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("增加图书，请输入Book类型的对象");
		
//int id,String name,String author,String publisher,String ISBM,double price			
			//id可自动生成
			maxIndex++;
			int id = maxIndex+1;
			System.out.println("图书名称：");
			String name = sc.next();
			System.out.println("图书作者：");
			String author = sc.next();
			System.out.println("图书出版商：");
			String publisher = sc.next();
			System.out.println("图书ISBM,设为4个字符");
			String ISBM = sc.next();
			System.out.println("图书价格：");
			double price = sc.nextDouble();
			Book bo1 = new Book(id,name,author,publisher,ISBM,price);
			book1[maxIndex]=bo1;
			System.out.println("添加成功");
			System.out.println(book1[maxIndex].toString());
			break;
		case 2:
			System.out.println("删除图书，请输入图书的Id");
			int id_delete = sc.nextInt();     
			for(int i = 0;i<maxIndex+1;i++) {
				 if(id_delete==book1[i].id) {
					 System.out.println("找到图书，简单练习，只弹出");
					 System.out.println(book1[i]);
				 }
			}
			break;
		case 3:
			System.out.println("更新图书，请输入Book类型的对象");
			break;
		case 4:
			System.out.println("通过图书Id查询图书");
			break;
		case 5:
			System.out.println("退出系统成功！");
			System.exit(0);
		default:
			System.out.println("选择有误，请重新选择！");
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
