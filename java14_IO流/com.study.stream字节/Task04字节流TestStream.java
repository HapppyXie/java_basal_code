package com.study.stream字节;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*实例1：文件读写步骤：1.创建指定文件的输入输出流 FileInputStream fin = new FileInputStream(文件路径);  
 * 									  FileOutputStream fout = new FileOutputStream(文件路径); 
 * 
 * 				 2.实现对文件的读写		准备字节缓冲区：byte [] buf = new byte[length];
 * 									fin.read(字节数组);将文件内容读到指定的字节数组
 * 									fout.write(字节数组);将指定字节数组中的数据写到文件
 * 				 3.关闭流		fin.close(); 
 * 							fout.close();
 * 		输入输出使Java输入输出
 * */
public class Task04字节流TestStream {
	public static void main(String[] args) {
		FileOutputStream fout =null;
		try {
			//1.创建文件输出流								输出流加上true,追加模式
			fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\temp.txt",true);
			//2.创建要输出的字符串
			String outstr = "我的小狗狗，旺旺";
			//3.创建字节数组，并将字符串转化为字节输入字节数组
			byte[] buf = outstr.getBytes();
			//4.将字节数组写入文件
			fout.write(buf);
		} catch (IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				//5.关闭输出流
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//创建文件输入流
		FileInputStream fin = null;
		try {
			//1.创建文件输入流
			fin = new FileInputStream("C:\\Users\\mike\\Desktop\\temp.txt");
			//2.创建字节数组，用于接受读取文件的字符串
			byte [] buf = new byte[1024];
			String instr = "";//接受字节转换的字符串
			//3.读取文件到数组
			int length = fin.read(buf);
			//4.将字节转成字符串
			instr = new String(buf,0,length);
			System.out.println(instr);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//5.关闭输入流
			try {
				fin.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
