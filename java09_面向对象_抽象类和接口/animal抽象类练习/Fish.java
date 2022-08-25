package animal抽象类练习;

public class Fish extends Animal{

	@Override
	public void move() {
         System.out.println(getName()+"在水中移动--------");
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"移动中");
	}
	

}
