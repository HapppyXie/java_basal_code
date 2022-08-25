import java.util.Scanner;


/*
 * 任意输入一个整数，判断其是否为一个素数/质数(只能被一和自身整除的数)
 * 所有的数都可以被1和本身整除 
 *   所以应该区分 不仅可以被1和本身整除的数 而且还可以被其他数整除的数 就可以
 * 
 * 
 * 
 * */
public class Task03循环的break2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("判断一个整数是否为素数");
		System.out.println("请输入一个整数");
		int num = sc.nextInt();
		int flag = 0;//设置标注
            for(int i = 2 ; i < num ; i++) {
            	if(num % i == 0) {
            		flag = 1;//小技巧 设置标注 该数不是素数
            		break;
            	}
            }	
             if(flag == 1) {
            	 System.out.println("不是素数");
             }else {
            	 System.out.println("为素数");
             }
            
	}
	}
}
