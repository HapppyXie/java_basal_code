/*
 * 继承：继承可以使得子类具有父亲的属性和方法,或者追加属性和方法
 * 
 * 
 * */
public class Father {
	private String name;

	public String getName() {     
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void f1() {
		System.out.println(getName()+"执行父类方法f1------------");
	}

	public void f2(int id) {
		System.out.println(getName()+"执行父类方法f2------------"+id);
		
		
	}
}
