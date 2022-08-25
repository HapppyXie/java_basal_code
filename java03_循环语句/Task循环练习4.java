import java.util.Scanner;

/*
 * 
 * 打印1000以内的水仙花数
 * (1个三位数，它的每个位上的数字的3次幕之和等于它本身)
 * 153 = 1*1*1 + 5*5*5 + 3*3*3
 * 初值 int num = 100;
 * 条件 num < 1000;
 * 循环语句 判断是否符合 if(num = )
 *    分解水仙花数 成三个数
 *          num++
 * 
 * */
public class Task循环练习4 {
	public static void main(String[] args) {
		int hun = 0;//百位
		int ten = 0;//十位
		int sin = 0;//个位
		for(int num = 100 ; num < 1000 ; num++) {
			hun = num / 100;
			ten = num % 100 / 10;
			sin = num % 100 % 10;//也可写成 num % 10对十位取余
			if(num == hun * hun * hun + ten * ten * ten + sin *sin *sin) {
				System.out.println("百位："+ hun);
				System.out.println("十位："+ ten);
				System.out.println("个位："+ sin);
				System.out.println("水仙花数："+ num);
			}
		}
		
		//设计一个程序判断一个整数是不是水仙花数
	   Scanner sc = new Scanner(System.in);
	 while(true) {
	   System.out.println("请输入一个整数");
	   int num = sc.nextInt();
	   int hun2 = num/100;
	   int ten2 = num%100/10;
	   int sin2 = num%100%10;
	   if(num == sin2*sin2*sin2 + ten2*ten2*ten2 + hun2*hun2*hun2) {
		   System.out.println("该数为水仙花数");
	   }else {
		   System.out.println("该数不是水仙花数");
	   }
		
	}
	}

}
