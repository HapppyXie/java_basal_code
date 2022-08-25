package Homework;


import java.time.LocalDate;
import java.util.Scanner;



/*
 * ��ӡ����
 * 1.������ݺ��·�
 * 2.��ø���ݺ��·��ǵ�һ������ڼ�
 * 3.�����ڼ�-1������1-31��30��28��29
 * 4.��ӡ���飬ÿ7�黻��
 * */
public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.������ݺ��·�
		System.out.println("���������");
		int year = sc.nextInt();
		System.out.println("�������·�");
		int month = sc.nextInt();
		//2.��ø���ݺ��·��ǵ�һ������ڼ�
		LocalDate date = LocalDate.of(year, month,1);
		int weekday = date.getDayOfWeek().getValue()-1;
		//��������,�洢����
		//������Ϊ6*7=42   
		int [] calendar = new int[42];
		//ֱ�ӿ���31��
		for(int i = 1; i <= 31; i ++) {
			calendar[weekday] = i;
			weekday++;
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				if(i == 30) {break;};
			}
			if(month == 2) {
				if(date.isLeapYear()) {
					if(i==29) {
						break;
					}else {
						if(i==28) {
							break;
						}
					}
				}
			}			
		}
		
		//4.��ӡ���飬ÿ7�黻��
		int count = 0;
		System.out.println("һ\t��\t��\t��\t��\t��\t��");
		for(int i = 0; i < calendar.length; i++) {
			if(calendar[i]==0) {
				System.out.print("\t");
			}else {
				System.out.print(calendar[i]+"\t");
			}		
				count++;
			if(count%7==0) {
				System.out.println();
			}
			
		}
		
	}
}
