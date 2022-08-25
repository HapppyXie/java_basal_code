package API快速入门1;

import java.util.Arrays;

//认识字符串相关类的API，即这些类的内置的，预先写好的函数，方法
/*
 * 常用类：String
 * 		 StringBuilder
 * 		 StringBuffer
 * */
public class Task02StringAPI {
	public static void main(String[] args) {
		String s = "Java Shixun";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(4));
		
		String s1 = "a";
		String s2 = "Java Shixun";
		System.out.println(s2.indexOf(s1));//首次出现位置
		System.out.println(s2.lastIndexOf("a"));//最后一次出现的位置
		String zh = "tb13428394849";
		boolean result = zh.startsWith("tb");
		System.out.println(result);
		System.out.println(zh.endsWith("9"));
		
		String sfz = "440882200908014055";
		String birthday = sfz.substring(6, 14);//[) 取头不取尾
		System.out.println(birthday);
		
		String q ="工程设计学院;创新谷;园博园;大学城";
		String [] q1 =q.split(";");//regex正则表达式,根据所给正则表达式分割字符串
		System.out.println(Arrays.toString(q1));
		
		String g = "     a5     ";
		System.out.println(g.length());
		g = g.trim();//取消前后的空格
		System.out.println(g.length());
		
		String b ="123456789";
		boolean result1 = b.matches("123456");
		System.out.println(result1);
	}

}
