import java.util.Scanner;

public class Homework02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		//输入数据
		if(month == 1 || month == 3 || month == 5 || month == 7 ||
				+ month == 8 || month == 10 || month == 12) {
			System.out.println("31天");}
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println("30天");}
				if(month == 2 ) {//闰年2月是29天，平年2月28天
					if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
					System.out.println("29天");
					}else{   
					System.out.println("28天");
				}
				}} }//闰年 能被4整除但不能被100整除的数  或者能被400整除的数
