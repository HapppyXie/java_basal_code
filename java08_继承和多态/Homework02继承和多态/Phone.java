package Homework2继承和多态;

public class Phone {
	private String type;
	private String color;
	private int price;
	
	//创建无参和有参构造
	public Phone() {
		super();
		System.out.println("Phone类无参构造------------");
	}	
	public Phone(String type, String color, int price) {
		super();
		System.out.println("Phone类有参构造------------");
		this.type = type;
		this.color = color;
		this.price = price;
	}
	//创建get和set方法
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
		System.out.println("打电话给"+no+"....");
	}
	public void sendMessage(String no,String msg) {
		System.out.println("给"+no+"发信息"+msg);
	}//语音短信
	public void sendMessage(String no,int second) {
		System.out.println("给"+no+"发信息："+second+"秒");
	}
	
	@Override
	public String toString() {
		return "Phone [type =" + type + ", color=" + color + ", price=" + price + "]";
	}
	
	
	

}
