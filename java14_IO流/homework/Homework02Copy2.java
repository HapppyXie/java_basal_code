package com.study.homework;

import java.io.*;

public class Homework02Copy2 {
	public static void main(String[] args) {
		try {
			//1.创建IO流
			FileInputStream fin = new FileInputStream("C:\\Users\\mike\\Pictures\\联想锁屏壁纸\\小猫.jpg");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\猫猫.jpg");
			
			//2.创建缓冲区
			byte [] buf = new byte[1024];
			int length = 0;
			long start = System.currentTimeMillis();
			System.out.println(start+"--------------start");
			//3.读取文件
			//此为一次性读写 一次读1k，一次写1k
			while((fin.read(buf)) != -1) {
				fout.write(buf);
			}
			long end = System.currentTimeMillis();
			System.out.println(end+"-----------------end");
			System.out.println("所用时间:"+(end-start));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
