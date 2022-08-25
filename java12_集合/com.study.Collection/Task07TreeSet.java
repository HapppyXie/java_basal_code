package com.study.Collection;

import java.util.Arrays;
import java.util.TreeSet;

/*
 * TreeSet 树结构实现			0-9A-Z
 * 		特征：1.可实现元素排序存储(自然排序，元素特定的比较器（实现Comparable接口）)
 * 			2.不予许元素为null
 * 
 * 
 * 总结
 * 		实现类			底层实现		特点
 * 		HashSet  		数组实现		根据哈希值计算元素下标
 * LinkedHashSet 		链表实现		链表结构，元素添加顺序和存储顺序一致
 * 		TreeSet			树结构显示	 	按元素的自然顺序排序或特定的比较器（实现Comparable接口）排序
 * 
 * */
public class Task07TreeSet {
	public static void main(String[] args) {
		TreeSet <String> lhs1 = new TreeSet <String>();
		lhs1.add("菜1");
		lhs1.add("菜2");
		lhs1.add("菜3");
		lhs1.add("菜4");
		lhs1.add("菜5");
		lhs1.add("菜6");
		lhs1.add("菜7");
		lhs1.add("菜1");//重复商品
		System.out.println(lhs1.toString());
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(89);
		ts1.add(4521);
		ts1.add(12);
		ts1.add(8);
		ts1.add(3);
		ts1.add(8);
		ts1.add(4);
		System.out.println(Arrays.toString(ts1.toArray()));
		//按数字大小排了顺序
	}
}
