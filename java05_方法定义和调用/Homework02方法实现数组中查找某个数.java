import java.util.Arrays;
import java.util.Scanner;

/*
 * ����ʵ���������в���ĳ�����Ż�����
 * 
 * */
public class Homework02����ʵ�������в���ĳ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = {23,45,7,23,56,78,124,79,90};
		System.out.println(Arrays.toString(num));
		System.out.println("������Ҫ���ҵ�����");
		int input = sc.nextInt();
		int index = getIndex(num,input);
		if(index == -1) {
			System.out.println("û���ҵ�����");
		}else {
			System.out.println("����������Ϊ��"+index);
		}
		
	}
	/*�������в���ĳ������������
	 *  ���� arr
	 *  ���� num
	 *  û���ҵ� ���� -1
	 * 
	 * 
	 * 
	 * */
	public static int getIndex(int[] arr,int date) {
		int index = -1;
		for(int i = 0 ; i < arr.length ; i++) {
			if(date == arr[i]) {
				index = i;
				break;
			}
		}
		return index;//����δд���ʹ��return 0;�ȹ�ܴ���
	}
	

}
