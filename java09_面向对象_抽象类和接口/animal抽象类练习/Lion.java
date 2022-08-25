package animal抽象类练习;

public class Lion extends Animal{

	@Override//继承抽象类，子类就必须对抽象方法进行实现
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"在草原上奔跑----");
		
	}

}
