package API快速入门2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Random 随机生成数类
 * 		
 * */
public class TAsk02数学相关类02 {
	public static Scanner sc = new Scanner(System.in);
	public static int[] buyno = new int [3];
	public static int[] winno = new int [3];
	public static void main(String[] args) {
//		Random rd1 = new Random();
//		System.out.println(rd1.nextInt());//不指定范围
//		System.out.println(rd1.nextInt(9));//指定0-9
		//简单彩票系统
		//1.买彩票
		buyLottery();
		//2.彩票开奖
		getWinno();
		//3.兑奖
		getWinMoney();
		
	}
	
	
	private static void buyLottery() {
		System.out.println("----------购买彩票----------");
		System.out.println("--------请输入三个0-9之间的数字--------");
		for(int i = 0 ; i<buyno.length; i++) {
			buyno[i] = sc.nextInt();
		}
		System.out.println("----------购买彩票数字位：-------");
		System.out.println(Arrays.toString(buyno));
		
	}
	private static void getWinno() {
		Random r = new Random();
		for(int i = 0 ; i < winno.length; i++) {
			winno[i] = r.nextInt(9);
		}
		System.out.println("------------获奖号码为：-------------");
		System.out.println(Arrays.toString(winno));
		
	}
	private static void getWinMoney() {
		 int bingo = 0;
		for(int i = 0 ; i < winno.length ; i++) {
			if(buyno[i] == winno[i]) {
				bingo += 1;
			}
		}
		if(bingo == 0 ) {
			System.out.println("很遗憾，没中奖");
		}else {
			System.out.println("中奖数字个数位："+bingo);
		}
	}
	
	
	

}
