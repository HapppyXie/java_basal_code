import com.sun.tools.javac.Main;

//�зŻ�ֵ����
public class Java04function����Ӧ�ð���02 {
	public static void main(String[] args) {
		//1.����������-��Ҫ�н��ܷ���ֵ������
		/*
		 * int min = getMin(56,78); 
		 * System.out.println(min);
		 */
		//2.��Ϊ�����Ĳ�������-���ص�ֵ��Ϊ����ֵ
		
		System.out.println(getMin(56,78));
	}
	
	
	
	/*
	 * ���ܣ�����������������Сֵ
	 * 
	 * 
	 * 
	 * */
	public static int getMin(int x,int y) {
		if(x > y) {
			return y;
		}else {
			return x;
		}
		
	}

}
