/*��ӡ�������Ǻ�
 * ������ѭ��
 * 1.��ӡ�ո�
 * 2��ӡ�Ǻ�
 * 3��ӡ�ո� x ����Ҫ ��ʱ����ո�ҪҲ��
 * 4����
 *   ����  �Ǻ�  �ո�
 *   1     1    3
 *   2     3    2
 *   3     5    1
 *   4     7    0
 *                   ���� + �ո��� = 4
 *                   �ո��� = 4 - ����
 *                   �Ǻ��� = ���� * 2 - 1
 * 
 * 
 * 
 * */
public class Task02ѭ����Ƕ��3 {
	
	public static void main(String[] args) {

		for (int line = 1; line <= 4; line++) {

			for (int k = 1; k <= 4 - line; k++) {
				System.out.print(" ");
			}

			for (int i = 1; i <= line * 2 - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int q = 6;
		//������
		for(int line = 1 ; line <= 4 ; line++) {
			//���ƿո�
			for(int k = 1 ; k <= line-1 ; k++) {
				System.out.print(" ");
			}
			//�����Ǻ�
			   for(int i = 0 ; i <= q  ; i++) {
				   
				   System.out.print("*");
			   }
			   q -= 2;// ����q=q-2;
			   System.out.println();
		}


	}
}
