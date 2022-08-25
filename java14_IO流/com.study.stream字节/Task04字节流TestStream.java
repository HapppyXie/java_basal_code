package com.study.stream�ֽ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*ʵ��1���ļ���д���裺1.����ָ���ļ������������ FileInputStream fin = new FileInputStream(�ļ�·��);  
 * 									  FileOutputStream fout = new FileOutputStream(�ļ�·��); 
 * 
 * 				 2.ʵ�ֶ��ļ��Ķ�д		׼���ֽڻ�������byte [] buf = new byte[length];
 * 									fin.read(�ֽ�����);���ļ����ݶ���ָ�����ֽ�����
 * 									fout.write(�ֽ�����);��ָ���ֽ������е�����д���ļ�
 * 				 3.�ر���		fin.close(); 
 * 							fout.close();
 * 		�������ʹJava�������
 * */
public class Task04�ֽ���TestStream {
	public static void main(String[] args) {
		FileOutputStream fout =null;
		try {
			//1.�����ļ������								���������true,׷��ģʽ
			fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\temp.txt",true);
			//2.����Ҫ������ַ���
			String outstr = "�ҵ�С����������";
			//3.�����ֽ����飬�����ַ���ת��Ϊ�ֽ������ֽ�����
			byte[] buf = outstr.getBytes();
			//4.���ֽ�����д���ļ�
			fout.write(buf);
		} catch (IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				//5.�ر������
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//�����ļ�������
		FileInputStream fin = null;
		try {
			//1.�����ļ�������
			fin = new FileInputStream("C:\\Users\\mike\\Desktop\\temp.txt");
			//2.�����ֽ����飬���ڽ��ܶ�ȡ�ļ����ַ���
			byte [] buf = new byte[1024];
			String instr = "";//�����ֽ�ת�����ַ���
			//3.��ȡ�ļ�������
			int length = fin.read(buf);
			//4.���ֽ�ת���ַ���
			instr = new String(buf,0,length);
			System.out.println(instr);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//5.�ر�������
			try {
				fin.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
