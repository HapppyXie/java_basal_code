/*
 * 
 * ����ѭ����1+2.....+100
 * ѭ����ֵ  int num = 1
 * ѭ������ num <=100
 * �ظ��������� 
 * int sum = 0;
 * sum += num;
 * num++;
 * 
 * 
 * 
 * 
 * */
public class Task01ѭ��while2 {
	public static void main(String[] args) {
		 int num = 1;
		 int sum = 0;//�����ʼֵ
		 while(num <= 100) {
			 sum += num;//�ѺͼӸ�sum
			 num++;//ÿ��num��1
		 }
		 System.out.println("sum=" + sum);
		 
		 
		
		
		
	}
	

}
