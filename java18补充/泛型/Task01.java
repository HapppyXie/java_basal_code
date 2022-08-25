package java泛型;

import java.util.List;

// 个人理解，泛型，是定义的类里的一些类型不确定，先泛指，后补上
class fu<T, T2>{//现在不知道是什么类型，等创建对象时，将类型补上
			// 泛型可写多个, 如果创建对象实例时，不指定类型，都默认为Object类型
	private T t1;
//	private T t2 = new T(); 在泛型类中不予许创建泛型属性实例

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
	
}

//泛型继承
class zi1<T,T2> extends fu<T,T2>{
	/*  指定写法，1.父类有什么子类照写
	 * 			2.直接指定泛型，继承过去也指定了
	 * */
	private T t1;
	private T2 t2;

	public T getT1andT2() {
		return t1;
	}

	public void setT1(T t1, T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	
	
}
class yi1 extends fu<String,Integer>{
	private String s1;
	private int i1;
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public int getI1() {
		return i1;
	}
	public void setI1(int i1) {
		this.i1 = i1;
	}
	
}

class gi1<T1 extends List>{
	protected T1 t1;
	
}

public class Task01 {
	public static void main(String[] args) {
		Object o;
		o = new Float(12.13);
		System.out.println(o);
		//o = new Integer(14);
		//System.out.println(o); //Object - Float 接受子类对象，上塑造型，可以
    //但是 当用Integer接受Float类对象时，Integer - Float 出错了
		//Integer i = (Integer)o;  此处非法
		//泛型-解决安全隐患   定义 class 类名<泛型名>{   }   泛型名和数量名一样
		
		
		//创建完泛型类后,如果创建对象不指定类型，会自动指向Object类型
		fu f1 = new fu();  //f1为Object类型
		fu<String, Integer> f2 = new fu<>();
		f2.setT1(null);
		f2.getT1();
		
		zi1 z1 = new zi1(); //继承后不指定，zi1默认为Object类
		
		//第一种指定后
		zi1<String,Integer> z2 = new zi1(); //此时，zi2为T 或 T2 类
											//声明后 为String或Integer类
		z2.setT1(null); // 此为父类方法
		z2.setT1(null, null); // 此为子类zi1方法
		//第二种指定后
		yi1 y1 = new yi1();
		
		//泛型未继承时，什么类型都可以
		//gi1<String> g1 = new gi1<String>();
		//继承后编写收继承泛型限制
		 gi1<List> g2 = new gi1<List>();
		
		
	}

}
