import java.util.Scanner;

/*
 * �������������������������Լ����С�����������������Խ����������� ��
 * 
 * 
 * 
 * */
public class Homework3 {
	public static void main(String[] args) {
		int divisor = 0;
		Scanner sc = new Scanner(System.in);
		 System.out.println("�������һ��������");
		 int m = sc.nextInt();
		 System.out.println("������ڶ���������");
		 int n = sc.nextInt();
		  for(int i = 2 ; i <= m && i <= n ; i++) {
			  if(m % i == 0 && n % i == 0) {
				  divisor = i;    }
		  }
		  System.out.println("���Լ����" + divisor);
	}

}
/*
 * 
 * 
 * 
 * 
 * 
 * */
