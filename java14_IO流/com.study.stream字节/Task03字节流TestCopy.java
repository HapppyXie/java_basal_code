package com.study.stream�ֽ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
 * �ļ����ƣ�
 * 1.����ָ���ļ������������	FileInputStream fin = new FileInputStream();
 * 						FileOutputStream fout = new FileOutputStream();
 * 2.���ļ�ѭ����д	 ׼���ֽڻ����� byte [] buf = new byte[length];
 * 				 ѭ����д  while((length = fin.read(buf))!= -1){fout.write(buf,0,length)} 
 * 				 ���ƻ��ƣ�1.ѭ����Ŀ����֪��Դ�ļ��Ĵ�С
 * 						2.ѭ����д�����в��ر����������ļ����ж�д
 * 3.�ر���	fin.close();
 * 			fout.close();
 * */

public class Task03�ֽ���TestCopy {
	public static void main(String[] args) {
		try {
			//1.�������������
			FileInputStream fin = new FileInputStream("C:\\Users\\mike\\Pictures\\����������ֽ\\Сè.jpg");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\èè.jpg");
			//2.ѭ����д
			//׼���ֽڻ�����
			byte [] buf = new byte[1024];
			int length = 0;
			//while((length = fin.read(buf))!= -1)
			//fin ��ȡ-> buf  ����ʱ����-1
			while((length = fin.read(buf))!= -1) {
			//fout ��ȡbuf��д�� fout ��0-length
				fout.write(buf,0,length);
			}
			
			//while((length = fin.read())!=-1){	  fout.write(length)  }
			//while((fin.read(buf))!= -1){	fout.write(buf,0,length)  }
				
			fin.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
