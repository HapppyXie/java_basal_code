import java.util.Scanner;


/*
 * ��������һ���������ж����Ƿ�Ϊһ������/����(ֻ�ܱ�һ��������������)
 * ���е��������Ա�1�ͱ������� 
 *   ����Ӧ������ �������Ա�1�ͱ����������� ���һ����Ա��������������� �Ϳ���
 * 
 * 
 * 
 * */
public class Task03ѭ����break2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("�ж�һ�������Ƿ�Ϊ����");
		System.out.println("������һ������");
		int num = sc.nextInt();
		int flag = 0;//���ñ�ע
            for(int i = 2 ; i < num ; i++) {
            	if(num % i == 0) {
            		flag = 1;//С���� ���ñ�ע ������������
            		break;
            	}
            }	
             if(flag == 1) {
            	 System.out.println("��������");
             }else {
            	 System.out.println("Ϊ����");
             }
            
	}
	}
}
