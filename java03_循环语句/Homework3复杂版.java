import java.util.Scanner;

/*
 * 任意输入两个整数，求其最大公约数（小于这两个数，并可以将两个数整除 ）
 *  
 *  判断谁大谁小
 *  判断大的是否可以被小的整除   可以则输出
 *                        不可以则穷举
 * 
 * */
public class Homework3复杂版 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("此程序可以求任意两个整数的最大公约数");
		 System.out.println("请输入第一个整数");
		 int m = sc.nextInt();
		 System.out.println("请输入第二个整数");
		 int n = sc.nextInt();
		 int divisor = 0;
		 //判断谁大谁小
		 int max = m > n ? m : n;
		 int min = m > n ? n : m;
		 
		 //判断能否被整除
		 
		 if(max % min == 0) {
			 System.out.println("最大公约数为：" + min);
		 }else {
			 for(int i = 2 ; i < min ; i++) {
				 if(max % i ==0 && min % i == 0 ) {
					 divisor = i;
				 }
			 }System.out.println("最大公约数为：" + divisor);
		 }
		 
	}

}
