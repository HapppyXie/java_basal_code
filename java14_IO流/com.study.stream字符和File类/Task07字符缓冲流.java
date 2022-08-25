package com.study.strem字符和File类;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*创建
 * BufferedReader  BufferedReader bfr = new BufferedReader(FileReader对象);
 * PrintWriter     PrintWriter pw = new PrintWriter(FileWriter 对象);
 * 	实例：通过字符缓冲流读取实体对象
 * 	不需要转换类型
 * 
 * */
public class Task07字符缓冲流 {
	public static void main(String[] args) {
				
//			try {
//			FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\temp.txt");
//			PrintWriter pw = new PrintWriter(fw);
//			
//			int id = 1;
//			String name = "酸梅汁";
//			String category ="饮料";
//			int store = 100;
//			String description ="营养健康";
//			double price = 6.5;
//			
//			
//			pw.print(id);
//			pw.print(name);
//			pw.print(category);
//			pw.print(store+" ");
//			pw.print(price);
//			pw.print(description);
////int id, String name, String category, double price, int stock, String describtion, int state
//			Product p1 = new Product(2,"哇哈哈","饮料",5,20,"酸甜可口",1);
//			
//			//pw.println();写一行,
//			pw.println("   "+p1.toString());
//			
//			pw.close();
//			
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
			
			
		try {
			FileReader fr = new FileReader("C:\\Users\\mike\\Desktop\\temp.txt");
			BufferedReader br = new BufferedReader(fr);
			
			//String[] buf = new String [1000];不用创建
			
			//读文件-怎么写的怎么读
			
			String line = br.readLine();//读一行
			
			br.close();
			System.out.println(line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
