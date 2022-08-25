package Homework2继承和多态;

public class Son1HuaWei extends Phone{
	
	
	//构造方法不继承，得重写
	public Son1HuaWei() {
		System.out.println("Son1HuaWei无参构造----------");
	}
	public Son1HuaWei(String type,String color,int price) {
		super(type,color,price);
		System.out.println("Son1HuaWei有参构造----------");
		
	}
	
	
	
	//get set 以继承
	
	//重写短信方法
	public void sendMessage(String no,String msg) {
		System.out.println("给"+no+"发短信"+msg+"-----来自华为");
		
	}

}
