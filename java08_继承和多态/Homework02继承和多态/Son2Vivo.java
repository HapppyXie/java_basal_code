package Homework2�̳кͶ�̬;

public class Son2Vivo extends Phone{
	
	public Son2Vivo() {
		//super();
		System.out.println("Vivo�޲ι���");
	}
	public Son2Vivo(String type,String color,int price) {
		super(type,color,price);
		System.out.println("Vivo�вι���");
	}
	
	public void getPhoto(String target) {
		System.out.println("��"+target+"����");
	}
	public void play(String game) {
		System.out.println("����"+game);
	}

}
