package API快速入门1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * 日期：LocalDate  年月日
 * 时间：LocalTime  时分秒
 * 日期时间：LocalDateTime  年月日时分秒
 * 时间戳：Instant
 * 转换类DateTimeFormatter
 * 
 * 主要应用（LocaleDate为例）：
 * 
 * */
public class Task08日期相关类JDK8新增 {
	//主要应用（LocaleDate为例）：
	//获取日期时间
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		int year = date1.getYear();
		System.out.println(date1);
		System.out.println("年:"+year);
		int month = date1.getMonth().getValue();
		System.out.println("月:"+month);
		int day = date1.getDayOfMonth();
		System.out.println("日:"+day);
		int weekday = date1.getDayOfWeek().getValue();
		System.out.println("星期:"+weekday);
		
	//设置时间
		LocalDate date2 = LocalDate.of(2011,11,11);
		System.out.println(date2);
		
		System.out.println("--------------------");
	//数据转换
		String str1 = "2022-01-11";//默认-位间隔
		LocalDate ld1 = LocalDate.parse(str1);//第一种
		System.out.println(ld1);
		
		String str2 = "2022/01/11";//可指定间隔,第二种
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ld2 = LocalDate.parse(str2,formatter);
		System.out.println(ld2);
		
		System.out.println("-------------------");
	//日期运算
		LocalDate l1 = LocalDate.of(2022,11,11);
		System.out.println("日期:"+l1);
		LocalDate b1 = l1.plusYears(1);//加一年
		System.out.println("b1:"+b1);
		LocalDate b2 = l1.minusMonths(2);//减两月
		System.out.println("b2:"+b2);
		LocalDate b3 = l1.minusDays(3);//减三天
		System.out.println("b3:"+b3);
		
		System.out.println(l1 == b1);
	//LocalDate为不可变
		
	//数据比较
		System.out.println("-----------");
		LocalDate date4 = LocalDate.parse("2022-01-28");
		LocalDate date5 = LocalDate.parse("2022-04-11");
		System.out.println(date4.isAfter(date5));
		System.out.println(date4.isBefore(date5));
		System.out.println(date4.isEqual(date5));
	}	
}
