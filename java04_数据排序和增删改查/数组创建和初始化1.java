/*
 * �������һ���� ʵ�ֶ�һ�����ݵĹ���  ��� ����
 *   ���鶨��� ���Ȳ��ɸı�
 * 
 * */
public class ���鴴���ͳ�ʼ��1 {
	public static void main(String[] args) {
		//��ʽ1��ͨ��new�ķ�ʽ����ռ�   �ȷ���ռ���ʹ��
		int [] score = new int[10];//scoreΪ������,��ʾ���������׵�ַ����������Ϊint���ռ�Ϊ10
		 System.out.println(score[0]);
		 System.out.println(score[9]);
		//score[0] = 80;   ���û�и���ֵ����ֵ���ͻḳ��ֵΪ0
		//score[1] = 78;
		//�� �ȶ��壬�ٷ���
		/* int[] score;
		 * score = new int[10];
		 * 
		 * 
		 */
		 //��ʽ2��ͨ������ֵ�ķ�ʽ��������ռ�
		 int [] goal = {80,84,70,86,65,45};   //�������ݴ�����Ԫ���и�ֵ  
		System.out.println(goal[2]);  //��0��ʼ���� ���������ʱ���������г�ʼ�����������������Ԫ��˳��ֵ
		                               //����ĳ��Ⱦ��ǳ�ʼ�����ݵĸ���
		                               // int [] goal = {87,20,32,,5,65} ����
	    //������������ͣ����ַ������ḳ��ֵΪnull
		String [] name = new String[10];
		System.out.println(name[9]); //����ĳ���Ҫ�ȶ����С��1����Ϊ���0��ʼ����
		System.out.println(name[name.length-1]);
		System.out.println(name[0]);
		
		//����ǲ�������boolean�ḳ��ֵΪfalse
		boolean [] dog = new boolean[10];
		System.out.println(dog[9]);
        System.out.println(dog[10]);	//����Խ���쳣
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
