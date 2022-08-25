package com.study.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*	
 * �ȴ���ѧ��������ѧ����ҵ
 * 
 * 1.���ѧ������
 * 2.���ѧ����ҵ
 * 3.����ѧ������ �Ƚ� ѧ����ҵ����
 * */
public class Homework03 {
		//׼��ѧ������
	static String [] names = {"ѧ��1","ѧ��2","ѧ��3","ѧ��4","ѧ��5","ѧ��6","ѧ��7","ѧ��8","ѧ��9"};
	public static void main(String[] args) {
//		//׼��ѧ�������ļ�
//		createStudent();
//		//׼��ѧ����ҵ�ļ�
//		createHomework();
		
		//���ѧ������
		ArrayList<String> names = getNames();
		//���ѧ����ҵ
		String [] filenames = getHomework();
		//���������ҵ
		checkHomework(names,filenames);
		
	}

	//---------------------���ѧ�������б�-----------------
	private static ArrayList<String> getNames() {
		//�����洢�����б�ļ���
		ArrayList<String> names = new ArrayList<String>();
		try {
			FileReader fr = new FileReader("C:\\Users\\mike\\Desktop\\ѧ������.csv");
			BufferedReader br = new BufferedReader(fr);
			//���ļ�
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//��Ӽ���
				names.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���ѧ�������б����");
		System.out.println(names.toString());
		return names;
	}

	//----------------------���ѧ����ҵ�б�---------------
	private static String[] getHomework() {
		File f = new File("C:\\Users\\mike\\Desktop\\��ҵ");
		String [] filenames = f.list();
		System.out.println("���ѧ����ҵ�б����");
		for(String filename : filenames) {
			System.out.print(filename.toString());
		}
		System.out.println();
		return filenames;
		
	}

	//----------------------�����ҵ---------------------
	private static void checkHomework(ArrayList<String> names,String[] filenames) {
		System.out.println("----------------��ʼ�����ҵ-----------------");
		ArrayList<String> noNames = new ArrayList<String>();
		int namesCount = names.size();
		int filenamesCount = filenames.length; 
		System.out.println("ѧ��������"+namesCount);
		System.out.println("��ҵ����"+filenamesCount);
		
		for(String name : names) {
			int flag = -1;
			for(String filename : filenames) {
				if(filename.indexOf(name)!=-1) {
					flag = 1;
					break;
				}
			}
			if(flag == -1) {
				//�ҵ�δ����ҵ��ѧ������ӵ�δ����ҵ������
				noNames.add(name);
			}
		}
		System.out.println("---------------------------");
		int noNamesCount = noNames.size();
		System.out.println("δ����ҵ�У�"+noNamesCount+"��");
		if(noNamesCount >= 0) {
			for(String name : noNames) {
				System.out.println(name);
			}
		}
		}

	
	
	//////////////////////////////��������///////////////////////////////////
	private static void createStudent() {
		try {
			//׼��ѧ������
			FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\ѧ������.csv");
			PrintWriter pw = new PrintWriter(fw);
			for(String s : names) {
				pw.println(s);
			}
			fw.close();
			System.out.println("ѧ������׼����ϣ�"+names.length+"λѧ��");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			//׼��ѧ����ҵ
	private static void createHomework() {
		try {
			//���������ϴ���һ����Ϊ ��ҵ ���ļ���
			for(String s : names) {
			String namesOfhomework = s+".txt";
			File f = new File("C:\\Users\\mike\\Desktop\\��ҵ\\"+namesOfhomework);
				if(!f.exists()) {
					f.createNewFile();
				}
			}
			System.out.println("ѧ����ҵ׼�����!");
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
