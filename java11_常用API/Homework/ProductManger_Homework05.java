package Homework;
import java.util.Scanner;
/*
 * ʹ����Ķ��������ݸ�ʽҪ��
 * 
 * �����������뵥�����һ���������ڸ÷����н��и�ʽ��֤�����շ��ط��ϸ�ʽҪ�������
 * 		���ѡ�� int getSelectNum()
 * 		��õ��� double getPrice()
 * 		��ÿ�� int getStore()
 * 		
 * */
public class ProductManger_Homework05 {
	//�洢��Ʒ������
	public static Product [] products = new Product[100];
	//������Ʒ����ĵ�ǰ������±�
	public static int maxIndex = -1;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int select = 0;
		while(true) {
			System.out.println("-----------------------------------------------");
			
			System.out.println("--1.����--2.ɾ��--3.�޸�--4.��ѯ--5.��ӡȫ��--6.�˳�--");
			
			System.out.println("-----------------------------------------------");
		    System.out.println("��ѡ��ҵ��:");
		    select = getSelectNum();
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
    
	//����
	private static void save() {
		// TODO Auto-generated method stub
		System.out.println("-------------������Ʒ----------------");
        maxIndex++;
        int id = createNo();
        System.out.println("����������");
        String name = sc.next();
        System.out.println("���������");
        String category = sc.next();
        System.out.println("������۸�");
        double price = getPrice();
        System.out.println("��������");
        int stock = getStore();
        System.out.println("����������");
        String describtion = sc.next();
        //��϶���
//int id, String name, String category, double price, int stock, String describtion, int state
        Product p = new Product(id, name , category , price , stock , describtion , 1);
        products[maxIndex] = p; 
        System.out.println("���ӳɹ�");
	}
  
	//ɾ��
	private static void delete() {
		// TODO Auto-generated method stub
		System.out.println("-----------ɾ����Ʒ------------");
		System.out.println("-----------������Ҫɾ������Ʒ���--------------");
		int id = sc.nextInt();
		int index = findIndex(id);
		if(index == -1) {
			System.out.println("û���ҵ�����Ʒ��Ϣ");
		}else if(products[index].getState() == 0) {
			System.out.println("����Ʒ�ѱ�ɾ��");
		}else {
			//��ӡ��Ʒ��Ϣ
			printProduct(index);
			System.out.println("��ȷ��Ҫɾ���� 1��  0��");
			int answer = sc.nextInt();
			//ִ��ɾ��
			if(answer == 1) {
			products[index].setState(0);
			System.out.println("ɾ���ɹ�");
			}else if(answer == 0) {
				System.out.println("ȡ��ɾ��");
			}else {
				System.out.println("���ѡ������������ѡ��");
			}
		}
	}
           //�޸�
	private static void update() {
		// TODO Auto-generated method stub
		System.out.println("------------�޸���Ʒ------------");
		System.out.println("������Ҫ�޸ĵ���Ʒ���");
		int id = sc.nextInt();
		int index = findIndex(id);
		//������Ʒ
		if(index == -1) {
			System.out.println("û���ҵ�����Ʒ��Ϣ");
		}else if(products[index].getState() == 0) {
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
	        String describtion = sc.next();
   //������϶��� Ҳ������޸�
	        Product p = new Product(id,name,category,price,stock,describtion, 1);
	        products[maxIndex] = p; 
	        System.out.println("�޸ĳɹ�");
		}
	}
         //��ѯ  �������ƻ���� ����
	private static void query() {
		// TODO Auto-generated method stub
        System.out.println("-------------��ѯ-------------");		
		System.out.println("------1.����--2.���------");
		int select = sc.nextInt();
		if(select == 1) {
			//�����Ʋ�Ѱ
			System.out.println("���������ƹؼ���:");
			String Name = sc.next();
			int flag = 0;
			for(int y = 0 ; y <= maxIndex ; y++) {
				//indexof()ģ������
				// s1 = ���ȱ�; s2 = ��   
				//s1.indexOf(s2)��s1�в��Ҵ治����s2����ַ���
				//�Ҳ��� s1.indexOf(s2) = -1 �ҵ��򷵻ص�ǰ����
				if(products[y].getName().indexOf(Name) != -1 && products[y].getState() == 1) {
					System.out.println(products[y]);
					flag = 1;
				}
			}			
			if(flag == 0) {System.out.println("û�в�ѯ������Ʒ��Ϣ");}
			
		}else if(select == 2) {
			//������ѯ
			System.out.println("�������ؼ���");
			String Category = sc.next();
			int flag = 0;
			for(int y = 0 ; y <= maxIndex ; y++) {
				if(products[y].getCategory().indexOf(Category) != -1 && products[y].getState() == 1) {
					System.out.println(products[y]);
				}
			}
			System.out.println("û�в�ѯ������Ʒ����Ϣ");
			
		}else {
			System.out.println("��������������");
		}
		}	
         //��ӡ����  ����  ����Ʒ��Ϣ
	private static void printAll() {
		// TODO Auto-generated method stub
		System.out.println("---------------��ӡ������Ʒ��Ϣ-------------------");
		for(int j = 0 ; j <= maxIndex ; j++) {
			if(products[j].getState() == 1) {//�ж���Ʒ״̬
			System.out.println(products[j]);
			}
		}
	}
	/*
	 * ����ҵ��1���Զ����ɱ��
	 * 
	 * */
	public static int createNo() {
		if(maxIndex == 0) {
			return 1;
		}else {
			//��һ����Ʒ�ı��+1
			return products[maxIndex-1].getId()+1;
		}
	}
	/*
	 * ������Ʒ��Ų�����Ʒ���ڵ������λ��
	 * id ��Ʒ���
	 * return ����Ʒ�������е�����,����ҵ���������ֵ������Ҳ�������-1
	 * */
	public static int findIndex(int id) {
		int index = -1;//���˾��� id��ȥ1�����index
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(id == products[i].getId()) {
				index = i;
				break;
			}
		}
		return index;	
	}
	//��ӡָ�������µ���Ʒ
	public static void printProduct(int index) {
	     System.out.println(products[index]);
	}
	/*
	 * Ҫ���������������
	 * */
	 private static int getSelectNum() {
		 String num = "";
		 String regex = "^[0-9]$";
		 while(true) {
			 num = sc.next();
			 if(!num.matches(regex)) {
				 System.out.println("����ı����Ƿ�Χ�ڵ����֣�����������");
				 continue;
			 }else {
				 break;
			 }			 
		 }
		 return Integer.parseInt(num);
		}
	 /*
	  * Ҫ��������Ǹ�����
	  * */
    private static double getPrice() {
    	String price = "";
    	String regex = "^((([^0][0-9]+|0)\\.([0-9]{1,2}))$)|^(([1-9]+)\\.[0-9]{1,2})$)";
    	while(true) {
    		price = sc.next();
    		if(!price.matches(regex)) {
    			System.out.println("����ı�����С��������������");
    			continue;
    		}else {
    			break;
    		}
    	}
	return Double.parseDouble(price);
}
	private static int getStore() {
		String store = "";
		String regex = "^([0-9])|([1-9][0-9]+)$";
		while(true) {
			store = sc.next();
			if(!store.matches(regex)) {
				System.out.println("����Ŀ�����ݸ�ʽ��������������");
				continue;
			}else {
				break;
			}
		}
	return Integer.parseInt(store);
}
  
}