import java.util.Scanner;

public class Task03 {
          public static void main(String[] args) {
       while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("選擇接受服務方式 1微信 2 支付寶");
			int select = sc.nextInt();//輸入選擇
			if(select ==1) {//雙擊行號 設置
				System.out.println("微信通知");
			}else if(select==2){
					System.out.println("支付寶通知");
			}else{
				System.out.println("请在给出的选项选择！");
			}//不管if-else 都要有{}把語句括起來
			System.out.println("程序繼續執行");
			}
          }
}
			