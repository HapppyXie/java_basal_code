package com.study.stream字节;

import java.io.BufferedInputStream;
/*
 * 字节缓冲流
 */
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
//缓冲流不一定快，针对大文件，内部默认一次8个字节
public class Task05字节缓冲流TestBufferedInputStream {
	public static void main(String[] args) {
		try {
			//创建输入输出流
			FileInputStream fin = new FileInputStream("C:\\Users\\mike\\Pictures\\联想锁屏壁纸\\小猫.jpg");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\猫猫.jpg");
			//根据字节流创建缓冲区
			BufferedInputStream bufin = new BufferedInputStream(fin);
			BufferedOutputStream bufout = new BufferedOutputStream(fout);
			//循环读写
			int length = 0; //
			while((length = bufin.read())!=-1) {
				bufout.write(length);
			}
			//关闭流
			bufin.close();
			bufout.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
