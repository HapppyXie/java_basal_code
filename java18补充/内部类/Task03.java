package �ڲ���;

public class Task03 {
	private int size = 5;
	
	//���巵���ڲ���ķ�����
	public Object makeInner(final int finalLocalVar) {
		int localVar = 6;
		//�����ڲ���
		class Inner{
			//�����ڲ��෽��
			public String toString() {
		return("#<Inner size = "+
			size+"localVar="+localVar//�Ծֲ�����localVar����
			+"finalLocalVar="+finalLocalVar+">");
			}
		}
		return new Inner();//�����ڲ���	
	}
	
	public static void main(String[] args) {
		Task03 outer = new Task03();
		Object obj = outer.makeInner(40);//��������
		//��Object����ܲ��ܳ������ڲ���,����ȥ��finalLocalVar���������ڲ�������
		System.out.println("The object is:"+obj.toString());
	}

}
