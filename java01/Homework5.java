import java.util.Scanner;

public class Homework5 {
         public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ոݔ��һ����λ��,���ɵó���ǧ���٣�ʮ����λ");
			int num = sc.nextInt();
			//ݔ��һ����λ����//
			//�\��//
	int thu = num / 1000;// /�� ֻ��ó���������λ
	int hun = num % 1000 / 100; //%ֻ��ó���������λ
	int ten = num % 100 / 10;
	int sig = num % 10;
			//ݔ���Y��//
			System.out.println("ǧλ��"+ thu);
			System.out.println("��λ��"+ hun);
			System.out.println("ʮλ��"+ ten);
			System.out.println("��λ��"+ sig);

			
		}
}
