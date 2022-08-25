package testMyself;

import java.util.Arrays;

public class test implements Runnable{
	private String w = "啊哈哈哈哈哈哈";
	public static void main(String[] args) {
		String s = "我的小狗今天不是很开行，我不知道怎么办啊！！！";
		System.out.println(s.codePointAt(0));//返回s中指定的字符在gbk中的编码在第几位
		System.out.println(s.lastIndexOf("我"));
		System.out.println(s.indexOf("我"));
		
		String w = "我不知道";
		String [] r = s.split("我");
		System.out.println(Arrays.toString(r));
		String g = "     a5     ";
		System.out.println(g.strip());
		
		System.out.println("--------------");
		String s1 = "1";
		String s2 = "2";
		String s3 =s1+s2;//"12" 只在堆中（常量池外）创建
		System.out.println(s3);
		
		String s4 = s3;//将s3的堆地址给了s4
		System.out.println(s3==s4);//true
		
		String s5 = "12";//在常量池中创建"12"
		System.out.println(s3==s5);//false
		//说明通过字符串+字符串得到的，是在堆中创建（常量池外）
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
