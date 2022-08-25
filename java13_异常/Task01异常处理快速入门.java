/*
 * 
 *  * 编程中的错误：1.编译错误：编译错误是由于所编译的程序存在语法问题，未能通过由源码到目标码（Java语言中由源码到字节码）
 * 				的编译过程而产生的，它由语言的编译系统负责检测和报告，编译不通过，程序无法运行
 * 
 * 			 2.逻辑运行错误：指程序不能实现编程人员的设计意图和设计功能而产生的错误，
 * 							例如判断某年份是不是闰年，可以被4整除但不能被100整除，或可以被400整除
 * 						  			可以被4整除的，错误
 * 			 3.系统运行错误：程序执行过程中发生的错误，这种错误会导致程序的执行中断-异常
 * 
 * 
 *Java中的异常处理思想：1.避免某些异常的发生
 *				   2.对某些异常发生时进行必要的处理，不影响其他程序的运行 
 * */

public class Task01异常处理快速入门 {
	public static void main(String[] args) {
//	int year;	变量为初始化，编译错误
//	System.out.println(year);
		System.out.println("程序开始运行");
		int result1 = 10 /2;
		System.out.println(result1);
		System.out.println("程序运行结束");
//		int result2 = 10 /0;   //程序运行中除数不可为0
//		System.out.println(result2);
//		System.out.println("程序运行结束");
		int num1 = 10;
		int num2 = 0;
		int result3 = 0; 
		if(num2 != 0) {
			result3 = num1 / num2;
			System.out.println("运算结果为："+result3);
		}else {
			System.out.println("除数不能为0");
		}
		
}

}
