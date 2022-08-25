package com.study.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/* ArrayList的底层结构是数组   连续的存储空间
 * LinkedList的底层实现是链表  存储空间不连续，一个存储空间分两部分，A，B
 * 							A保存数据，B保存下一个存储空间的地址，使得链表实现操作
 * 实例KTV点歌系统： 点歌-增加 置顶-增加到第一位 替换-替换歌曲
 * 
 * 
 * Vector Vector的功能和ArrayList一样
 * 		  Vector线程安全,效率会低
 * 
 * 		 实现类		(物理上)底层实现  	  特点
 * 小结：ArrayList 	数组实现	  		查询快，增删慢
 *	   LinkedList   链表实现	  		查询快，增删慢
 *	   Vector		数组实现	  		线程安全，效率比ArrayList慢
 *
 *Stack特征
 *		1.后进先出
 *		2.继承Vector ,线程同步，即线程安全
 *		3.使用push，pop,peek,serach方法
 *
 * */
public class Task04LinkedList {
	public static void main(String[] args) {
		//创建点歌列表
		LinkedList<String> lk1 = new LinkedList<String>();
		//点歌增加
		lk1.add("忘情水");
		lk1.add("鸡你太美");
		lk1.add("哥谭恶魔");
		lk1.add("吻别");
		lk1.add("数字人生");
		System.out.println(lk1);
		System.out.println(Arrays.toString(lk1.toArray()));
		//置顶
		lk1.add(0,"我的中国心");
		lk1.addFirst("Waiting for you");
		System.out.println(lk1);
		//替换
		lk1.set(4, "river follow you");
		System.out.println(lk1);
	}

}
