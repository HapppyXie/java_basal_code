package Homework;


import java.time.LocalDate;
import java.util.Scanner;



/*
 * 打印日历
 * 1.输入年份和月份
 * 2.求得该年份和月份是第一年的星期几
 * 3.从星期几-1处存入1-31或30或28或29
 * 4.打印数组，每7组换行
 * */
public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.输入年份和月份
		System.out.println("请输入年份");
		int year = sc.nextInt();
		System.out.println("请输入月份");
		int month = sc.nextInt();
		//2.求得该年份和月份是第一年的星期几
		LocalDate date = LocalDate.of(year, month,1);
		int weekday = date.getDayOfWeek().getValue()-1;
		//生成日历,存储数据
		//表格最大为6*7=42   
		int [] calendar = new int[42];
		//直接控制31天
		for(int i = 1; i <= 31; i ++) {
			calendar[weekday] = i;
			weekday++;
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				if(i == 30) {break;};
			}
			if(month == 2) {
				if(date.isLeapYear()) {
					if(i==29) {
						break;
					}else {
						if(i==28) {
							break;
						}
					}
				}
			}			
		}
		
		//4.打印数组，每7组换行
		int count = 0;
		System.out.println("一\t二\t三\t四\t五\t六\t日");
		for(int i = 0; i < calendar.length; i++) {
			if(calendar[i]==0) {
				System.out.print("\t");
			}else {
				System.out.print(calendar[i]+"\t");
			}		
				count++;
			if(count%7==0) {
				System.out.println();
			}
			
		}
		
	}
}
