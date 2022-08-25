package 内部类;

/*
 * 本地类(或局部类)和匿名类是两种类型的内部类。
 * 如果内部类在一个方法体中声明，则该类就称为本地类，而没有类名的本地类就是匿名类
 * 
 * 
 * */
public class Task05 {
	public static void main(String[] args) {
		ClassA ca = new ClassA(){
			void aMethod() {
				//重写的方法才可被创建的对象在外部调用
				System.out.println("匿名类来了哦！！！");
				bMethod();
			}
			
			//无法在外部使用该方法,但可以在
			void bMethod() {
				System.out.println("匿名类追加的方法来了哦！！！");
			}
		};
		
		ca.aMethod();
		inner i = new inner();
		//声明为static后无法再调用，外部类的成员了
		
	}
	
	
	
	public void A(){
		System.out.println("A方法");
	}
	
	public static class inner{
		
	}
}
