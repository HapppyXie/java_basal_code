package com.study.homework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1.���ݵĴ洢��ArraysList
 * 2.��Ҫҵ��add(),delete(),update(),query(),printAll()
 * 3.����ҵ��createId(),printProduct(int index),findIndex(int id) 
 * 4.���ݸ�ʽ��֤ 
 * 
 * ͬ���ȴӸ���ҵ��ʼ
 * */
public class Homework04ProductManger {
	//�洢��Ʒ������
	//public static Product [] products = new Product[100];
	//������Ʒ����ĵ�ǰ������±�
	//public static int maxIndex = -1;
	static Scanner sc = new Scanner(System.in);
	static ArrayList <Product> Product = new ArrayList<Product>();
	
	public static void main(String[] args) {
		
		boolean result = readData();
		if(result == false) {
			System.out.println("��������ʧ�ܣ�");
			System.exit(0);
		}
		
		int select = 0;
		while(true) {
			System.out.println("-----------------------------------------------");			
			System.out.println("--1.����--2.ɾ��--3.�޸�--"
							+ "4.��ѯ--5.��ӡȫ��--6.�˳�--");			
			System.out.println("-----------------------------------------------");
		    System.out.println("��ѡ��ҵ��:");
		    //����֤
		    select = sc.nextInt();		    
		    switch(select) {	     
		    case 1:
		    	save();//
		    	break;
		    case 2:
		    	delete();
		    	break;
		    case 3:
		    	update();
		    	break;
		    case 4:
		    	query();
		    	break;
		    case 5:
		    	printAll();
		    	break;
		    case 6:
		    	System.exit(0);
		    default:
		    		System.out.println("���ѡ������������ѡ��");
		    }
		}
	}
	
	
	//////////////////////////////////////////////////////////////
	//save,delete,update���漰�����ݵ��޸�
		private static boolean writeData() {
			boolean result = true;
			try {
				//���������
				FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\Product.csv");
				PrintWriter pw = new PrintWriter(fw);
				//ͨ����д�ļ�
				for(Product p : Product) {
					pw.println(p);
				}
				//�ر���
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
				result = false;
			}
			return result;
	}
		
		private static Product lineToProduct(String line) {
			String [] buf = line.split(",");
			//int id, String name, String category, double price, 
			//int stock, String description, int state
				int id = Integer.parseInt(buf[0]);
				String name = buf[1];
				String category = buf[2].strip();
				double price = Double.parseDouble(buf[3]);
				int stock = Integer.parseInt(buf[4]);
				String description = buf[5];
				int state = Integer.parseInt(buf[6]);
				Product p = new Product(id,name,category,price,stock,description,state);
				return p;			
	}
		//���������ȶ�������
         private static boolean readData() {
        	 boolean result = true;
        	 try {
        		 File f = new File("C:\\Users\\mike\\Desktop\\Product.csv");
        		 if(!f.exists()) {
        			 f.createNewFile();
        		 }
        		 //����I��
				FileReader fr = new FileReader(f);
				BufferedReader bfr = new BufferedReader(fr);
				//ѭ�����ļ�
				while(true) {
					//��ȡһ����Ϣ
					String line = bfr.readLine();
					if(line == null) {
						break;
					}
					//�Ѷ��ص���String����ת��ΪProduct����
					Product p = lineToProduct(line);
					Product.add(p);
				}
			} catch (IOException e) {
			e.printStackTrace();
			result = false;
			}
        	 return result;
	}
              
	//����
	private static void save() {
		// TODO Auto-generated method stub
		System.out.println("-------------������Ʒ----------------");
        //maxIndex++;
        int id = createNo();
        System.out.println("����������");
        String name = sc.next();
        System.out.println("���������");
        String category = sc.next();
        System.out.println("������۸�");
        double price = sc.nextDouble();
        System.out.println("��������");
        int stock = sc.nextInt();
        System.out.println("����������");
        String describtion = sc.next();
        
        //��϶���
//int id, String name, String category, double price, int stock, String describtion, int state
        Product p = new Product(id, name , category , price , stock , describtion , 1);
        //products[maxIndex] = p; 
        //���뼯��
        Product.add(p);
        printAll();
      //�˴����ݱ䶯
        if(writeData()) {
        	System.out.println("��Ʒ��ӳɹ�!");
        }
	}
	
           //ɾ��
	private static void delete() {
		System.out.println("-----------ɾ����Ʒ------------");
		System.out.println("-----------������Ҫɾ������Ʒ���--------------");
		int id = sc.nextInt();
		int index = findIndex(id);
		//�ж���Ʒ�Ƿ����
		if(index == -1) {
			System.out.println("û���ҵ�����Ʒ��Ϣ");
		}else if(Product.get(index).getState() == 0) {
			System.out.println("����Ʒ�ѱ�ɾ��");
		}else {
			//��ӡ��Ʒ��Ϣ
			printProduct(index);
			
			System.out.println("��ȷ��Ҫɾ���� 1��  0��");
			int answer = sc.nextInt();
			//ִ��ɾ��
			if(answer == 1) {
			Product.get(index).setState(0);
			System.out.println("ɾ���ɹ�");
			//�˴����ݱ䶯
			if(writeData()) {
				System.out.println("ɾ���ɹ�!");
			}
			}else if(answer == 0) {
				System.out.println("ȡ��ɾ��");
			}else {
				System.out.println("���ѡ������������ѡ��");
			}
		}
	}
           //�޸�
	private static void update() {
		System.out.println("------------�޸���Ʒ------------");
		System.out.println("������Ҫ�޸ĵ���Ʒ���");
		int id = sc.nextInt();
		int index = findIndex(id);
		//������Ʒ
		if(index == -1) {
			System.out.println("û���ҵ�����Ʒ��Ϣ");
		}else if(Product.get(index).getState() == 0) {
			System.out.println("����Ʒ�ѱ�ɾ��");
		}else {
			printProduct(index);
			System.out.println("������������Ʒ��Ϣ");
			System.out.println("����������");
	        String name = sc.next();
	        System.out.println("���������");
	        String category = sc.next();
	        System.out.println("������۸�");
	        double price = sc.nextDouble();
	        System.out.println("��������");
	        int stock = sc.nextInt();
	        System.out.println("����������");
	        String description = sc.next();
   //������϶��� Ҳ������޸�
	        //Product p = new Product(id,name,category,price,stock,description, 1);
	        Product.get(index).setId(id);
	        Product.get(index).setName(name);
	        Product.get(index).setCategory(category);
	        Product.get(index).setPrice(price);
	        Product.get(index).setStock(stock);
	        Product.get(index).setDescription(description);
	        Product.get(index).setState(1);
	        printAll();
	      //�˴����ݱ䶯
	        if(writeData()) {
	        	System.out.println("�޸���Ʒ�ɹ�!");
	        }
		}
	}
         private static void query() {
	    System.out.println("-------------��ѯ-------------");		
		System.out.println("------1.����--2.���------");
		int select = sc.nextInt();
		if(select == 1) {
			//1.�����Ʋ�Ѱ
			System.out.println("���������ƹؼ���:");
			String Name = sc.next();
			int flag = 0;
			for(int y = 0 ; y <= Product.size() ; y++) {
				//indexOf()ģ������
				// s1 = ���ȱ�; s2 = ��   
				//s1.indexOf(s2)��s1�в��Ҵ治����s2����ַ���
				//�Ҳ��� s1.indexOf(s2) = -1 �ҵ��򷵻ص�ǰ����
		if(Product.get(y).getName().indexOf(Name) != -1 && Product.get(y).getState() == 1) {
				System.out.println(Product.get(y));
				flag = 1;
				}
			}			
			if(flag == 0) {System.out.println("û�в�ѯ������Ʒ��Ϣ");}			
		}else if(select == 2) {
			
			//2.������ѯ
			System.out.println("�������ؼ���");
			String Category = sc.next();
			int flag = 0;
			for(int y = 0 ; y <= Product.size() ; y++) {
				if(Product.get(y).getCategory().indexOf(Category) != -1 && Product.get(y).getState() == 1) {
					System.out.println(Product.get(y));
				}
			}
			System.out.println("û�в�ѯ������Ʒ����Ϣ");
			
		}else {
			System.out.println("��������������");
		}
		}
		
         //��ӡ����  ����  ����Ʒ��Ϣ
	private static void printAll() {
		System.out.println("---------------��ӡ������Ʒ��Ϣ-------------------");
		for(int j = 0 ; j < Product.size() ; j++) {
			if(Product.get(j).getState() == 1) {//�ж���Ʒ״̬
			System.out.println(Product.get(j));
			}
		}
	}
	
	/*
	 * ����ҵ��1���Զ����ɱ��
	 * 
	 * */
	public static int createNo() {
//		if(maxIndex == 0) {
//			return 1;
//		}else {
//			//��һ����Ʒ�ı��+1
//			return products[maxIndex-1].getId()+1;
//		}
		if(Product.isEmpty()) {
			return 1;
		}else {
			int index = Product.size()-1;
			return Product.get(index).getId()+1;
		}
	}
	
	public static int findIndex(int id) {
		int index = -1;//���˾��� id��ȥ1�����index��û�п�����Ʒɾ���������ĸı䣬���ڷ���+1=id�Ĺ���
		for(int i = 0 ; i <= Product.size() ; i++) {
			if(id == Product.get(i).getId() && Product.get(i).getState()==1){
				index = i;
				break;
			}
		}
		return index;	
		
	}
	//��ӡָ�������µ���Ʒ
	public static void printProduct(int index) {
	     System.out.println(Product.get(index));
	}
}