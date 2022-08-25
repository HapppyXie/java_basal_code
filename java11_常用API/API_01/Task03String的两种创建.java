package API快速入门1;

public class Task03String的两种创建 {
	public static void main(String[] args) {
		//账号验证
	String regex ="^[a-zA-Z][a-zA-Z0-9_]{5,19}";
	String account = "x2646793432";
	System.out.println(account.matches(regex));
	
	String regex1 = "^[0-9]{17}[0-9|x]$";
	String id ="44088220020306043x";
	System.out.println(id.matches(regex1));
	System.out.println("----------------");
	
	/*
	 * String的两种创建方式
	 * 鼠标放在类上，按住control查看源码
	 * */
	String str1 = "苹果";//先在堆内存中的常量池（存常量的地方）开辟存储空间，再把堆地址给栈内存
	String str2 = new String("苹果");//在堆内存的常量池里复制一个苹果，开辟新的堆存储空间，再把堆内存地址给栈内存
	
	System.out.println(str1 == str2);
	System.out.println(str1.equals(str2));//equals()方法查看字符串内容是否相等
	
	String str5 = str1;//相当于把str1的值，堆地址给了str5
	System.out.println(str5==str1);
	System.out.println("-------------------");
	
	String str3 = "苹果";//在堆内存中从常量池中复制苹果的地址，给栈内存
	String str4 = new String("苹果");//在堆内存的常量池里复制一个苹果，开辟新的堆存储空间，再把堆内存地址给栈内存
	System.out.println(str1 == str3); //new一定会开辟存储空间
	System.out.println(str2 == str4);//不相等说明地址不相等
	System.out.println("--------------------");
	/*   == 栈内存中的值比较地址
	 * 		int a =10,b = 10;
	 * 		a == b 
	 *   基本类型比较的是数值,a直接存储数值
	 *   引用类型比较的是地址值  str1存储堆内存地址
	 * */
	
	int a = 10,b = 10;
	System.out.println(a == b);
	/*	equals()  Object类的比较方法  
	 *  String 类重写了Object类的equals方法，逐个字符进行比较
	 *  注意：自定义的类没有重写equals方法，在使用equals方法比较时，实际比较的是地址，和==相同
	 * */
	Object obj = "";
	obj.equals(obj);
	System.out.println("------------------------");
	//String 类的不可变
	String s1 = "hello";
	String temp = s1;
	System.out.println(s1 == temp);
	System.out.println("-----------------------");
	s1 = s1+"";//改变了原字符串，会在常量池里开辟 hello+""形成新堆地址给栈内存
	System.out.println(temp.equals(s1));
	System.out.println(temp == s1);
	
	System.out.println("-----------------------");
	String q1 = new String("abc");
	String q2 = "abc";
	System.out.println(q1==q2);

}

}
