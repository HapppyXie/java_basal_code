package API快速入门1;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar日历类
 * 
 * */
public class Task07日期相关类02 {
	public static void main(String[] args) {
		//获取指定日期
		Calendar c1 = Calendar.getInstance();
		int year = c1.get(Calendar.YEAR);
		System.out.println(year);
		int month = c1.get(Calendar.MONTH)+1;//1月份从0开始
		System.out.println(month);
		//月份中的日
		int day = c1.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		//一周的星期几
		int week = c1.get(Calendar.DAY_OF_WEEK)-1;//星期从星期日开始
		System.out.println(week);
		
		System.out.println("--------");
		//设置指定日期,Date中可以获得指定日期，但过时了
		//通过Calendar获取时间，并转成日期对象
		Calendar c2 = Calendar.getInstance();
		c2.set(2022, 1, 23);
		//Calendar->Date 
		Date d1 = c2.getTime();
		System.out.println(d1);
		
		
		System.out.println("---------");
		// Date -> Calendar
		Date d2 = new Date();
		System.out.println(d2);
		Calendar c3 = Calendar.getInstance();
		c3.setTime(d2);
		System.out.println(c3.get(Calendar.YEAR));
		System.out.println(c3.get(Calendar.MONTH)+1);
		System.out.println(c3.get(Calendar.DAY_OF_WEEK)-1);
	
		
	}

}
