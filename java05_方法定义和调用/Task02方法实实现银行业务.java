import java.util.Scanner;

/*
 * ����ʵ������ҵ��
 * 
 * */
public class Task02����ʵʵ������ҵ�� {
	 static int balance = 1000000;//�ܵ�Ǯ��
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("��ѡ��ҵ��1.ȡ�2.��3.��ѯ��4.�˳�");
		System.out.println("--------------------------------");
		int select = 0;
		select = sc.nextInt();
		switch(select) {
		case 1:
			withdraw();
			break;
		case 2:
			deposit();
			break;
		case 3:
			queryBalance();
			break;
		case 4:
			System.out.println("�˳�ϵͳ");
			System.exit(0);
		default:
				System.out.println("���ѡ������");
			
		}
	}
	public static void withdraw() {//ȡ��
		// TODO Auto-generated method stub
		System.out.println("---------ȡ��-----------");
		System.out.println("������ȡ����");
		int cash = sc.nextInt();
		if(cash <= balance) { //ȡ̫��Ǯ
			balance -= cash;  //���-ȡ����
			System.out.println("ȡ��ɹ�");
		}else {
			System.out.println("����");
		}
		System.out.println("�˻����Ϊ��"+balance);
	}
	public static void deposit() {//���
		// TODO Auto-generated method stub
		System.out.println("----------���--------");
		System.out.println("�뽫�ֽ���ڴ泮��");
		System.out.println("����������");
		int cash = sc.nextInt();
		balance += cash;
		System.out.println("���ɹ������Ϊ��"+balance);
	}
	public static void queryBalance() {//��ѯ���
		// TODO Auto-generated method stub
		System.out.println("-----------��ѯ���-----------");
		System.out.println("���Ϊ��"+ balance);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
