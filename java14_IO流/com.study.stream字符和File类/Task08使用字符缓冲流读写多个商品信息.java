package com.study.strem�ַ���File��;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Task08ʹ���ַ���������д�����Ʒ��Ϣ {
	public static void main(String[] args)  {
		//׼������
		ArrayList<Product> list = new ArrayList<Product>();
//int id, String name, String category, double price, int stock, String description, int state
		list.add(new Product(1,"����","����",3.5,100,"��ˬ���",1));
		list.add(new Product(2,"ѩ��","����",3.5,100,"͸�������ķ���",1));
		list.add(new Product(3,"��֭","����",3.5,100,"Ӫ����֭",1));
		list.add(new Product(4,"����","����",6.0,100,"��������",1));
		list.add(new Product(6,"Ԫ��ɭ��","����",4.0,100,"��ˮ����",1));
		
		//д�ļ�
		try {
			//�����ַ�������ͻ�����
			FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\Product.csv");
			PrintWriter pw = new PrintWriter(fw);
			//ѭ��д���ļ�
			for(Product p :list) {
				pw.println(p);
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		ArrayList<Product> list2 = new ArrayList<Product>();
//		try {
//			FileReader fr = new FileReader("C:\\Users\\mike\\Desktop\\Product.csv");
//			BufferedReader br = new BufferedReader(fr);
//			
//			while(true) {
//				//��ȡһ����Ϣ
//				String line = br.readLine();
//				if(line == null) {
//					break;
//				}
//				//�Ѷ��ص���ת�ɶ�����ϢΪ��,Ϊ������ַ�
//				String [] buf = line.split(",");
//				//int id, String name, String category, double price, 
//				//int stock, String describtion, int state
//				int id = Integer.parseInt(buf[0]);
//				String name = buf[1];
//				String category = buf[2];
//				double price = Double.parseDouble(buf[3]);
//				
//				int stock = Integer.parseInt(buf[4].strip());
//				
//				String description = buf[5];
//				int state = Integer.parseInt(buf[6]);
//				//��϶���
//				Product p = new Product(id,name,category,price,stock,description,state);
//				list2.add(p);
//			}
//			//�ر���
//			br.close();
//			for(Product p :list2) {
//				System.out.println(p);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
	}

}
