package animal��������ϰ;

public abstract class Animal {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	//��������Ƹ÷���������ʵ��������ʵ��
	public abstract void move();
	
	
	//�������п���û�г��󷽷��� ����move������ȥ��
	public void action() {
		System.out.println("�ƶ���.......");
	}

}
