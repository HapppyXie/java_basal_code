import java.util.Scanner;

/*
 * 
 * 
 * 
 * */
public class Task04����ʵ���ж����� {
	
	public static void main(String[] args) {
		while(true) {System.out.println("���������֣�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
			System.exit(0);
		}
		judgePrimeNumber(num);
		boolean result = judgePrimeNumber(num);
		System.out.println("���Ϊ��" + result);
	}
		}

	public static boolean judgePrimeNumber(int date) {
		// TODO Auto-generated method stub
		boolean result = true;//�����ж�һ��Ҫ���������ȶ���
		for(int i = 2 ; i < date ; i++) {
			if(date % i == 0) {  
				result = false;
				break;    
				}
		}
			return result;
	}

}
