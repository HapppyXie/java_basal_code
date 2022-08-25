/*
 * 
 * 
 * */
public class Test {
	public static void main(String[] args) {
		Father f = new Father();
		f.setName("李靖");
		f.f1();
		f.f2(1);
		
		Father f1 = new Son();//上溯造型
		
		Father f9 = new Father();
		Father f3 = new Son();
		
		System.out.println(f3 instanceof Son);//转换前可测试,返回true可以强制类型转换
		Son s0 = (Son)f3;
		
		Father fg = new Son();
		Son so = (Son)fg;
		
		//类型 对象名 = (类型)对象名	;	强制类型转发
		
		
		
		Son s = new Son();
		s.setName("哪吒");//此为继承
		s.f1();
		s.f2(2);
		s.f3();
		s.setWeapon("混天绫");//追加属性
		System.out.println("哪吒武器为"+s.getWeapon());
		
		Son2 s2 = new Son2();
		s2.setName("阿狗");
		s2.getName();//s2.getName();只是让这个值为阿狗，没有输出
		System.out.println(s2.getName());
	}

}
