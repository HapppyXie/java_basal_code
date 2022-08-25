package 静态语句初始化;
/*
 * 两种格式初始化静态变量
 * */
public class StaticInitDemo {
	static int i = 0;
	static int x;
	static {
		x = 0;
		System.out.println("static code:"+i++);  
		//++,--：前缀：变量的值和表达式的值都改变
	    //	    后缀：变量的值改变，表达式的值不变
	}

}
