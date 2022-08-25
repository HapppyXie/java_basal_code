package API快速入门3;

import java.lang.reflect.Method;
import java.util.Arrays;

//Object类 所有类的父类
/*
 *  getClass()  返回该Object运行时类
 *  			反射
 *  hashCode()		不同对象默认对应的hashCode的值不同
 *  equals(Object obj)		
 *  toString()		返回对象的字符串表示所有子类都建议重写
 * */
public class TestObject {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setId(01);
		u1.setName("张三");
		System.out.println(u1.toString());
		System.out.println(u1.getClass());
		
		Method[] m1 = u1.getClass().getMethods();
		System.out.println(Arrays.toString(m1));
		
		String s1 = "hello";
		String s2 = "hello";//如果equals相等，则其哈希值也相等
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
		int [] a = {10,2,33,6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
	}

}
