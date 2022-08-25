
public class TestUsb {
	public static void main(String[] args) {
		Udisk u1 = new Udisk();
		u1.input();
		u1.output();
		u1.charge();
		System.out.println(u1.length);
		System.out.println(u1.width);
		//u1.length = 13;  //不管是去掉 public static 还是 final ,都无法重新赋值
						 //其默认是 public static final类型
	}

}
