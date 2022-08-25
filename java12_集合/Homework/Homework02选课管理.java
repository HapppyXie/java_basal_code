package Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import com.study.Collection.Course;
/*
 * ѡ��ϵͳ
 * 1.�ṩ����ѡ�εĿγ��б�List�洢����ӡ
 * 2.ѡ��
 * 	1�����ݿγ̱�Ų��ҿγ���Ϣ
 * 	2����ѡȡ�γ���ӵ�HashSet����  ��ȡ��List���ʹ���HashSet��
 * */

public class Homework02ѡ�ι��� {
	static ArrayList<Course> list = new ArrayList<Course>();
	static HashSet<Course> set = new HashSet<Course>();
	static Scanner sc = new Scanner(System.in);
	static {
		list.add(new Course(1,"��ѧ",4,48,"p��ʦ"));
		list.add(new Course(2,"����",3,18,"y��ʦ"));
		list.add(new Course(3,"����",3,18,"t��ʦ"));
		list.add(new Course(4,"Ӣ��",4,48,"g��ʦ"));
		list.add(new Course(5,"��ѧ",3,28,"s��ʦ"));
		list.add(new Course(6,"����",3,28,"v��ʦ"));
		list.add(new Course(7,"�ߵ���ѧ",4,40,"a��ʦ"));
		list.add(new Course(8,"��۾���ѧ",4,46,"m��ʦ"));
		list.add(new Course(9,"java",3,46,"e��ʦ"));
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("-------------------------");
			printAll();
			System.out.println("-------------------------");
			selectCourse();
			if(set.size() == 9) {
				System.out.println("��ѡȫ���γ�,ϵͳ�Զ��˳���");
				System.exit(0);
			}
		}
	}	
	
	//��ӡ��ѡ�γ�
	private static void printAll() {
		System.out.println("------------���пγ�Ϊ--------------");
		for(Course c :list) {
			System.out.println(c);
		}
	}

	//ѡ��
	private static void selectCourse() {
		//����id���ж�id�Ƿ��������Ҫ��
		int id = selectId();
		
		//ͨ��id���ҿγ�
		Course c = findById(id);
		//û���ҵ����أ�������һ��ѭ��
		
		if(c == null) {
			System.out.println("û���ҵ��ÿγ̣�");
			return;
		}
		
		//�ҵ���ӡ�γ�
		System.out.println("��ѡ�γ�Ϊ��");
		System.out.println(c);
		if(set.contains(c)) {
			System.out.println("�γ���ѡ�������ظ��޶����޷���ӣ�");
			return;
		}else {
			set.add(c);
			System.out.println("��ӳɹ���");
			System.out.println("------------------------");
			System.out.println("---------��ѡ�γ���-------------");
			for(Course course : set) {
				System.out.println(course);
			}
		}
	}

	
	///////////////////////��������///////////////////////////
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

	//�ж�����id���ж�id�Ƿ��������Ҫ��
	private static int selectId() {
	while(true) {
		System.out.println("������γ�id���Ҳ���ӿγ̣�");
		String id = sc.next();
		String regex = "^[1-9]$";
		if(!id.matches(regex)) {
			System.out.println("����id���ݸ�ʽ�������ڷ�Χ��ѡ��");
			printAll();
			System.out.println("-------------��ѡ�γ�--------------");
			for(Course course : set) {
				System.out.println(course);
			}
		}else {
			return Integer.parseInt(id);
		}
	}
	}
}