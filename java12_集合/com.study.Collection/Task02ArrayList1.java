package com.study.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//*     					   		<interface>Collection
//// 子接口	 			<interface>List有序  				<interface>Set无序
////实现类	ArrayList 	LinkedList		Vector			HashSet 		TreeSet
//* 										stack			LinkedHashSet

public class Task02ArrayList1 {
/*
 * ArrayList 总述：List接口：大小可变数组的实现，
 * 					实现了所有可选列表的操作，并予许包括null在内的所有元素
 * 特征：1.底层实现是数组，可以根据索引获取值，get(int index)
 * 		2.予许null值
 * */
	/*
	 * 案例1-ArrayList操作字符串 需求：使用ArrayList创建一个购物车，向购物车里添加商品名称（字符串）
	 * 		并通过索引删除和获得商品名称，然后遍历购物车，打印购物车中所有的商品名称
	 * */
	public static void main(String[] args) {
		//原生方式创建集合，默认存储(raw type)Object原生类型,参数化类型或填写具体化类型
		ArrayList l2 = new ArrayList();
		l2.add("我的测试");
		String s1 = (String) l2.get(0);
		//l2.add(123);不再可放
		//此处使用强制类型转换
		l2.add(123);
		int s2 = (int) l2.get(1);
		l2.add('a');
		char s3 =  (char) l2.get(2);
		l2.add(4456.212);
		double f1 = (double) l2.get(3);
		
		ArrayList<String> l1 = new ArrayList<String>();	
		//增加商品
		l1.add("果冻");
		l1.add("可乐");
		l1.add("夹心饼干");
		l1.add("炒粉");
		l1.add("火锅");
		//获得商品
		String food1 = l1.get(0);
		System.out.println(food1);
		System.out.println(l1.toString());
		//toArray()转成数组，再用数组Arrays的toString()打印
		System.out.println(Arrays.toString(l1.toArray()));
		//jdk1.5后增加了泛型处理-规定集合存储指定类型，在类名或集合名后<类型/参数化类型>
		l1.remove(2);
		System.out.println(Arrays.toString(l1.toArray()));
		//遍历购物车,把购物车所有商品都打印 
		//1.for
		for(int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i)+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		//2.通过迭代器,导入Iterator包，生成可迭代对象
		Iterator<String> iterator = l1.iterator();
		while(iterator.hasNext()) {
			String food = iterator.next();
			System.out.print(food+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		//3.forEach语法-增强的for循环
		for(String food : l1) {
			System.out.print(food+" ");
		}
		
		
	}
}
