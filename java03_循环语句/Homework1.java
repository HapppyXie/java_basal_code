/*����������� 2/1  3/2   5/3  8/5 13/8 21/13  ǰ20��֮��
 * 
 *   ��һ�����ķ�ĸ��ǰһ�����ķ���  ��һ�����ķ�����ǰһ�����ķ��Ӻͷ�ĸ֮��
 *
 * 
 * */
public class Homework1 {
	public static void main(String[] args) {
		double i = 2;
		double p = 1;
		double sum = 0;
		double temp = 0;
		for(int count = 1 ; count <= 20 ; count++) {
			sum += i / p;
			temp = i;
			i = i + p;
			p = temp; 
		}
		System.out.println("sum:" + sum);
	}

}
