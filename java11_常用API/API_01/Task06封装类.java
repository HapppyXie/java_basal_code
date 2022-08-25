package API快速入门1;
/*
 * 组成：基本数据类型	封装类（包装类）
 * 		boolean		Boolean
 * 		byte		Byte
 * 		short		Short
 * 		int			Integer
 * 		long		Long
 * 		char		Character
 * 		float		Float
 * 		double 		Double
 * 	共8种
 * 
 * 目的：扩张对基本类型的应用
 * 		基本数据类型间的转换	
 * 	通常从页面获取的数据是字符串类型，在给特定属性赋值时需要进行类型转换
 * 
 * 重点：数据类型转换
 * 		阿里的规范:1.所有的POJO类（简单的，没有业务逻辑的普通类）必须使用包装数据类型
 * 				2.RPC方法的返回值和参数必须使用包装数据类型
 * 				3.所有的局部变量使用基本数据类型
 * */
public class Task06封装类 {
	public static void main(String[] args) {
		
	//1.字符串数字与基本类型转换String->int
		String s = "123";
		int x = Integer.parseInt(s);
	    System.out.println(x);
	    
	    			//int->String
	    int a = 10;
		String sa = a+"";//数值类型+""自动转成字符串
	System.out.println("------");
		
	
	//2.字符串数字与封装类转换Integer->String
		int x1 = 10;
		Integer x2 = x1;//int ->Integer 自动装箱
		
		String s1 = x2.toString();
		String s2 = String.valueOf(x1);
		
		//String->Integer
		String s5 = "123";
		Integer i1 = Integer.parseInt(s5);
		
		
	//3.基本类型与封装类
		Integer iage1 = new Integer(20);
		int age1 = iage1.intValue();
		
		Integer iage2 = new Integer(20);
		int age2 = iage2;//自动拆箱
		
		int age3 = new Integer(20);
	}
}
