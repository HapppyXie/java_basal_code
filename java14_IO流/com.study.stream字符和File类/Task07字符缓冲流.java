package com.study.strem�ַ���File��;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*����
 * BufferedReader  BufferedReader bfr = new BufferedReader(FileReader����);
 * PrintWriter     PrintWriter pw = new PrintWriter(FileWriter ����);
 * 	ʵ����ͨ���ַ���������ȡʵ�����
 * 	����Ҫת������
 * 
 * */
public class Task07�ַ������� {
	public static void main(String[] args) {
				
//			try {
//			FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\temp.txt");
//			PrintWriter pw = new PrintWriter(fw);
//			
//			int id = 1;
//			String name = "��÷֭";
//			String category ="����";
//			int store = 100;
//			String description ="Ӫ������";
//			double price = 6.5;
//			
//			
//			pw.print(id);
//			pw.print(name);
//			pw.print(category);
//			pw.print(store+" ");
//			pw.print(price);
//			pw.print(description);
////int id, String name, String category, double price, int stock, String describtion, int state
//			Product p1 = new Product(2,"�۹���","����",5,20,"����ɿ�",1);
//			
//			//pw.println();дһ��,
//			pw.println("   "+p1.toString());
//			
//			pw.close();
//			
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
			
			
		try {
			FileReader fr = new FileReader("C:\\Users\\mike\\Desktop\\temp.txt");
			BufferedReader br = new BufferedReader(fr);
			
			//String[] buf = new String [1000];���ô���
			
			//���ļ�-��ôд����ô��
			
			String line = br.readLine();//��һ��
			
			br.close();
			System.out.println(line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
