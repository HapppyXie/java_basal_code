package �ڲ���;
//Task01Ϊ�����
public class Task01 {
	private static int size;
	
	//�����ڲ��� ��������ǲ�����()��     /////////////////
	public class inner{
		private String name;
		//�ڲ����޲ι���
		public inner() {
			
		}
		public inner(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
		public void doStuff() {
			size++;
			//�ڲ�����Ϊ������һ����Աʹ�ã��ɷ���static��Ա��private��Ա			
		}
	}
	////////////////////////////////////////////////
	
	inner i = new inner();
	
	public void increaseSize() {
			i.doStuff();
	}
	
	public static void main(String[] args) {
		Task01 outer = new Task01();
		for(int i=0;i<4;i++) {
			outer.increaseSize();
			System.out.println("The value of size:"+outer.size);
		}
	}
	/*
	 * JVM���ڲ����ʵ���У����ڲ�������б�����һ������������������ã�
	 * �����ڲ������ͨ���������ҵ������Ķ��󣬽������������ĳ�Ա
	 * 
	 * 
	 * 
	 * */
}

