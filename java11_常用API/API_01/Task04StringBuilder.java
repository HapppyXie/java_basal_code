package API��������1;
/*
 * �ַ�������StringBuilder,���ഴ���Ķ��������ݾ��пɸ�����
 * 		StringBuilder��ʵ��:������
 * */
public class Task04StringBuilder {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		StringBuilder builder1 = builder;
		
		builder.append("hello");
		System.out.println(builder1 == builder);
		
		builder.append(" everyone");
		System.out.println(builder1 == builder);
		
		System.out.println(builder.toString());
		
		System.out.println("---------------");
		
		StringBuilder s1 = new StringBuilder("�ҵ�è");
		s1.delete(0, 1);
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println("---------");
		s1.insert(0, "��");
		s1.insert(0,s1);//��0����s1
		System.out.println(s1);
		System.out.println(s1.substring(3));//�������ַ���
		
		System.out.println("---------------");
		s1.reverse();
		System.out.println(s1.toString());
		
		
	}

}
