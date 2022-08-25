package java泛型;

import java.util.ArrayList;
import java.util.List;

class MyBox<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get(){
		return t;
	}
}
//泛型的定义
public class TextBook01 {
	public static void main(String[] args) {
		MyBox<Integer> aBox = new MyBox<Integer>();
		aBox.add(new Integer(1000));
		Integer i = aBox.get();
		System.out.println("The Integer is:"+i);
		/*类型参数： E-Element
		 * 		  K-Key
		 * 		  N-Number
		 * 		  T-Type
		 * 		  V-Value
		 * 		 S,U,V - 可被看作泛型的第二，三，四个参数
		 * */
		//泛型中的子类
		//父类的变量可以指向子类的对象，子类被认为是与父类兼容的类型
		Object someObject = new Object();
		Integer someInteger = new Integer(10);
		someObject = someInteger;
		System.out.println(someObject);
		
		//父类类型作为参数创建，后续使用子类初始化
		MyBox<Number> box = new MyBox<Number>();
		box.add(new Integer(10));
		box.add(new Double(10.9));
		System.out.println(box);
		
//		List<String> ls = new ArrayList<String>();  不断上转型到Object
//		List<Object> lo = ls;  此行报错，父类不能包含子类的很多信息
//		lo.add(new Object());   Object是String的父类，但List<Object>不是List<String>的父类
//		String s = ls.get(0);   
		
	
		
		
	}
}
