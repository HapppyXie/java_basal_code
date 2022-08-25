package animal抽象类练习;

public abstract class Animal {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	//抽象类设计该方法，具体实现由子类实现
	public abstract void move();
	
	
	//抽象类中可以没有抽象方法， 上面move方法可去掉
	public void action() {
		System.out.println("移动中.......");
	}

}
