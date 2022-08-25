package 内部类;

public class Task03 {
	private int size = 5;
	
	//定义返回内部类的方法体
	public Object makeInner(final int finalLocalVar) {
		int localVar = 6;
		//定义内部类
		class Inner{
			//定义内部类方法
			public String toString() {
		return("#<Inner size = "+
			size+"localVar="+localVar//对局部变量localVar访问
			+"finalLocalVar="+finalLocalVar+">");
			}
		}
		return new Inner();//返回内部类	
	}
	
	public static void main(String[] args) {
		Task03 outer = new Task03();
		Object obj = outer.makeInner(40);//上溯造型
		//用Object类接受不能出来的内部类,传过去的finalLocalVar，储存在内部类中了
		System.out.println("The object is:"+obj.toString());
	}

}
