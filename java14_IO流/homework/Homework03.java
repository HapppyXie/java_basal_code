package com.study.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*	
 * 先创建学生名单，学生作业
 * 
 * 1.获得学生名单
 * 2.获得学生作业
 * 3.遍历学生名单 比较 学生作业名称
 * */
public class Homework03 {
		//准备学生名单
	static String [] names = {"学生1","学生2","学生3","学生4","学生5","学生6","学生7","学生8","学生9"};
	public static void main(String[] args) {
//		//准备学生名单文件
//		createStudent();
//		//准备学生作业文件
//		createHomework();
		
		//获得学生名单
		ArrayList<String> names = getNames();
		//获得学生作业
		String [] filenames = getHomework();
		//遍历检查作业
		checkHomework(names,filenames);
		
	}

	//---------------------获得学生名单列表-----------------
	private static ArrayList<String> getNames() {
		//创建存储姓名列表的集合
		ArrayList<String> names = new ArrayList<String>();
		try {
			FileReader fr = new FileReader("C:\\Users\\mike\\Desktop\\学生名单.csv");
			BufferedReader br = new BufferedReader(fr);
			//读文件
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//添加集合
				names.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("获得学生名单列表完毕");
		System.out.println(names.toString());
		return names;
	}

	//----------------------获得学生作业列表---------------
	private static String[] getHomework() {
		File f = new File("C:\\Users\\mike\\Desktop\\作业");
		String [] filenames = f.list();
		System.out.println("获得学生作业列表完毕");
		for(String filename : filenames) {
			System.out.print(filename.toString());
		}
		System.out.println();
		return filenames;
		
	}

	//----------------------检查作业---------------------
	private static void checkHomework(ArrayList<String> names,String[] filenames) {
		System.out.println("----------------开始检查作业-----------------");
		ArrayList<String> noNames = new ArrayList<String>();
		int namesCount = names.size();
		int filenamesCount = filenames.length; 
		System.out.println("学生人数："+namesCount);
		System.out.println("作业数："+filenamesCount);
		
		for(String name : names) {
			int flag = -1;
			for(String filename : filenames) {
				if(filename.indexOf(name)!=-1) {
					flag = 1;
					break;
				}
			}
			if(flag == -1) {
				//找到未交作业的学生后添加到未交作业名单中
				noNames.add(name);
			}
		}
		System.out.println("---------------------------");
		int noNamesCount = noNames.size();
		System.out.println("未交作业有："+noNamesCount+"人");
		if(noNamesCount >= 0) {
			for(String name : noNames) {
				System.out.println(name);
			}
		}
		}

	
	
	//////////////////////////////辅助方法///////////////////////////////////
	private static void createStudent() {
		try {
			//准备学生名单
			FileWriter fw = new FileWriter("C:\\Users\\mike\\Desktop\\学生名单.csv");
			PrintWriter pw = new PrintWriter(fw);
			for(String s : names) {
				pw.println(s);
			}
			fw.close();
			System.out.println("学生名单准备完毕："+names.length+"位学生");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			//准备学生作业
	private static void createHomework() {
		try {
			//需在桌面上创建一个名为 作业 的文件夹
			for(String s : names) {
			String namesOfhomework = s+".txt";
			File f = new File("C:\\Users\\mike\\Desktop\\作业\\"+namesOfhomework);
				if(!f.exists()) {
					f.createNewFile();
				}
			}
			System.out.println("学生作业准备完毕!");
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
