package Homework2继承和多态;

public class Son2Vivo extends Phone{
	
	public Son2Vivo() {
		//super();
		System.out.println("Vivo无参构造");
	}
	public Son2Vivo(String type,String color,int price) {
		super(type,color,price);
		System.out.println("Vivo有参构造");
	}
	
	public void getPhoto(String target) {
		System.out.println("给"+target+"拍照");
	}
	public void play(String game) {
		System.out.println("启动"+game);
	}

}
