package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 需求：35选7，不予许出现重复数字，只比较相同数字，不按顺序比较
 * 
 * */
public class Homework02 {
	public static Scanner sc = new Scanner(System.in);
	public static int [] buyno = new int[7];
	public static int [] winno = new int[7];
	public static void main(String[] args) {
		//购买彩票
		getBuyno();
		//开奖
		getWinno();
		//兑奖
		getWinCount();
		//辅助方法 先写辅助方法
	}
	private static void getBuyno() {
		System.out.println("-------------购买彩票----------------");
		System.out.println("请输入7个不相同的数字：");
		for(int i = 0 ; i < buyno.length ; i++) {
			int no = getNo();
			if(isExist(buyno,no)) {
				System.out.println("数字重复，请重新输入！");
				i--;//保证输入的数字仍保留在原位置
			}else {
				buyno[i] = no;
			}
		}
		//打印购买彩票
		System.out.println("购买彩票数字为："+Arrays.toString(buyno));
		
	}
	private static void getWinno() {
		System.out.println("--------------开奖-----------------");
		Random r = new Random();
		for(int i = 0 ; i < winno.length; i++) {
			int no  = r.nextInt(35)+1;//从0开始
			if(isExist(winno,no)) {
				i--;
			}else {
				winno[i] = no;
			}
		}
		//打印开奖彩票
		System.out.println("中奖的彩票数字为:"+Arrays.toString(winno));
	}
	
	private static void getWinCount() {
		System.out.println("-------------兑奖-----------------");
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < winno.length; i++) {
			for(int j = 0; j < buyno.length; j++) {
				if(buyno[j] == winno[i]) {
					count++;
					sb.append(buyno[j]);
				}else {
					continue;
				}
			}
		}
		System.out.println("中奖的数字有："+count+"个");
		if(count>0) {
			System.out.println("数字为："+sb);
		}
	}
	///////////////////////////辅助方法///////////////////////////////
	/*
	 * 判断数组no中是否存在input相等的数字
	 * no数组 input要判断的数字
	 * true已存在  false不存在
	 * */
	private static boolean isExist(int[] no,int input) {
		boolean state = false;
		for(int i = 0; i < no.length; i++) {
			if(no[i] == input) {
				state = true;
				break;
			}
		}
		return state;
	}
	
	/*
	 * 保证输入的是数字
	 * 
	 * */
	private static int getNo() {
		String sno = "";
		String regex = "^[0-9]+$";
		while(true) {
			System.out.println("请输入数字：");
			sno = sc.next();
			if(!sno.matches(regex)) {
				System.out.println("数字格式错误!");
				continue;
			}else {
				return Integer.parseInt(sno);
			}
		}
	}
}

