import java.util.Scanner;

/*
 * 
 * 
 * 
 * */
public class Task03����ʵ������� {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("��ѡ��ͼ�Σ�");
		    System.out.println("1.���Σ�2.�����Σ�3.Բ��4.�˳�");
		
		int select = sc.nextInt();
		switch(select) {
		case 1:
			getSquareArea();//��������ǰ��һ����ĸ����ĸ��д��������ĸ����ĸ��Сд
			break;
		case 2:
			getTriangleArea();
			break;
		case 3:
			getRoundArea();
			break;
		case 4:
			System.out.println("�˳�ϵͳ");
			System.exit(0);
			default:
				System.out.println("���ѡ������");
		}
		}
	}
	public static void getSquareArea() {
		// TODO Auto-generated method stub
		System.out.println("�������ͳ���");
		int width = sc.nextInt();
		int length = sc.nextInt();
		System.out.println("�������Ϊ��" + width * length);
	}
	public static void getTriangleArea() {
		// TODO Auto-generated method stub
		System.out.println("������ߣ�");
		int heigth = sc.nextInt();
		System.out.println("������һ���ߣ�");
		int side = sc.nextInt();
		System.out.println("���������Ϊ��" +   heigth * side / 2);
	}
	public static void getRoundArea() {
		// TODO Auto-generated method stub
		System.out.println("������Բ�İ뾶��");
		double radius = sc.nextDouble();
		System.out.println("Բ�����Ϊ��" + 3.14159256 * radius * radius);
		
	}

}
