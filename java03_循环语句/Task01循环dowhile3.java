/*����1+2+3.....+100=sum
 *   ��ǰ��Ļ����� sum + 2 +4+6.......+200
 * ��ֵ
 * ѭ�����
 * ѭ������
 * 
 * 
 * */
public class Task01ѭ��dowhile3 {
	public static void main(String[] args) {
		int num = 1;
		int num2 = 0;
		int sum = 0;
		int sum2 = 0;
		do {
			sum += num;
			num++;
		}while(num <= 100);
		System.out.println("sum:" + sum);
		System.out.println("----------------");
		
		int sum3 = 0;//��Ϊ���ս���
		do {
			sum2 += num2;
			num2 += 2;
		
		}while(num2 <= 200);
		
		
		sum3 = sum + sum2;
		System.out.println("sum3:" + sum3);
	}

}
