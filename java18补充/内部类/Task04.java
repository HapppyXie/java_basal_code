package �ڲ���;

public class Task04 {
	private int size;
	
	//�����ڲ���
	public class inner{
		void doStuff() {
			size++;
			System.out.println("The value of the Outer class:"+size);
		}
	}

}
