import java.util.Scanner;

//認識if語句
 // 單if   if（布爾表達式，邏輯表達）{       //if語句塊}
// if-else  if(布爾表達式）{  //語句塊1}else{    語句塊2}
//if-else嵌套
public class Task02 {
	public static void main(String[] args) {
	while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("選擇車次");
		System.out.println("是否投保1是0否");
		//輸入數據
		int select = sc.nextInt();
		if(select == 1) { //if語句只與其下一行有關係，在沒有加{}時
			System.out.println("投保3元33萬");
			System.out.println("支付投保定額");
			}else {
			 System.out.println("祝你旅途愉快！");
			}
		System.out.println("支付成功");
		System.out.println("提交訂單");
		System.out.println("退出系统");
	
		
	}
	}

}
