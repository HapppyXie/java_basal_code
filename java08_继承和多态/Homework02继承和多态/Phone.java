package Homework2�̳кͶ�̬;

public class Phone {
	private String type;
	private String color;
	private int price;
	
	//�����޲κ��вι���
	public Phone() {
		super();
		System.out.println("Phone���޲ι���------------");
	}	
	public Phone(String type, String color, int price) {
		super();
		System.out.println("Phone���вι���------------");
		this.type = type;
		this.color = color;
		this.price = price;
	}
	//����get��set����
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call(String no) {
		System.out.println("��绰��"+no+"....");
	}
	public void sendMessage(String no,String msg) {
		System.out.println("��"+no+"����Ϣ"+msg);
	}//��������
	public void sendMessage(String no,int second) {
		System.out.println("��"+no+"����Ϣ��"+second+"��");
	}
	
	@Override
	public String toString() {
		return "Phone [type =" + type + ", color=" + color + ", price=" + price + "]";
	}
	
	
	

}
