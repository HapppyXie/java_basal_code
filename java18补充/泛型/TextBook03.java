package java����;
//�������������е����Ͳ�����������ֻ�����������ķ���
class MyBox1<T>{
	private T t;
	public void add(T t) {//���ϵ����ӷ���
		this.t = t;
	}
	public T get() {//���ϻ�ȡ����ķ���
		return t;
	}
//�����������壺 ���η� <���Ͳ���> void ������([����]){}
	public <U> void inspect(U u) {
		System.out.println("T:"+t.getClass().getName());
		System.out.println("U:"+u.getClass().getName());
		System.out.println();
	}
}
public class TextBook03 {
	public static void main(String[] args) {
		MyBox1<Integer> integerBox = new MyBox1<Integer>();
		integerBox.add(new Integer(10));//�������ͼ��ϣ�������һ������
		//���÷��Ͷ��󣬴���һ��String���ͣ�����������������
		System.out.println("The first inspection:");
		integerBox.inspect("some text");
		
		System.out.println("The second inspection:");
		integerBox.inspect(new Double(10.00)); 
		
		
	}
	
	

}
