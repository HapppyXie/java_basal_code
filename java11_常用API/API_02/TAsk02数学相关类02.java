package API��������2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Random �����������
 * 		
 * */
public class TAsk02��ѧ�����02 {
	public static Scanner sc = new Scanner(System.in);
	public static int[] buyno = new int [3];
	public static int[] winno = new int [3];
	public static void main(String[] args) {
//		Random rd1 = new Random();
//		System.out.println(rd1.nextInt());//��ָ����Χ
//		System.out.println(rd1.nextInt(9));//ָ��0-9
		//�򵥲�Ʊϵͳ
		//1.���Ʊ
		buyLottery();
		//2.��Ʊ����
		getWinno();
		//3.�ҽ�
		getWinMoney();
		
	}
	
	
	private static void buyLottery() {
		System.out.println("----------�����Ʊ----------");
		System.out.println("--------����������0-9֮�������--------");
		for(int i = 0 ; i<buyno.length; i++) {
			buyno[i] = sc.nextInt();
		}
		System.out.println("----------�����Ʊ����λ��-------");
		System.out.println(Arrays.toString(buyno));
		
	}
	private static void getWinno() {
		Random r = new Random();
		for(int i = 0 ; i < winno.length; i++) {
			winno[i] = r.nextInt(9);
		}
		System.out.println("------------�񽱺���Ϊ��-------------");
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
			System.out.println("���ź���û�н�");
		}else {
			System.out.println("�н����ָ���λ��"+bingo);
		}
	}
	
	
	

}
