import java.util.Scanner;

/*
 * 
 * �ҵ����ֵ����Сֵ
 *  
 *  ����������СֵΪһ���µı�����һ�αȽϣ�������ֵ���±���
 * 
 * */
public class �������������3�������ֵ����Сֵ4 {
	public static void main(String[] args) {
		int [] score = {54,89,45,87,98,45,99};
		int max = score[0]; //�ٶ���һ��ֵΪ���ֵ
		int min = score[0]; //�ٶ���һ��ֵҲ����Сֵ
		 for(int i = 1 ; i < 7 ; i++) {
			 if(score[i] > max) {
				 max = score[i];  }
				 if(score[i] < min) {
					 min = score[i];
				 }
			 
		 }
		 double sum = 0;
		 System.out.println("���ֵΪ��" + max);
		 System.out.println("��СֵΪ��" + min);
		 
		 for(int j = 0 ; j < score.length ; j++) {
			  sum += score[j];
		 }
		 System.out.println("ȥ�����ֵ����Сֵ���ƽ��ֵΪ��" + (sum - max -min) / 5);
		 
		 
		 
		
	}

}
