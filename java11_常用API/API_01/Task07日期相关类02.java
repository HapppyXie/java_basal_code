package API��������1;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar������
 * 
 * */
public class Task07���������02 {
	public static void main(String[] args) {
		//��ȡָ������
		Calendar c1 = Calendar.getInstance();
		int year = c1.get(Calendar.YEAR);
		System.out.println(year);
		int month = c1.get(Calendar.MONTH)+1;//1�·ݴ�0��ʼ
		System.out.println(month);
		//�·��е���
		int day = c1.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		//һ�ܵ����ڼ�
		int week = c1.get(Calendar.DAY_OF_WEEK)-1;//���ڴ������տ�ʼ
		System.out.println(week);
		
		System.out.println("--------");
		//����ָ������,Date�п��Ի��ָ�����ڣ�����ʱ��
		//ͨ��Calendar��ȡʱ�䣬��ת�����ڶ���
		Calendar c2 = Calendar.getInstance();
		c2.set(2022, 1, 23);
		//Calendar->Date 
		Date d1 = c2.getTime();
		System.out.println(d1);
		
		
		System.out.println("---------");
		// Date -> Calendar
		Date d2 = new Date();
		System.out.println(d2);
		Calendar c3 = Calendar.getInstance();
		c3.setTime(d2);
		System.out.println(c3.get(Calendar.YEAR));
		System.out.println(c3.get(Calendar.MONTH)+1);
		System.out.println(c3.get(Calendar.DAY_OF_WEEK)-1);
	
		
	}

}
