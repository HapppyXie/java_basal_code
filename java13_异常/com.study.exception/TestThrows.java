package com.study.exception;

import java.io.File;
import java.io.IOException;


public class TestThrows {
	public static void main(String[] args)  {
		f1();
		System.out.println("程序继续运行");
	}
	public static void f1() {
		System.out.println("f1执行某个业务");
		try {
			File f1 = new File("F:/data.txt");
			f1.createNewFile();
			int result=10/0;
			System.out.println(result);
		} catch (IOException e) {//Exception写在前，任何异常都可捕获，后面无法捕获
			//e.printStackTrace();
			//System.out.println(e.getMessage());//e.getMessage()返回异常类的字符串信息
			System.out.println(e.toString());//e.toString();返回此对象的异常类的名称，冒号和空格，此对像的getMessage信息
		}catch(ArithmeticException e2){
			e2.printStackTrace();
		}catch(Exception e) {//通常写最后
			e.printStackTrace();//打印输出当前异常对象的堆zhai使用轨迹，什么地方产生异常
		}finally {
			System.out.println("必须执行的代码");
		}
	}
	

}
