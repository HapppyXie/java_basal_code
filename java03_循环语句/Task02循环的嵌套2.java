/*
 * 
 * ��ӡƽ���ı����Ǻ�
 * ������10��
 * 1.��ӡ�ո� 
 * 2.�ڲ�ѭ��  ��ӡ20���Ǻ� 
 * 3.����
 *    ��     �ո�    �Ǻ�
 *    1      0      20
 *    2      1      20
 *    3      2      20
 *    4      3      20    ����-1=�ո���
 * 
 * 
 * 
 * */
public class Task02ѭ����Ƕ��2 {
	public static void main(String[] args) {
		//���ѭ�� ����10��
		for(int i = 1 ; i <= 10 ; i++) {
			//���ƿո�
				for(int k = 1 ; k <= i - 1 ;k++) {
					System.out.print(" ");
				}
				//�����Ǻ�
				for(int j = 1 ; j <= 20 ; j++) {
					System.out.print("*");

				}

				//����
			System.out.println();
			
		}
		
		//�������� 
		for(int i = 1 ; i <= 10 ; i++) {
			//���ƿո�
			for(int k = 1 ; k <= 10-i ; k++) {
				System.out.print(" ");
			}
			//�����Ǻ�
			for(int j = 1 ; j <= 20 ; j++) {
				System.out.print("*");
			}
			System.out.println();	
			
		
		}
		
	
		}

}
