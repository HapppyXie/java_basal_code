import java.util.Scanner;

/*
 * �������������������������Լ����С�����������������Խ����������� ��
 *  
 *  �ж�˭��˭С
 *  �жϴ���Ƿ���Ա�С������   ���������
 *                        �����������
 * 
 * */
public class Homework3���Ӱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("�˳�������������������������Լ��");
		 System.out.println("�������һ������");
		 int m = sc.nextInt();
		 System.out.println("������ڶ�������");
		 int n = sc.nextInt();
		 int divisor = 0;
		 //�ж�˭��˭С
		 int max = m > n ? m : n;
		 int min = m > n ? n : m;
		 
		 //�ж��ܷ�����
		 
		 if(max % min == 0) {
			 System.out.println("���Լ��Ϊ��" + min);
		 }else {
			 for(int i = 2 ; i < min ; i++) {
				 if(max % i ==0 && min % i == 0 ) {
					 divisor = i;
				 }
			 }System.out.println("���Լ��Ϊ��" + divisor);
		 }
		 
	}

}
