package java泛型;

import java.util.List;

class C1{
	
}
class C2 extends C1{
	
}

class Xu<T1 extends C1>{
	
	
}



public class Task02 {
	//泛型通配符 List本身是个集合，里面有多个类型，不知道会传入什么值，类型后<?>即可
	public static void printList(List<?> list) {
		
		
	}
	//泛型定义的方法 访问限定符 (static) <泛型> 返回值 函数名(形参){  			}
	public static <T1> void fx(T1 t1) {
		System.out.println(t1);
	} 
	
	
	public static void main(String[] args) {
		Xu<C2> f1 = new Xu<C2>(); //C2继承C1 Xu也继承C1
		Xu<C1> f2 = new Xu<C1>(); 
		fx("acbx");
		fx(1);
		fx("k");
		fx(23.45);
		fx(true);
		fx(new C1());//未初始化，返回其引用
		fx(13);
	}

}
