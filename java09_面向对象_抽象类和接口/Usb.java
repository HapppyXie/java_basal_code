
public interface Usb {
	/*
	 * 接口中的属性默认是常量
	 * */
	  float length = 12;
	public static final float width = 4.51111111111111111111111111111f;
	public static final double deepth = 2.02213154566546111111111111111111111f;
//	public static void main(String[] args) {
//		System.out.println(length);
//		System.out.println(width);
//		System.out.println(deepth);
//	}
	
	
	
	public void input();
	//抽象类中的方法没有{}方法体,可规定参数，方法名
	//输出
	public void output();
	
	//充电
	public void charge();

}
