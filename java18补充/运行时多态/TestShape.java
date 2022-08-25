package 运行时多态训练01;

import java.util.Random;

public class TestShape {
		public static void drawOneShape(Shape s) {
			s.draw();
		}
		public static void drawManyShapes(Shape [] ss) {
			for(int i = 0; i < ss.length; i++) {
				ss[i].draw();
			}
		}
		public static void eraseOneShapes(Shape s) {
			s.erase();
		}
		public static void eraseManyShapes(Shape [] ss) {
			for(int i = 0; i < ss.length; i++) {
				ss[i].erase();
			}
		}
		public static void main(String[] args) {
			Random rand = new Random();
			Shape [] s1 = new Shape[9];
			for(int i = 0; i < s1.length; i++) {
				switch(rand.nextInt(4)){
			case 0: s1[i] = new Circle();
				break;			//上转型
			case 1: s1[i] = new Square();
				break;
			case 2: s1[i] = new Triangle();
				break;
			case 3: s1[i] = new Pentagon();
				break;
					}
				}
			drawManyShapes(s1);//多态，调用同名方法，得到不同实现
			System.out.println("---------------");
			eraseManyShapes(s1);
			}
		}
		


