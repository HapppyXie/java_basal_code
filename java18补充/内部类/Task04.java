package 内部类;

public class Task04 {
	private int size;
	
	//定义内部类
	public class inner{
		void doStuff() {
			size++;
			System.out.println("The value of the Outer class:"+size);
		}
	}

}
