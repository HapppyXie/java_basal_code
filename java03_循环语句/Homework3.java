import java.util.Scanner;

/*
 * 任意输入两个整数，求其最大公约数（小于这两个数，并可以将两个数整除 ）
 * 
 * 
 * 
 * */
public class Homework3 {
	public static void main(String[] args) {
		int divisor = 0;
		Scanner sc = new Scanner(System.in);
		 System.out.println("请输入第一个整数：");
		 int m = sc.nextInt();
		 System.out.println("请输入第二个整数：");
		 int n = sc.nextInt();
		  for(int i = 2 ; i <= m && i <= n ; i++) {
			  if(m % i == 0 && n % i == 0) {
				  divisor = i;    }
		  }
		  System.out.println("最大公约数：" + divisor);
	}

}
/*
 * 
 * 
 * 
 * 
 * 
 * */
