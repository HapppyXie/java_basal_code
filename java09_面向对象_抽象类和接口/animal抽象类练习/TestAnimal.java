package animal��������ϰ;

public class TestAnimal {
	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.setName("����");
		System.out.println(l1.getName());
		l1.move();
		System.out.println("--------------");
		Fish f1 = new Fish();
		f1.setName("������");
		System.out.println(f1.getName());
		f1.move();
		f1.action();
		
		// ����ʵ���� Animal a1 = new Animal();
		//         
		System.out.println("--------------");
		Lion l2 = new Lion();
		l2.setName("�ȿ�");
		System.out.println(l2.getName());
		l2.move();
		
		
		
	}

}
