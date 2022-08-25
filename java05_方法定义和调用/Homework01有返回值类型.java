import java.util.Scanner;

/*
 * 判断某个年份是否为闰年
 * 
 * 
 * */
public class Homework01有返回值类型 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println(isLeapyear(year));
		/*
		 * boolean result = isLeapyear(year); 
		 * System.out.println(result);
		 */
		
	}
	/*判断一个年份是否为闰年
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
