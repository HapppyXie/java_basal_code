package API��������1;
/*
 * ��ɣ�������������	��װ�ࣨ��װ�ࣩ
 * 		boolean		Boolean
 * 		byte		Byte
 * 		short		Short
 * 		int			Integer
 * 		long		Long
 * 		char		Character
 * 		float		Float
 * 		double 		Double
 * 	��8��
 * 
 * Ŀ�ģ����ŶԻ������͵�Ӧ��
 * 		�����������ͼ��ת��	
 * 	ͨ����ҳ���ȡ���������ַ������ͣ��ڸ��ض����Ը�ֵʱ��Ҫ��������ת��
 * 
 * �ص㣺��������ת��
 * 		����Ĺ淶:1.���е�POJO�ࣨ�򵥵ģ�û��ҵ���߼�����ͨ�ࣩ����ʹ�ð�װ��������
 * 				2.RPC�����ķ���ֵ�Ͳ�������ʹ�ð�װ��������
 * 				3.���еľֲ�����ʹ�û�����������
 * */
public class Task06��װ�� {
	public static void main(String[] args) {
		
	//1.�ַ����������������ת��String->int
		String s = "123";
		int x = Integer.parseInt(s);
	    System.out.println(x);
	    
	    			//int->String
	    int a = 10;
		String sa = a+"";//��ֵ����+""�Զ�ת���ַ���
	System.out.println("------");
		
	
	//2.�ַ����������װ��ת��Integer->String
		int x1 = 10;
		Integer x2 = x1;//int ->Integer �Զ�װ��
		
		String s1 = x2.toString();
		String s2 = String.valueOf(x1);
		
		//String->Integer
		String s5 = "123";
		Integer i1 = Integer.parseInt(s5);
		
		
	//3.�����������װ��
		Integer iage1 = new Integer(20);
		int age1 = iage1.intValue();
		
		Integer iage2 = new Integer(20);
		int age2 = iage2;//�Զ�����
		
		int age3 = new Integer(20);
	}
}
