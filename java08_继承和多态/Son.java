/*
 * 
 * 
 * */
public class Son extends Father {
	private String weapon;// 也可以追加属性和方法

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	//还可以重新定义属性和方法

	@Override //注解  可重新定义方法
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"执行子类方法f1--------------");
		//super.f1();//super.f1();会调用父类f1方法，
	}

	@Override
	public void f2(int id) {
		// TODO Auto-generated method stub
		System.out.println(getName()+"执行子类方法f2--------------"+id);
		//super.f2(id);
	}
	
	//子类追加方法
	public void f3() {
		System.out.println(getName()+"执行子类方法f3---------------");
	}
	
	
	
	
}
