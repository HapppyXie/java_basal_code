package com.study.strem�ַ���File��;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/*
 * File�౻����Ϊ:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ
 * 				��ΪFile����Ա�ʾ�ļ�Ҳ���Ա�ʾĿ¼�����Ƕ�ͨ����Ӧ��·��������
 * 		ͨ�����캯������һ��File�������ö������ָ���ļ�������
 * 		File f = new File("C:\\Users\\mike\\Desktop\\Product.csv");
 * 
 * 		����һ��File�����f����ͨ��f��product.csv���в���
 * 		File f = new File("C:\\Users\\mike\\Desktop\\Product.csv");
 * 		FileInputStream fin = new FileInputStream(f);��File�����Ϊ��������IO��
 * 
 * 		File�෽��(�鿴API)
 * 		File����û���ṩ���ļ��Ķ�д����,���Ҫʵ�ֶ��ļ��Ķ�д,����Ҫͨ������ʵ��
 * */
public class Task09��ʶFile�� {
	public static void main(String[] args) throws IOException{
//		File f = new File("C:\\Users\\mike\\Desktop\\Product.csv");
//		FileReader fr = new FileReader(f);
		
		//���ָ���ļ������ڣ�ͨ��createNewFile()��������
		//���ļ����ļ��������,���������,�쳣FileNotFoundException
		//д�ļ�,�ļ����Բ�����,��������ڣ�ϵͳ�Զ�����
//		File f2 = new File("C:\\Users\\mike\\Desktop\\P.csv");
//		if(!f2.exists()) {
//			f2.createNewFile();
//		}
		
		//File f3 = new File("C:\\Users\\mike\\Desktop\\С����ϵ��ʽ.txt");
		File f3 = new File("C:\\Users\\mike\\Desktop");
		if(!f3.exists()) {
			try {
				f3.createNewFile();//��ʱ����Ŀ¼����
				
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
		System.out.println("���ļ���"+f3.isFile());
		System.out.println("��Ŀ¼��"+f3.isDirectory());
		//�鿴Ŀ¼�е��ļ��б�
		System.out.println("Ŀ¼�б�"+Arrays.toString(f3.list()));
		System.out.println("------------------------");
		System.out.println("·����"+f3.getPath());
		System.out.println("����·����"+f3.getAbsolutePath());
		System.out.println("����޸�ʱ�䣺"+new Date(f3.lastModified()));
		System.out.println("�ļ���С:"+f3.length());
		System.out.println("�ļ��ɶ���"+f3.canRead());
		System.out.println("�ļ���д��"+f3.canWrite());
		System.out.println("�ļ���ִ����:"+f3.canExecute());
	}

}
