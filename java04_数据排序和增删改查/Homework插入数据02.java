import java.util.Scanner;

/*
 * 
 * ����һ������(Ҫ��ԭ����������)��ʹ�����Ա�������
 * 
 * int [] num = {3,6,9,12,34,0} �˴�����0Ϊ����Ĳ���׼��һ���ռ�
 *  ���������Դ��int input = 0;
 *   1.input <= num[0];  ��������Ԫ�غ���
 *   2.intput >= num[num.length-2] ֱ�ӷŵ����һ��λ��
 *   3.intput > num[i] && intput < num[i+1] ����Ԫ�ش�i+1֮�����
 *    
 * * */
public class Homework��������02 {
	public static void main(String[] args) {
		// �����ʼ����
		int[] num = {3,6,9,12,34,0};  
		//�˴���0 ��ʹ��num.length-1ʡ�� ?,���ɴ�ʱnum��δ�������
		//��ӡ��ʼ����
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("������Ҫ��������ݣ�");
		System.out.println("--------------");

		//��������
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input <= num[0]) {
			//���ڵ�һλ������Ԫ�غ��ƣ��ȴ����һ������
			//�Ⱥ��ˣ��ٸ�ֵ�����⸲��
			for(int j = num.length-2 ; j >= 0 ; j--) {
				num[j+1] = num[j];
			}
			num[0] = input;
			
		}else if(input >= num[num.length-2]) {
			//�������һλ
			num[num.length-1] = input;
		}else {
			//�����м�
			int flag = 0 ;
		   for(int p = 0 ; p < num.length ; p++) {
			   if(input >= num[p] && input <= num[p+1]) {
					//�ҵ�λ�ú��p+1��ʼ�������� ����p+1����������
				   flag = p+1;
				   break;
			   }
		   }
	
			for(int g = num.length-2 ; g >= flag ; g--) {
				num[g+1] = num[g];
			}
			num[flag] = input;
		}
		//����������ݺ������
		System.out.println("--------------");
		for(int w = 0 ; w < num.length ; w++) {
			System.out.print(num[w]+" ");
		}
	
	}

}
