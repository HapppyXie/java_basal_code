package com.study.homework;

import java.io.*;

public class Homework01Copy1 {
	public static void main(String[] args) {
		try {
			//1.�������������
			FileInputStream fin = new FileInputStream("C:\\Users\\mike\\Pictures\\����������ֽ\\Сè.jpg");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\èè.jpg");
			//2.���û�����
			int length = 0;
			
			long start = System.currentTimeMillis();
			System.out.println(start+"---------start");
			//3.��д�ļ�
			while((length = fin.read())!= -1) {
				fout.write(length);
				//System.out.println(length); ��int����bytes
			}
			long end = System.currentTimeMillis();
			System.out.println(end+"------------end");
			System.out.println("����ʱ��:"+(end-start));
			//4.�ر���
			fin.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
