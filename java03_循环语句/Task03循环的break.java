import java.net.MulticastSocket;
import java.util.Scanner;

/*
 * break   
 * while(){    ....    break�������������� ....}   ��ֹ��ǰѭ�� ����������ѭ��
 * 
 * 
 * continue   ��ֹ����ѭ�� ������һ��ѭ��
 * 
 * 
 * 
 * ��½�ж� ����ѭ���������� һ����ȷ�����˳�ѭ��  ����ȷ�����ѭ��  ����>=5 ���˳�ϵͳ
 * */
public class Task03ѭ����break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������п���");
	    System.out.println("��Ϣ��ѯ�У�");
		 int count = 1;
		 while(true){
			 System.out.println("���������룺");
			 int password = sc.nextInt();
               if(password == 123456){
            	   System.out.println("------------");
            	   System.out.println("1.ȡ��  2.��ѯ");
            	   System.out.println("3.���  4.ת��");
            	   break; //�˳���ǰѭ��while(){}
               }else {  
            	   count++;
            	 if(count <= 5) {
            		 System.out.println("�����������������");
            		 System.out.println("����"+ (5 - count) + "�λ���");
						         	 }else {
            	   System.out.println("�����������5�Σ��뵽��̨������������");
            	   System.exit(0);//�˳�ϵͳ  ���� ȫ���˳�
               }
               }
               
		 }
			 }
	}
		 
		 
		 
		


