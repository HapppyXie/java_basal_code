import java.util.Scanner;

/*
 * 方法实现银行业务
 * 
 * */
public class Task02方法实实现银行业务 {
	 static int balance = 1000000;//总的钱数
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("请选择业务：1.取款；2.存款；3.查询余额；4.退出");
		System.out.println("--------------------------------");
		int select = 0;
		select = sc.nextInt();
		switch(select) {
		case 1:
			withdraw();
			break;
		case 2:
			deposit();
			break;
		case 3:
			queryBalance();
			break;
		case 4:
			System.out.println("退出系统");
			System.exit(0);
		default:
				System.out.println("你的选择有误");
			
		}
	}
	public static void withdraw() {//取款
		// TODO Auto-generated method stub
		System.out.println("---------取款-----------");
		System.out.println("请输入取款金额");
		int cash = sc.nextInt();
		if(cash <= balance) { //取太多钱
			balance -= cash;  //余款-取款金额
			System.out.println("取款成功");
		}else {
			System.out.println("余额不足");
		}
		System.out.println("账户余额为："+balance);
	}
	public static void deposit() {//存款
		// TODO Auto-generated method stub
		System.out.println("----------存款--------");
		System.out.println("请将现金放在存钞口");
		System.out.println("请输入存款金额");
		int cash = sc.nextInt();
		balance += cash;
		System.out.println("存款成功，余额为："+balance);
	}
	public static void queryBalance() {//查询余额
		// TODO Auto-generated method stub
		System.out.println("-----------查询余额-----------");
		System.out.println("余额为："+ balance);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
