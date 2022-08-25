package API快速入门1;

import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;



public class Task01API快速入门 {
	/*
	 * Java API:JDK提供给开发人员辅助程序开发的类及其包含的方法
	 * 导包嘛！
	 * API:application programming interface(一些预先定义的函数，什么的)
	 * 主要学习：1.常用API及其提供的常用功能
	 * 	   	  2.学会查看API文档：
	 * 打开API文档-从索引输入类名查看-（1.类信息 2.字段摘要 3.构造方法 4.方法摘要（成员方法））	 
	 * */	 

	public static void main(String[] args) {
		//获得当前日期
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());//返回自1970年到现在经过多少毫秒
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String localDate = sdf.format(date);
		System.out.println(localDate);
		
		//数组操作
		int [] score = {78,56,9,47,66,88,99,87,78};
		Arrays.sort(score);
		System.out.println(score);
		System.out.println(score.toString());//没有重写toString()方法
		System.out.println(Arrays.toString(score));
		
		
		//LocalDate date1 = new LocalDate(); LocalDate 没有专门的构造方法,可通过静态方法
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getDayOfYear());
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getDayOfWeek());
		System.out.println(date1.getClass());
		
		String password = "1345678932";
		System.out.println(password.length());
		
		
	}

}
