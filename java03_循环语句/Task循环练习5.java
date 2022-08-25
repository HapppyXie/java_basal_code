import java.util.Scanner;

/*
 * 
 * 输入a 和 n 的值计算Sn = a + aa + aaa + aaaa .....
 * 例如 a = 2， n = 5 ，Sn = 2 + 22 + 222 + 2222 + 22222 
 * 
 *         2 * (1 + 11 + 111 + 1111 + 11111)
 *         
 *         2 + 2 * 10 + 2 + 22 * 10 + 2.....后一个数为前一个数乘以10再加2
 *          
 * 
 * 
 * 
 * 
 * */
public class Task循环练习5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入 a 的值");
		 int a = sc.nextInt();
		System.out.println("请输入 n 的值");
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
