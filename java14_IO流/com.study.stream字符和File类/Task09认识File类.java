package com.study.strem字符和File类;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/*
 * File类被定义为:文件和目录路径名的抽象表示形式
 * 				因为File类可以表示文件也可以表示目录，他们都通过对应的路径来描述
 * 		通过构造函数创建一个File类对象，则该对象就是指定文件的引用
 * 		File f = new File("C:\\Users\\mike\\Desktop\\Product.csv");
 * 
 * 		创建一个File类对象f，可通过f对product.csv进行操作
 * 		File f = new File("C:\\Users\\mike\\Desktop\\Product.csv");
 * 		FileInputStream fin = new FileInputStream(f);以File类对象为参数创建IO流
 * 
 * 		File类方法(查看API)
 * 		File类中没有提供对文件的读写操作,如果要实现对文件的读写,则需要通过流来实现
 * */
public class Task09认识File类 {
	public static void main(String[] args) throws IOException{
//		File f = new File("C:\\Users\\mike\\Desktop\\Product.csv");
//		FileReader fr = new FileReader(f);
		
		//如果指定文件不存在，通过createNewFile()方法创建
		//读文件，文件必须存在,如果不存在,异常FileNotFoundException
		//写文件,文件可以不存在,如果不存在，系统自动创建
//		File f2 = new File("C:\\Users\\mike\\Desktop\\P.csv");
//		if(!f2.exists()) {
//			f2.createNewFile();
//		}
		
		//File f3 = new File("C:\\Users\\mike\\Desktop\\小姐联系方式.txt");
		File f3 = new File("C:\\Users\\mike\\Desktop");
		if(!f3.exists()) {
			try {
				f3.createNewFile();//此时创建目录对象
				
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
		System.out.println("是文件吗："+f3.isFile());
		System.out.println("是目录吗："+f3.isDirectory());
		//查看目录中的文件列表
		System.out.println("目录列表"+Arrays.toString(f3.list()));
		System.out.println("------------------------");
		System.out.println("路径："+f3.getPath());
		System.out.println("绝对路径："+f3.getAbsolutePath());
		System.out.println("最后修改时间："+new Date(f3.lastModified()));
		System.out.println("文件大小:"+f3.length());
		System.out.println("文件可读吗："+f3.canRead());
		System.out.println("文件可写吗："+f3.canWrite());
		System.out.println("文件可执行吗:"+f3.canExecute());
	}

}
