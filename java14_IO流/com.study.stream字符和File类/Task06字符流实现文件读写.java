package com.study.strem�ַ���File��;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����ࣺ  Reader		
 * 		
 * 		   Writer
 * 
 * �ļ��ַ���  FileReader��FileWriter ʵ�ִ�ָ�����ļ��ж�ȡ�ַ��ͽ��ַ�д��ָ�����ļ�
 * 			ʵ��
 * 
 * 			���������ַ���Ϊ��λ���ж�д-2���ֽ�(2 bytes)
 * 				���Զ�д�ַ�����char[]
 * 				���Զ�д�ַ���String[]
 * 				���Զ�д����
 * �ļ��������
 * */

public class Task06�ַ���ʵ���ļ���д {
	public static void main(String[] args) {
		
//	try {
//		//1.�����ļ��ַ����������
//		FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\temp.txt");
//		//׼��д���ļ����ַ�
//		int id = 1;
//		String name = "��÷֭";
//		String category ="����";
//		int store = 100;
//		String description ="Ӫ������";
//		
//		//ת�����ͣ�ʹ�䲻����,���������ɵ�����
//		String s_id = Integer.toString(id);
//		String s_store = store+" ";//����Ҳ����
//		
//		//2.д�ļ�-���ַ�������д������������Ӧ���ļ���
//	
//		fw.write(s_id);
//		fw.write(name);
//		fw.write(category);
//		fw.write(s_store);
//		fw.write(description);
//		fw.close();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}	
	
		
		//��ȡ�ļ�
		try {
			//1.�����ļ��ַ�������
			FileReader fr = new FileReader("C:\\Users\\mike\\Desktop\\temp.txt");
			//׼���ֽ����飬���ܶ�ȡ������
			char[] buf = new char[1000];
			//2.��ȡ�ļ����ݵ�buf������ʵ�����鳤��
			int length = fr.read(buf);
			//3.�ر���
			fr.close();
			//���ַ�����ת�����ַ���
			String readStr = new String(buf,0,length);
			System.out.println(readStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
