import java.util.Scanner;

public class Homework02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		//��������
		if(month == 1 || month == 3 || month == 5 || month == 7 ||
				+ month == 8 || month == 10 || month == 12) {
			System.out.println("31��");}
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println("30��");}
				if(month == 2 ) {//����2����29�죬ƽ��2��28��
					if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
					System.out.println("29��");
					}else{   
					System.out.println("28��");
				}
				}} }//���� �ܱ�4���������ܱ�100��������  �����ܱ�400��������
