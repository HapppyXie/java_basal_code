package Homework2�̳кͶ�̬;

public class Son1HuaWei extends Phone{
	
	
	//���췽�����̳У�����д
	public Son1HuaWei() {
		System.out.println("Son1HuaWei�޲ι���----------");
	}
	public Son1HuaWei(String type,String color,int price) {
		super(type,color,price);
		System.out.println("Son1HuaWei�вι���----------");
		
	}
	
	
	
	//get set �Լ̳�
	
	//��д���ŷ���
	public void sendMessage(String no,String msg) {
		System.out.println("��"+no+"������"+msg+"-----���Ի�Ϊ");
		
	}

}
