package animal抽象类练习;

public class TestAnimal {
	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.setName("辛巴");
		System.out.println(l1.getName());
		l1.move();
		System.out.println("--------------");
		Fish f1 = new Fish();
		f1.setName("金汤汤");
		System.out.println(f1.getName());
		f1.move();
		f1.action();
		
		// 不能实例化 Animal a1 = new Animal();
		//         
		System.out.println("--------------");
		Lion l2 = new Lion();
		l2.setName("咳咳");
		System.out.println(l2.getName());
		l2.move();
		
		
		
	}

}
