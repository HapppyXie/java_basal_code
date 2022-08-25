package 内部类;

//此时内部类和外部类具有同名变量
public class Task02 {
	private int size;
	
	///////////////////定义内部类
	public class inner{
		private int size;
		public void doStuff(int size) {
			size++;		//存取局部变量，传进来的值
			this.size++;	//存取内部类的成员变量
			Task02.this.size++;	//存取外包类Task02的成员变量
			System.out.println("size in inner.doStuff:"+size);
			System.out.println("size in the inner class:"+this.size);
			System.out.println("size in the Task02:"+Task02.this.size);
		}
	}
	inner i = new inner();
	public void increaseSize(int s) {
		i.doStuff(s);
	}
	public static void main(String[] args) {
		Task02 outer = new Task02();
		outer.increaseSize(20);
	}
	
}
