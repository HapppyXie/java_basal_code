package API��������1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * ���ڣ�LocalDate  ������
 * ʱ�䣺LocalTime  ʱ����
 * ����ʱ�䣺LocalDateTime  ������ʱ����
 * ʱ�����Instant
 * ת����DateTimeFormatter
 * 
 * ��ҪӦ�ã�LocaleDateΪ������
 * 
 * */
public class Task08���������JDK8���� {
	//��ҪӦ�ã�LocaleDateΪ������
	//��ȡ����ʱ��
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		int year = date1.getYear();
		System.out.println(date1);
		System.out.println("��:"+year);
		int month = date1.getMonth().getValue();
		System.out.println("��:"+month);
		int day = date1.getDayOfMonth();
		System.out.println("��:"+day);
		int weekday = date1.getDayOfWeek().getValue();
		System.out.println("����:"+weekday);
		
	//����ʱ��
		LocalDate date2 = LocalDate.of(2011,11,11);
		System.out.println(date2);
		
		System.out.println("--------------------");
	//����ת��
		String str1 = "2022-01-11";//Ĭ��-λ���
		LocalDate ld1 = LocalDate.parse(str1);//��һ��
		System.out.println(ld1);
		
		String str2 = "2022/01/11";//��ָ�����,�ڶ���
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ld2 = LocalDate.parse(str2,formatter);
		System.out.println(ld2);
		
		System.out.println("-------------------");
	//��������
		LocalDate l1 = LocalDate.of(2022,11,11);
		System.out.println("����:"+l1);
		LocalDate b1 = l1.plusYears(1);//��һ��
		System.out.println("b1:"+b1);
		LocalDate b2 = l1.minusMonths(2);//������
		System.out.println("b2:"+b2);
		LocalDate b3 = l1.minusDays(3);//������
		System.out.println("b3:"+b3);
		
		System.out.println(l1 == b1);
	//LocalDateΪ���ɱ�
		
	//���ݱȽ�
		System.out.println("-----------");
		LocalDate date4 = LocalDate.parse("2022-01-28");
		LocalDate date5 = LocalDate.parse("2022-04-11");
		System.out.println(date4.isAfter(date5));
		System.out.println(date4.isBefore(date5));
		System.out.println(date4.isEqual(date5));
	}	
}
