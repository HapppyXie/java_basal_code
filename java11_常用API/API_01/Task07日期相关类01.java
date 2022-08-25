package API快速入门1;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/*
 * 
 * */
public class Task07日期相关类01 {
	public static void main(String[] args) {
		//获取当前时间
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println("---------");
		//
		long times = System.currentTimeMillis();
		java.sql.Date d2 = new java.sql.Date(times);
		System.out.println(d2);
		
		System.out.println("---------");
		long times2 = d1.getTime();
		java.sql.Date d3 = new java.sql.Date(times2);//sql也有一个date
		System.out.println(d3);
		
		System.out.println("----------");
		Timestamp t1 = new Timestamp(times2);//sql包
		System.out.println(t1);//比较精准
		
		System.out.println("----------");
	//类型转换 日期之间的转换  日期类型 目标对象 = new 日期类型(其他日期对象.getTime());
		Date d4 = new Date();
		Timestamp t2 = new Timestamp(d4.getTime());
		System.out.println(t2);
		
		System.out.println("----------");
		
		//1.字符串-sql.Date日期类型
		String birth = "2002-3-1"; 
		//默认格式要求：yyyy-[m]m-[d]d hh:mm:ss[.f...]   []表示可选
		java.sql.Date d6 = java.sql.Date.valueOf(birth);
		System.out.println(d6);
		
		System.out.println("----------");
		//sql.Date日期类型转字符串,其他类似
		String s1 = d6.toString();
		
		
		//字符串-sql.Timestamp日期类型
		String s2 = "2000-02-09 10:53:11";
		Timestamp t4 = Timestamp.valueOf(s2);
		System.out.println(t4);
		System.out.println("----------");
		//如果Scanner用  sc.next();获取的数据不含空格 sc.nextLine()才获取整行数据
//		Scanner sc = new Scanner(System.in);
//		String hj = sc.nextLine();
		
		String s4 = t4.toString();
		
		//字符串-util.Date
		String s3 = "2000-02-06 11:01:12";
		Date dd = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//创建sdf日期格式化对象
		System.out.println(dd);
		String df = sdf.format(dd);
		System.out.println(df);
		
		
		
		
	}

}
