package Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import com.study.Collection.Course;
/*
 * 选课系统
 * 1.提供可以选课的课程列表（List存储，打印
 * 2.选课
 * 	1）根据课程编号查找课程信息
 * 	2）将选取课程添加到HashSet集合  （取出List类型存入HashSet）
 * */

public class Homework02选课管理 {
	static ArrayList<Course> list = new ArrayList<Course>();
	static HashSet<Course> set = new HashSet<Course>();
	static Scanner sc = new Scanner(System.in);
	static {
		list.add(new Course(1,"数学",4,48,"p老师"));
		list.add(new Course(2,"语文",3,18,"y老师"));
		list.add(new Course(3,"政治",3,18,"t老师"));
		list.add(new Course(4,"英语",4,48,"g老师"));
		list.add(new Course(5,"化学",3,28,"s老师"));
		list.add(new Course(6,"物理",3,28,"v老师"));
		list.add(new Course(7,"高等数学",4,40,"a老师"));
		list.add(new Course(8,"宏观经济学",4,46,"m老师"));
		list.add(new Course(9,"java",3,46,"e老师"));
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("-------------------------");
			printAll();
			System.out.println("-------------------------");
			selectCourse();
			if(set.size() == 9) {
				System.out.println("已选全部课程,系统自动退出！");
				System.exit(0);
			}
		}
	}	
	
	//打印可选课程
	private static void printAll() {
		System.out.println("------------所有课程为--------------");
		for(Course c :list) {
			System.out.println(c);
		}
	}

	//选课
	private static void selectCourse() {
		//输入id并判断id是否符合数据要求
		int id = selectId();
		
		//通过id查找课程
		Course c = findById(id);
		//没有找到返回，进行下一次循环
		
		if(c == null) {
			System.out.println("没有找到该课程！");
			return;
		}
		
		//找到打印课程
		System.out.println("所选课程为：");
		System.out.println(c);
		if(set.contains(c)) {
			System.out.println("课程已选，不可重复修读，无法添加！");
			return;
		}else {
			set.add(c);
			System.out.println("添加成功！");
			System.out.println("------------------------");
			System.out.println("---------已选课程有-------------");
			for(Course course : set) {
				System.out.println(course);
			}
		}
	}

	
	///////////////////////辅助方法///////////////////////////
	private static Course findById(int id) {
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(id == list.get(i).getId()) {
				index = i;
				break;
			}			
		}
		if(index != -1) {
			return list.get(index);
		}else {
			return null;
		}
	}

	//判断输入id并判断id是否符合数据要求
	private static int selectId() {
	while(true) {
		System.out.println("请输入课程id查找并添加课程：");
		String id = sc.next();
		String regex = "^[1-9]$";
		if(!id.matches(regex)) {
			System.out.println("输入id数据格式错误，请在范围内选择！");
			printAll();
			System.out.println("-------------已选课程--------------");
			for(Course course : set) {
				System.out.println(course);
			}
		}else {
			return Integer.parseInt(id);
		}
	}
	}
}