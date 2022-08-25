import java.util.Scanner;

//switch語句 switch(判斷表達式){
//           case 常量1:  語句1;break;判断表达式==常量1 执行语句1
//           case 常量2:  語句2;break;
//          ......
//           default:与前面都不相等 执行默认语句   語句n;}
public class Task06 {
	public static void main(String[] args) {
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請選擇支付方式 1工商銀行 2農業銀行 "
             +"3中國銀行 4建設銀行 "
             	  +"5招商銀行 6郵儲銀行"
               + "7支付寶 8微信 ");
	
           int select = sc.nextInt();
           switch(select) {
           case 1:
   			System.out.println("執行工商銀行支付流程");
             break;
           case 2:
   			System.out.println("執行農業銀行支付流程");
             break;
           case 3:
   			System.out.println("執行中國銀行支付流程");
             break;
           case 4:
   			System.out.println("執行建設銀行支付流程");
        	 break;
           case 5:
   			System.out.println("執行招商銀行支付流程");
             break;
           case 6:
   			System.out.println("執行郵儲銀行支付流程");
             break;
           case 7:
   			System.out.println("執行支付寶支付流程");
            break;
           default:
   			System.out.println("執行微信支付流程");
            break;
        	 
           }
	}
	}

}
