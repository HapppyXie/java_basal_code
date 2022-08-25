package com.study.homework;

import java.io.*;

public class Homework01Copy1 {
	public static void main(String[] args) {
		try {
			//1.创建输入输出流
			FileInputStream fin = new FileInputStream("C:\\Users\\mike\\Pictures\\联想锁屏壁纸\\小猫.jpg");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\猫猫.jpg");
			//2.设置缓冲区
			int length = 0;
			
			long start = System.currentTimeMillis();
			System.out.println(start+"---------start");
			//3.读写文件
			while((length = fin.read())!= -1) {
				fout.write(length);
				//System.out.println(length); 用int接受bytes
			}
			long end = System.currentTimeMillis();
			System.out.println(end+"------------end");
			System.out.println("所用时间:"+(end-start));
			//4.关闭流
			fin.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
