import java.util.Scanner;

/*
 * ��¼10��ѧ���ı�������˳����ʾ���б���ѧ������
 * ����ѧ�������� String
 * 
 *  ��Ϊ����ĳ���ȷ��������ֵ�������ģ����Կ���ͨ��������λÿһ������Ԫ��
 *  ������.length:��������ԣ�����ĳ��ȣ�����ĸ���
 * 
 * 
 * */
public class �������������3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String [] names = new String[10];//String�����ַ�������
		 System.out.println("������10ѧ����������");
		 //��������
		 for(int i = 0 ; i < names.length ; i++){
			 System.out.println("�������" + (i+1) +"��ѧ��������");
			 names [i] = sc.next();//�����ַ���
		 }
		 System.out.println("--------------");
		 //�������
		 for (int  i = 0;  i < names.length;  i++) {
			System.out.println(names[i]);
		}
	}

}
