import java.util.Scanner;

//�����ϵͳ
public class Homework02_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("��ѡ��ͼ�Σ�1���� 2������ 3Բ");
		 //ѡ��ͼ��
		 double shape = sc.nextDouble();
		  if(shape == 1) {
			  System.out.println("�����볤�Ϳ�");
			  double length = sc.nextDouble();
			  double breath = sc.nextDouble();
			  System.out.println("�����"+ length * breath);
		  }else if(shape == 2) {
			  System.out.println("������һ���ߺ͸�");
			  double side = sc.nextDouble();
			  double heigth =sc.nextDouble();
			  System.out.println("�����"+ 0.5 * side * heigth);
		  }else if(shape == 3) {
			  System.out.println("������뾶");
			  double r = sc.nextDouble();
			  double i = 3.14159256;
			  System.out.println("�����"+ i * r * r);
		  }else {
		  System.out.println("�����������������");
		  }
	}
		    
	}
}
