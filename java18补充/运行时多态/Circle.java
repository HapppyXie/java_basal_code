package 运行时多态训练01;

public class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw a Circle");
	}

	@Override
	void erase() {
		System.out.println("erase a Circle");
	}
		

}
