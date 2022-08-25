import java.util.Scanner;

/*
 * 
 * 
 * 
 * */
public class Task04方法实现判断素数 {
	
	public static void main(String[] args) {
		while(true) {System.out.println("请输入数字：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
			System.exit(0);
		}
		judgePrimeNumber(num);
		boolean result = judgePrimeNumber(num);
		System.out.println("结果为：" + result);
	}
		}

	public static boolean judgePrimeNumber(int date) {
		// TODO Auto-generated method stub
		boolean result = true;//这种判断一般要这样的事先定义
		for(int i = 2 ; i < date ; i++) {
			if(date % i == 0) {  
				result = false;
				break;    
				}
		}
			return result;
	}

}
