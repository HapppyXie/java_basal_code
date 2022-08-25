import java.util.Scanner;

/*
 * 记录10名学生的报道并按顺序显示所有报道学生姓名
 * 存贮学生的姓名 String
 * 
 *  因为数组的长度确定，索引值是连续的，所以可以通过索引定位每一个数组元素
 *  数组名.length:数组的属性，数组的长度，数组的个数
 * 
 * 
 * */
public class 数组的输入和输出3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String [] names = new String[10];//String存贮字符串类型
		 System.out.println("请输入10学生的姓名：");
		 //输入姓名
		 for(int i = 0 ; i < names.length ; i++){
			 System.out.println("请输入第" + (i+1) +"名学生的姓名");
			 names [i] = sc.next();//输入字符串
		 }
		 System.out.println("--------------");
		 //输出姓名
		 for (int  i = 0;  i < names.length;  i++) {
			System.out.println(names[i]);
		}
	}

}
