import java.util.Scanner;

/*
 * 
 * ����a �� n ��ֵ����Sn = a + aa + aaa + aaaa .....
 * ���� a = 2�� n = 5 ��Sn = 2 + 22 + 222 + 2222 + 22222 
 * 
 *         2 * (1 + 11 + 111 + 1111 + 11111)
 *         
 *         2 + 2 * 10 + 2 + 22 * 10 + 2.....��һ����Ϊǰһ��������10�ټ�2
 *          
 * 
 * 
 * 
 * 
 * */
public class Taskѭ����ϰ5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ a ��ֵ");
		 int a = sc.nextInt();
		System.out.println("������ n ��ֵ");
		 int n = sc.nextInt();
		int Sn = 0;
		int temp = a;
		for(int count = 1 ; count <= n; count++) {
			Sn += temp;
			temp = temp * 10 + a;
		}
		 System.out.println("Sn:" + Sn);
		
	}

}
