package com.study.stream字节;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
 * 文件复制：
 * 1.创建指定文件的输入输出流	FileInputStream fin = new FileInputStream();
 * 						FileOutputStream fout = new FileOutputStream();
 * 2.对文件循环读写	 准备字节缓冲区 byte [] buf = new byte[length];
 * 				 循环读写  while((length = fin.read(buf))!= -1){fout.write(buf,0,length)} 
 * 				 复制机制：1.循环的目的是知道源文件的大小
 * 						2.循环读写过程中不关闭流持续对文件进行读写
 * 3.关闭流	fin.close();
 * 			fout.close();
 * */

public class Task03字节流TestCopy {
	public static void main(String[] args) {
		try {
			//1.创建输入输出流
			FileInputStream fin = new FileInputStream("C:\\Users\\mike\\Pictures\\联想锁屏壁纸\\小猫.jpg");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\猫猫.jpg");
			//2.循环读写
			//准备字节缓冲区
			byte [] buf = new byte[1024];
			int length = 0;
			//while((length = fin.read(buf))!= -1)
			//fin 读取-> buf  读完时返回-1
			while((length = fin.read(buf))!= -1) {
			//fout 读取buf并写入 fout 从0-length
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
