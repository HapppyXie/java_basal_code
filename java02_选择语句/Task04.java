import java.util.Scanner;

//if-else嵌套
//if(){        if(){    }else{    }else{  if(){}else{}        }


//if-else多分支嵌套 if(){語句塊1}else if(){語句塊2}else if(){語句塊3}else{語句塊4}
//第一個爲真 執行下去 不再判斷 爲假 執行下一個判斷 類推 只執行一個
public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請選擇支付方式 1工商銀行 2農業銀行 "
				                      +"3中國銀行 4建設銀行 "
			                       	  +"5招商銀行 6郵儲銀行"
				                     + "7支付寶 8微信 ");
		int select = sc.nextInt();
		if(select == 1) {
			System.out.println("執行工商銀行支付流程");
		}else if(select == 2) {
			System.out.println("執行農業銀行支付流程");
		}else if(select == 3) {
			System.out.println("執行中國銀行支付流程");
		}else if(select == 4) {
			System.out.println("執行建設銀行支付流程");
		}else if(select == 5) {
			System.out.println("執行招商銀行支付流程");
		}else if(select == 6) {
			System.out.println("執行郵儲銀行支付流程");
		}else if(select == 7) {
			System.out.println("執行支付寶支付流程");
		}else {
			System.out.println("執行微信支付流程");
		}
		
	}

}
