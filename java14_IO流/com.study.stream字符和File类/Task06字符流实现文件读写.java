package com.study.strem字符和File类;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 抽象类：  Reader		
 * 		
 * 		   Writer
 * 
 * 文件字符流  FileReader和FileWriter 实现从指定的文件中读取字符和将字符写入指定的文件
 * 			实例
 * 
 * 			特征：以字符串为单位进行读写-2个字节(2 bytes)
 * 				可以读写字符数组char[]
 * 				可以读写字符串String[]
 * 				可以读写整数
 * 文件缓冲对象
 * */

public class Task06字符流实现文件读写 {
	public static void main(String[] args) {
		
//	try {
//		//1.创建文件字符输出流对象
//		FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\temp.txt");
//		//准备写入文件的字符
//		int id = 1;
//		String name = "酸梅汁";
//		String category ="饮料";
//		int store = 100;
//		String description ="营养健康";
//		
//		//转换类型，使其不乱码,避免编码造成的乱码
//		String s_id = Integer.toString(id);
//		String s_store = store+" ";//隔开也可以
//		
//		//2.写文件-把字符串数据写到输出流对象对应的文件中
//	
//		fw.write(s_id);
//		fw.write(name);
//		fw.write(category);
//		fw.write(s_store);
//		fw.write(description);
//		fw.close();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}	
	
		
		//读取文件
		try {
			//1.创建文件字符输入流
			FileReader fr = new FileReader("C:\\Users\\mike\\Desktop\\temp.txt");
			//准备字节数组，接受读取的数据
			char[] buf = new char[1000];
			//2.读取文件内容到buf，返回实际数组长度
			int length = fr.read(buf);
			//3.关闭流
			fr.close();
			//将字符数组转换成字符串
			String readStr = new String(buf,0,length);
			System.out.println(readStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
