package API��������2;

import java.math.BigDecimal;

/*
 * Math��ѧ���� ָ����������ƽ�����������Ǻ�����
 * 		���Ժͷ���ȫ������static���� ʹ������ֱ�ӵ���		����.����  ����.����
 * 
 * BigDecimal С���ľ�ȷ���㣬��ָ��С������λ�� �Ӽ��˳�
 * 		
 * 			��Ҫ��;����ȷ����
 * 
 * */

public class Task01��ѧ�����01 {
	public static void main(String[] args) {
		System.out.println(Math.max(98, 20));
		System.out.println(Math.sqrt(99));
		
		BigDecimal bd1 = new BigDecimal("3.14");
		BigDecimal bd2 = new BigDecimal("2.15");
		BigDecimal result = null;
		//��add
		result = bd1.add(bd2);
		System.out.println(result);
		//��
		result = bd1.subtract(bd2);
		//��
		result = bd1.multiply(bd2);
		//��
		result = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);//(���������ȣ���������)
		System.out.println(result);
		
		//���þ���  ����.setScale(С��λ����BigDecimal.ROUND_HALF_UP);
		System.out.println(result.setScale(5,BigDecimal.ROUND_HALF_UP));
		
		System.out.println("-----------");
		//����ȷ����,�޷����ƺ����ж���λ
		double d1 = 3.14;
		double d2 = 2.15;
		double result1 = d1/d2;
		System.out.println(result1);
		
		
		
		
	}

}
