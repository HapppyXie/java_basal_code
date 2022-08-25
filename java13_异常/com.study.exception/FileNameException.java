package com.study.exception;
/*
 * 自定义异常类 （直接继承Exception）
 * 			JavaAPI提供的内置遗产不一定总能捕获系统中的所有错误
 * 				   有时会创建用户自定义异常来处理系统的特殊需求
 * 		举例：创建文件时文件名不符合要求时抛出异常
 * 
 * 自定义异常类总结:自定义异常类需要继承Exception类或其子类
 * 	   自定义异常类的构造方法需要访问父类的构造方法以便打印响应的异常信息
 * 	   自定义异常类通常是在一定条件下手动抛出（throw） 可以先写throws在方法体中, 也可以try-catch处理
 *	    
 *
 *总结throws和throw关键字
 *		throws:throws在方法头部声明，抛出异常类
 *			   应用：修饰符 返回值类型 方法名 (形式参数) throws 异常类{		方法体}
 *			   说明：对方法调用者进行显示说明，在调用该方法时需要处理那些异常
 *		throw: throw在方法体中声明，抛出异常类对象
 *				应用：TestFile
 *				说明：通常在某个条件下抛出异常类对象
 *
 *
 *
 * */

		//此处先定义:自定义异常类 ,需重写三个构造方法并调用父类方法
public class FileNameException extends Exception{
	
		public FileNameException() {
			super();
		}
		//指定信息
		public FileNameException(String message) {
			super(message);
		}
		//指定信息和原因
		public FileNameException(String message,Throwable cause) {
			super(message,cause);
		}
		//TestFile
}
