package API��������1;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/*
 * 
 * */
public class Task07���������01 {
	public static void main(String[] args) {
		//��ȡ��ǰʱ��
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println("---------");
		//
		long times = System.currentTimeMillis();
		java.sql.Date d2 = new java.sql.Date(times);
		System.out.println(d2);
		
		System.out.println("---------");
		long times2 = d1.getTime();
		java.sql.Date d3 = new java.sql.Date(times2);//sqlҲ��һ��date
		System.out.println(d3);
		
		System.out.println("----------");
		Timestamp t1 = new Timestamp(times2);//sql��
		System.out.println(t1);//�ȽϾ�׼
		
		System.out.println("----------");
	//����ת�� ����֮���ת��  �������� Ŀ����� = new ��������(�������ڶ���.getTime());
		Date d4 = new Date();
		Timestamp t2 = new Timestamp(d4.getTime());
		System.out.println(t2);
		
		System.out.println("----------");
		
		//1.�ַ���-sql.Date��������
		String birth = "2002-3-1"; 
		//Ĭ�ϸ�ʽҪ��yyyy-[m]m-[d]d hh:mm:ss[.f...]   []��ʾ��ѡ
		java.sql.Date d6 = java.sql.Date.valueOf(birth);
		System.out.println(d6);
		
		System.out.println("----------");
		//sql.Date��������ת�ַ���,��������
		String s1 = d6.toString();
		
		
		//�ַ���-sql.Timestamp��������
		String s2 = "2000-02-09 10:53:11";
		Timestamp t4 = Timestamp.valueOf(s2);
		System.out.println(t4);
		System.out.println("----------");
		//���Scanner��  sc.next();��ȡ�����ݲ����ո� sc.nextLine()�Ż�ȡ��������
//		Scanner sc = new Scanner(System.in);
//		String hj = sc.nextLine();
		
		String s4 = t4.toString();
		
		//�ַ���-util.Date
		String s3 = "2000-02-06 11:01:12";
		Date dd = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//����sdf���ڸ�ʽ������
		System.out.println(dd);
		String df = sdf.format(dd);
		System.out.println(df);
		
		
		
		
	}

}
