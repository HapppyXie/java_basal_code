package com.study.Collection;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		//商品集合  
	//集合类型 <可放类型> 对象名 = new 集合类型<可放类型>();
 		ArrayList <Product> list = new ArrayList<Product>();
		
		//增加
		list.add(new Product(1,"皮蛋瘦肉粥",6.0,"营养丰富"));
		list.add(new Product(2,"酸梅胡辣汤",12.0,"又辣又酸"));
		list.add(new Product(3,"雷州炒粉",10.0,"好吃实惠"));
		list.add(new Product(4,"棒打鲜橙",6.0,"营养解渴"));

		System.out.println(list.toString());
		System.out.println("----------------------------");
		list.remove(1); //索引从0开始,删除后长度为3
		list.remove(2);   //2删掉了第三个
		System.out.println(list.toString());
	}

}
