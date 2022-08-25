package com.study.Collection;


import java.util.ArrayList;
import java.util.Iterator;



/**
 *  ArrayList操作商品对象：需求：使用ArrayList创建一个购物车，向购物车中添加商品（商品对象）
 *  					并通过索引删除和获得商品信息，然后遍历购物车，打印购物车中所有商品信息
 * 
 *
 */
public class Task03ArrayList2 {
	public static void main(String[] args) {
		ArrayList <Product> l2 = new ArrayList<Product>();
		//Integer id, String name, Double price, String description
		Product p1 = new Product(1,"可乐",3.5,"清爽解渴");
		Product p2 = new Product(2,"橙汁",5.0,"营养多汁");
		Product p3 = new Product(3,"牛奶",5.0,"早餐必备");
		Product p4 = new Product(4,"乳酸菌",6.0,"清爽解渴");
		l2.add(p1);
		l2.add(p2);
		l2.add(p3);
		l2.add(p4);
		l2.add(new Product(5,"凉茶",4.0,"解渴解暑"));
		//遍历
		for(Product p : l2) {
			System.out.println(p);
		}
		System.out.println("----------------------------");
		//删除索引为1的商品后的遍历
		l2.remove(1);
		for(Product p:l2) {
			System.out.println(p);
		}
		System.out.println("----------------------------");
		//获得索引为3的商品
		System.out.println(l2.get(3));
		System.out.println("----------------------------");
		//三种遍历的方法
		System.out.println("---------索引遍历------------");
		for(int i =0; i < l2.size(); i++) {
			System.out.println(l2.get(i));
		}
		System.out.println("----------foreach遍历------------");
		for(Product p : l2) {
			System.out.println(p);
		}
		System.out.println("------iterator不推荐---------");
	Iterator<Product> iterator = l2.iterator();
	while(iterator.hasNext()) {
		Product food = iterator.next();
		System.out.println(food);
	}
	}

}
