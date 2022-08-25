package com.study.strem字符和File类;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Task08使用字符缓冲流读写多个商品信息 {
	public static void main(String[] args)  {
		//准备数据
		ArrayList<Product> list = new ArrayList<Product>();
//int id, String name, String category, double price, int stock, String description, int state
		list.add(new Product(1,"可乐","饮料",3.5,100,"清爽解渴",1));
		list.add(new Product(2,"雪碧","饮料",3.5,100,"透心凉，心飞扬",1));
		list.add(new Product(3,"橙汁","饮料",3.5,100,"营养多汁",1));
		list.add(new Product(4,"酸奶","饮料",6.0,100,"酸酸甜甜",1));
		list.add(new Product(6,"元气森林","饮料",4.0,100,"汽水而已",1));
		
		//写文件
		try {
			//创建字符输出流和缓冲流
			FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\Product.csv");
			PrintWriter pw = new PrintWriter(fw);
			//循环写入文件
			for(Product p :list) {
				pw.println(p);
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		ArrayList<Product> list2 = new ArrayList<Product>();
//		try {
//			FileReader fr = new FileReader("C:\\Users\\mike\\Desktop\\Product.csv");
//			BufferedReader br = new BufferedReader(fr);
//			
//			while(true) {
//				//读取一行信息
//				String line = br.readLine();
//				if(line == null) {
//					break;
//				}
//				//把读回的行转成对象，信息为以,为间隔的字符
//				String [] buf = line.split(",");
//				//int id, String name, String category, double price, 
//				//int stock, String describtion, int state
//				int id = Integer.parseInt(buf[0]);
//				String name = buf[1];
//				String category = buf[2];
//				double price = Double.parseDouble(buf[3]);
//				
//				int stock = Integer.parseInt(buf[4].strip());
//				
//				String description = buf[5];
//				int state = Integer.parseInt(buf[6]);
//				//组合对象
//				Product p = new Product(id,name,category,price,stock,description,state);
//				list2.add(p);
//			}
//			//关闭流
//			br.close();
//			for(Product p :list2) {
//				System.out.println(p);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
	}

}
