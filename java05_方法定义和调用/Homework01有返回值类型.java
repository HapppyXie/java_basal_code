import java.util.Scanner;

/*
 * �ж�ĳ������Ƿ�Ϊ����
 * 
 * 
 * */
public class Homework01�з���ֵ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		System.out.println(isLeapyear(year));
		/*
		 * boolean result = isLeapyear(year); 
		 * System.out.println(result);
		 */
		
	}
	/*�ж�һ������Ƿ�Ϊ����
	 * 
	 * 
	 * */
	public static boolean isLeapyear(int year) {
		boolean leap = false;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			leap = true;
		}
		return leap;
	}

}
