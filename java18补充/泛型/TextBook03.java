package java泛型;
//泛化方法，其中的类型参数的作用域只限于声明它的方法
class MyBox1<T>{
	private T t;
	public void add(T t) {//集合的增加方法
		this.t = t;
	}
	public T get() {//集合获取对象的方法
		return t;
	}
//泛化方法定义： 修饰符 <类型参数> void 方法名([参数]){}
	public <U> void inspect(U u) {
		System.out.println("T:"+t.getClass().getName());
		System.out.println("U:"+u.getClass().getName());
		System.out.println();
	}
}
public class TextBook03 {
	public static void main(String[] args) {
		MyBox1<Integer> integerBox = new MyBox1<Integer>();
		integerBox.add(new Integer(10));//创建泛型集合，并增加一个对象
		//利用泛型对象，传入一个String类型，不是往集合里增加
		System.out.println("The first inspection:");
		integerBox.inspect("some text");
		
		System.out.println("The second inspection:");
		integerBox.inspect(new Double(10.00)); 
		
		
	}
	
	

}
