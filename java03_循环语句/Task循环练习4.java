import java.util.Scanner;

/*
 * 
 * ��ӡ1000���ڵ�ˮ�ɻ���
 * (1����λ��������ÿ��λ�ϵ����ֵ�3��Ļ֮�͵���������)
 * 153 = 1*1*1 + 5*5*5 + 3*3*3
 * ��ֵ int num = 100;
 * ���� num < 1000;
 * ѭ����� �ж��Ƿ���� if(num = )
 *    �ֽ�ˮ�ɻ��� ��������
 *          num++
 * 
 * */
public class Taskѭ����ϰ4 {
	public static void main(String[] args) {
		int hun = 0;//��λ
		int ten = 0;//ʮλ
		int sin = 0;//��λ
		for(int num = 100 ; num < 1000 ; num++) {
			hun = num / 100;
			ten = num % 100 / 10;
			sin = num % 100 % 10;//Ҳ��д�� num % 10��ʮλȡ��
			if(num == hun * hun * hun + ten * ten * ten + sin *sin *sin) {
				System.out.println("��λ��"+ hun);
				System.out.println("ʮλ��"+ ten);
				System.out.println("��λ��"+ sin);
				System.out.println("ˮ�ɻ�����"+ num);
			}
		}
		
		//���һ�������ж�һ�������ǲ���ˮ�ɻ���
	   Scanner sc = new Scanner(System.in);
	 while(true) {
	   System.out.println("������һ������");
	   int num = sc.nextInt();
	   int hun2 = num/100;
	   int ten2 = num%100/10;
	   int sin2 = num%100%10;
	   if(num == sin2*sin2*sin2 + ten2*ten2*ten2 + hun2*hun2*hun2) {
		   System.out.println("����Ϊˮ�ɻ���");
	   }else {
		   System.out.println("��������ˮ�ɻ���");
	   }
		
	}
	}

}
