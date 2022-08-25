package com.study.Collection;

import java.util.HashSet;

//			<interface>Set无序
	//		HashSet 		TreeSet
	//		LinkedHashSet
/*
 * HashSet 哈希表和数组的实现
 * 特征:不保证元素的顺序；予许元素为null；
 * 		元素不予许重复（使用自定义类时要中重写hashCode和equals方法）
 * 存储到Set集合中的数据规定要重写equals和hashCode方法
 * */
public class Task05HashSet {
	public static void main(String[] args) {
		HashSet <String> hs1 = new HashSet<String>();
		//案例1：
		hs1.add("菜1");
		hs1.add("菜2");
		hs1.add("菜3");
		hs1.add("菜4");
		hs1.add("菜5");
		hs1.add("菜6");
		hs1.add("菜7");
		hs1.add("菜1");//重复商品
		//打印
		System.out.println(hs1.toString());
		System.out.println(hs1.size());
		System.out.println("-----------------------");
		
		//案例2
		HashSet<Course> hs2 = new HashSet<Course>();
		// id name credit hours teacher
		hs2.add(new Course(1,"课程1",3,48,"老师1"));
		hs2.add(new Course(2,"课程2",6,56,"老师2"));
		hs2.add(new Course(3,"课程3",7,48,"老师3"));
		hs2.add(new Course(4,"课程4",2,67,"老师4"));
		hs2.add(new Course(5,"课程5",8,48,"老师5"));
		hs2.add(new Course(6,"课程6",3,86,"老师6"));
		hs2.add(new Course(7,"课程7",3,45,"老师7"));
		hs2.add(new Course(7,"课程7",3,45,"老师7"));//出现重复，必须重写
		//foreach遍历
		for(Course c :hs2) {
			System.out.println(c.toString());
		}
		
	}

}
