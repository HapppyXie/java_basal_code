package 运行时多态训练01;

public class Square extends Shape{

	@Override
	void draw() {
		System.out.println("draw a Square");
	}

	@Override
	void erase() {
		System.out.println("erase a Square");
	}
	
	

}
