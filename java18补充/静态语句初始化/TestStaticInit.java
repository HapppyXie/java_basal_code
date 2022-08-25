package 静态语句初始化;

public class TestStaticInit {
	public static void main(String[] args) {
		System.out.println("Main code:"+StaticInitDemo.i);
	}
	//执行该程序，首先执行StaticInitDemo,静态变量i初始化为0，执行i++（=0）后 i=1
	//				然后返回TestStaticInit程序

}
