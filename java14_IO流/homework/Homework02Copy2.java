package com.study.homework;

import java.io.*;

public class Homework02Copy2 {
	public static void main(String[] args) {
		try {
			//1.����IO��
			FileInputStream fin = new FileInputStream("C:\\Users\\mike\\Pictures\\����������ֽ\\Сè.jpg");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\èè.jpg");
			
			//2.����������
			byte [] buf = new byte[1024];
			int length = 0;
			long start = System.currentTimeMillis();
			System.out.println(start+"--------------start");
			//3.��ȡ�ļ�
			//��Ϊһ���Զ�д һ�ζ�1k��һ��д1k
			while((fin.read(buf)) != -1) {
				fout.write(buf);
			}
			long end = System.currentTimeMillis();
			System.out.println(end+"-----------------end");
			System.out.println("����ʱ��:"+(end-start));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
