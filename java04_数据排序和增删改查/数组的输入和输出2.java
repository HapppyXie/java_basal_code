import java.util.Scanner;

/*
 * ����ʮ��ѧ���ĳɼ�����ӡ����
 * 
 * 
 * */
public class �������������2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //��������
		int [] score = new int[10];
	//	score[0] = 90;
		//score[1] = 80;
	//	score[2] = 60;
	//	score[3] = 70;
	//	score[4] = 20;
	//	score[5] = 50;  �������ݹ���
	//	score[6] = 30;
	//	score[7] = 98;
	//	score[8] = 91;
	//	score[9] = 85; ����ѭ���ṹ�������������
		System.out.println("������ʮλͬѧ�ĳɼ���");
     for(int i = 0 ; i < score.length ; i++) {//score.length = 10
		 System.out.println("�������" + (i+1) + "��ѧ���ĳɼ�");//i+��ʾi����1��i�����䣬��i++��ʾi��ԭ�������ϼ�1��i��ֵ�ı�
    	 score[i] = sc.nextInt();  //�������
     }
     for (int i = 0; i < score.length; i++) {
		 System.out.print(score[i] + " ");  //������
	}
 
	}

}
