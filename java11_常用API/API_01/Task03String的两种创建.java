package API��������1;

public class Task03String�����ִ��� {
	public static void main(String[] args) {
		//�˺���֤
	String regex ="^[a-zA-Z][a-zA-Z0-9_]{5,19}";
	String account = "x2646793432";
	System.out.println(account.matches(regex));
	
	String regex1 = "^[0-9]{17}[0-9|x]$";
	String id ="44088220020306043x";
	System.out.println(id.matches(regex1));
	System.out.println("----------------");
	
	/*
	 * String�����ִ�����ʽ
	 * ���������ϣ���סcontrol�鿴Դ��
	 * */
	String str1 = "ƻ��";//���ڶ��ڴ��еĳ����أ��泣���ĵط������ٴ洢�ռ䣬�ٰѶѵ�ַ��ջ�ڴ�
	String str2 = new String("ƻ��");//�ڶ��ڴ�ĳ������︴��һ��ƻ���������µĶѴ洢�ռ䣬�ٰѶ��ڴ��ַ��ջ�ڴ�
	
	System.out.println(str1 == str2);
	System.out.println(str1.equals(str2));//equals()�����鿴�ַ��������Ƿ����
	
	String str5 = str1;//�൱�ڰ�str1��ֵ���ѵ�ַ����str5
	System.out.println(str5==str1);
	System.out.println("-------------------");
	
	String str3 = "ƻ��";//�ڶ��ڴ��дӳ������и���ƻ���ĵ�ַ����ջ�ڴ�
	String str4 = new String("ƻ��");//�ڶ��ڴ�ĳ������︴��һ��ƻ���������µĶѴ洢�ռ䣬�ٰѶ��ڴ��ַ��ջ�ڴ�
	System.out.println(str1 == str3); //newһ���Ὺ�ٴ洢�ռ�
	System.out.println(str2 == str4);//�����˵����ַ�����
	System.out.println("--------------------");
	/*   == ջ�ڴ��е�ֵ�Ƚϵ�ַ
	 * 		int a =10,b = 10;
	 * 		a == b 
	 *   �������ͱȽϵ�����ֵ,aֱ�Ӵ洢��ֵ
	 *   �������ͱȽϵ��ǵ�ֵַ  str1�洢���ڴ��ַ
	 * */
	
	int a = 10,b = 10;
	System.out.println(a == b);
	/*	equals()  Object��ıȽϷ���  
	 *  String ����д��Object���equals����������ַ����бȽ�
	 *  ע�⣺�Զ������û����дequals��������ʹ��equals�����Ƚ�ʱ��ʵ�ʱȽϵ��ǵ�ַ����==��ͬ
	 * */
	Object obj = "";
	obj.equals(obj);
	System.out.println("------------------------");
	//String ��Ĳ��ɱ�
	String s1 = "hello";
	String temp = s1;
	System.out.println(s1 == temp);
	System.out.println("-----------------------");
	s1 = s1+"";//�ı���ԭ�ַ��������ڳ������￪�� hello+""�γ��¶ѵ�ַ��ջ�ڴ�
	System.out.println(temp.equals(s1));
	System.out.println(temp == s1);
	
	System.out.println("-----------------------");
	String q1 = new String("abc");
	String q2 = "abc";
	System.out.println(q1==q2);

}

}
