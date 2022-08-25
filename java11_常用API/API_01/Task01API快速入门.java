package API��������1;

import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;



public class Task01API�������� {
	/*
	 * Java API:JDK�ṩ��������Ա�������򿪷����༰������ķ���
	 * �����
	 * API:application programming interface(һЩԤ�ȶ���ĺ�����ʲô��)
	 * ��Ҫѧϰ��1.����API�����ṩ�ĳ��ù���
	 * 	   	  2.ѧ��鿴API�ĵ���
	 * ��API�ĵ�-���������������鿴-��1.����Ϣ 2.�ֶ�ժҪ 3.���췽�� 4.����ժҪ����Ա��������	 
	 * */	 

	public static void main(String[] args) {
		//��õ�ǰ����
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());//������1970�굽���ھ������ٺ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String localDate = sdf.format(date);
		System.out.println(localDate);
		
		//�������
		int [] score = {78,56,9,47,66,88,99,87,78};
		Arrays.sort(score);
		System.out.println(score);
		System.out.println(score.toString());//û����дtoString()����
		System.out.println(Arrays.toString(score));
		
		
		//LocalDate date1 = new LocalDate(); LocalDate û��ר�ŵĹ��췽��,��ͨ����̬����
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getDayOfYear());
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getDayOfWeek());
		System.out.println(date1.getClass());
		
		String password = "1345678932";
		System.out.println(password.length());
		
		
	}

}
