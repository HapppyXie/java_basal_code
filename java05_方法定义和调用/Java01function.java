import java.util.Scanner;

/*
 * �ĸ���������ֵ
 * �����Ƚϣ�ǰ�����Ƚϵó����ֵnum1
 *        �������Ƚϵó����ֵnum2  num1�ٺ�num2�Ƚ�
 * 
 * 
 * */
public class Java01function {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ĸ�������");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		// �ȱȽ�ǰ������ 
		int max1 = 0;
		int max2 = 0;
		int max =0;
		//�������ֵ
		/*
		 * if(num1 > num2) { max1 = num1; }else { max1 = num2; } 
		 * if(num3 > num4) { max =
		 * num3; }else { max = num4; } 
		 * if(max1 > max2) { max = max1; }else { max = max2;
		 * }
		 */ //��������
		max1 = getMax(num1,num2);
		max2 = getMax(num3,num4);
		max = getMax(max1,max2);
		System.out.println("���ֵΪ��"+ max); }
		//�������ַ�֧�ṹ��if�жϺ���⣬����
/*
 *  �����л�ȡ���ֵ�ķ���
 *  x Ϊ��һ���� yΪ�ڶ�����
 *  return x��y�����ֵ
 * 
 * 
 * */  //��������
		public static int getMax(int x ,int y) {
			if(x > y) {
				return x;
			}else {
				return y;
			}		
		
	
}
}  
