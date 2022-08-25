/**
 *  
 * Java中定义了许多异常类，每个异常类都代表一种运行错误，类中包含了该运行错误的信息和处理错误的方法等内容
 * 		每当Java程序运行过程中发生一个可识别的运行错误时，系统都会产生一个相应的该异常类的对象，即产生一个异常
 * 
 * 
 * Java异常类层次结构：							Object
 * 											Throwable
 * 					Error											Exception
 * 		AWTError  ThreadDeath ....				SQLException  ClassNotFoundException  .....    IOException   ....		RuntimeException
 * 																									ArithmeticException   NullPointException   NumberFormatException......
 * 说明：Error对象由Java虚拟机生产并抛出，程序无法捕获
 * 		Exception类对象由应用程序处理或抛出,可捕获
 * Throwable:Java.lang.Throwable类的所有错误的父类
 * 
 * Error:非常严重的错误，来源于Java底层，无法对Error错误进行处理，例如虚拟机崩溃
 * 
 * Exception:不是那么严重，进行必要的处理措施不影响系统的正常运行
 * 			RuntimeException: ArithmeticException,NullPointException,NumberFormatException,
 * 							  ArrayIndexOutOfBoundsException
 * 							  运行时异常，未正确检查，如果经过检查可以避免的异常
 * Exception直接子类： ClassNotFoundException
 * 					IOException  如：创建文件	
 * 					SQLException
 * 					RuntimeException的直接子类：已检查异常(即使检查也无法避免，磁盘损坏，断电)，无法避免，必须处理
 * 
 * 			未检查异常 RuntimeException直接子类 如果进行代码检查可以避免发生的异常
 * 异常分类 	已检查异常 Exception的直接子类	不可避免会发生的异常，必须进行处理的异常		
 * 		
 * EOFException 		
 * EOF表示读到了文件尾（ String str = dis.readUTF(); ，客户端已经断开，后面已经没有内容可以读了）
 *  
 */
 
public class Task02认识异常相关类 {
	public static void main(String[] args) {
		System.out.println("程序开始------------");
		//数学异常
		int result = 10/3;//除数为0
		System.out.println("result="+result);
		//空指针异常
		String s = "hello";//String s = null
		System.out.println(s.length());
		//数字格式转化异常
		String scount = "1234";//1234a
		int count = Integer.parseInt(scount);
		System.out.println("数量是："+count);
		System.out.println("程序运行结束----------");
		
		int score[] = new int[10];
		score[0]=99;
		score[9]=88;		//数组越界异常  score[10]=55;
	}


}
