package 内部类;
//Task01为外包类
public class Task01 {
	private static int size;
	
	//定义内部类 类的声明是不带有()的     /////////////////
	public class inner{
		private String name;
		//内部类无参构造
		public inner() {
			
		}
		public inner(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
		public void doStuff() {
			size++;
			//内部类作为外包类的一个成员使用，可访问static成员和private成员			
		}
	}
	////////////////////////////////////////////////
	
	inner i = new inner();
	
	public void increaseSize() {
			i.doStuff();
	}
	
	public static void main(String[] args) {
		Task01 outer = new Task01();
		for(int i=0;i<4;i++) {
			outer.increaseSize();
			System.out.println("The value of size:"+outer.size);
		}
	}
	/*
	 * JVM对内部类的实现中，在内部类对象中保存了一个对其外包类对象的引用，
	 * 所以内部类可以通过该引用找到外包类的对象，进而访问外包类的成员
	 * 
	 * 
	 * 
	 * */
}

