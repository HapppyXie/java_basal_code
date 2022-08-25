package Homework1从员工工资管理理解继承;

import java.net.MulticastSocket;

public class TestStaff {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.setName("张三");
		m1.setSalary(15000);
		m1.setScore(80);
		m1.setMarketCost(20000);
		System.out.println(m1);
		m1.toWork();
		
		Employee e1 = new Employee();
		e1.setName("李四");
		e1.setSalary(15000);
		e1.setScore(80);
		System.out.println(e1);
		e1.toWork("公交", "地铁");
	}
/*
 * 继承特征：子类继承父类的非私有成员
 *        不继承构造方法
 *        子类可以重写父类的方法
 *        子类可以追加属性和方法
 * 目的：提高代码的复用性
 *     更新父类的方法或扩展和父类相同的成员      
 *        
 * 
 * 
 * 
 * */
}
