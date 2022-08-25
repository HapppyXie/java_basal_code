package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * ����35ѡ7������������ظ����֣�ֻ�Ƚ���ͬ���֣�����˳��Ƚ�
 * 
 * */
public class Homework02 {
	public static Scanner sc = new Scanner(System.in);
	public static int [] buyno = new int[7];
	public static int [] winno = new int[7];
	public static void main(String[] args) {
		//�����Ʊ
		getBuyno();
		//����
		getWinno();
		//�ҽ�
		getWinCount();
		//�������� ��д��������
	}
	private static void getBuyno() {
		System.out.println("-------------�����Ʊ----------------");
		System.out.println("������7������ͬ�����֣�");
		for(int i = 0 ; i < buyno.length ; i++) {
			int no = getNo();
			if(isExist(buyno,no)) {
				System.out.println("�����ظ������������룡");
				i--;//��֤����������Ա�����ԭλ��
			}else {
				buyno[i] = no;
			}
		}
		//��ӡ�����Ʊ
		System.out.println("�����Ʊ����Ϊ��"+Arrays.toString(buyno));
		
	}
	private static void getWinno() {
		System.out.println("--------------����-----------------");
		Random r = new Random();
		for(int i = 0 ; i < winno.length; i++) {
			int no  = r.nextInt(35)+1;//��0��ʼ
			if(isExist(winno,no)) {
				i--;
			}else {
				winno[i] = no;
			}
		}
		//��ӡ������Ʊ
		System.out.println("�н��Ĳ�Ʊ����Ϊ:"+Arrays.toString(winno));
	}
	
	private static void getWinCount() {
		System.out.println("-------------�ҽ�-----------------");
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
		System.out.println("�н��������У�"+count+"��");
		if(count>0) {
			System.out.println("����Ϊ��"+sb);
		}
	}
	///////////////////////////��������///////////////////////////////
	/*
	 * �ж�����no���Ƿ����input��ȵ�����
	 * no���� inputҪ�жϵ�����
	 * true�Ѵ���  false������
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
	 * ��֤�����������
	 * 
	 * */
	private static int getNo() {
		String sno = "";
		String regex = "^[0-9]+$";
		while(true) {
			System.out.println("���������֣�");
			sno = sc.next();
			if(!sno.matches(regex)) {
				System.out.println("���ָ�ʽ����!");
				continue;
			}else {
				return Integer.parseInt(sno);
			}
		}
	}
}

