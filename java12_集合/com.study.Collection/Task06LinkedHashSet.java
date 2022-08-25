package com.study.Collection;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet 哈希表和链表的实现
 * 		特征：1.按存入数据的顺序对应各节点的顺序(有序)
 * 			2.予许元素为null
 * 
 * */
public class Task06LinkedHashSet {
	public static void main(String[] args) {
		//案例
		LinkedHashSet <String> lhs1 = new LinkedHashSet<String>();
		lhs1.add("菜1");
		lhs1.add("菜2");
		lhs1.add("菜3");
		lhs1.add("菜4");
		lhs1.add("菜5");
		lhs1.add("菜6");
		lhs1.add("菜7");
		lhs1.add("菜1");//重复商品
		System.out.println(lhs1.toString());
		
		
	}

}
