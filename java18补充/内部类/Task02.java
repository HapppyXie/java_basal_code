package �ڲ���;

//��ʱ�ڲ�����ⲿ�����ͬ������
public class Task02 {
	private int size;
	
	///////////////////�����ڲ���
	public class inner{
		private int size;
		public void doStuff(int size) {
			size++;		//��ȡ�ֲ���������������ֵ
			this.size++;	//��ȡ�ڲ���ĳ�Ա����
			Task02.this.size++;	//��ȡ�����Task02�ĳ�Ա����
			System.out.println("size in inner.doStuff:"+size);
			System.out.println("size in the inner class:"+this.size);
			System.out.println("size in the Task02:"+Task02.this.size);
		}
	}
	inner i = new inner();
	public void increaseSize(int s) {
		i.doStuff(s);
	}
	public static void main(String[] args) {
		Task02 outer = new Task02();
		outer.increaseSize(20);
	}
	
}
