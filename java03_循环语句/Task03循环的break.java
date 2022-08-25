import java.net.MulticastSocket;
import java.util.Scanner;

/*
 * break   
 * while(){    ....    break遇到就跳出语句块 ....}   终止当前循环 即跳出本层循环
 * 
 * 
 * continue   终止本次循环 继续下一次循环
 * 
 * 
 * 
 * 登陆判断 可以循环输入密码 一旦正确，则退出循环  不正确则继续循环  次数>=5 则退出系统
 * */
public class Task03循环的break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请插入银行卡：");
	    System.out.println("信息咨询中：");
		 int count = 1;
		 while(true){
			 System.out.println("请输入密码：");
			 int password = sc.nextInt();
               if(password == 123456){
            	   System.out.println("------------");
            	   System.out.println("1.取款  2.查询");
            	   System.out.println("3.存款  4.转账");
            	   break; //退出当前循环while(){}
               }else {  
            	   count++;
            	 if(count <= 5) {
            		 System.out.println("密码错误，请重新输入");
            		 System.out.println("还有"+ (5 - count) + "次机会");
						         	 }else {
            	   System.out.println("错误次数超过5次，请到柜台办理密码重置");
            	   System.exit(0);//退出系统  整个 全部退出
               }
               }
               
		 }
			 }
	}
		 
		 
		 
		


