import java.util.Scanner;

/*
 * ����ʵ�����򣬽���
 * 
 * */
public class Task01����ʵ������ {
	public static void main(String[] args) {
		int [] num = {87,68,94,85,59,33,83,75,82,52};
		//��ӡ��ʼ����
		printArray(num);
		System.out.println();
		System.out.println("-------------------");
		System.out.println("��ѡ�����򷽷���");
		System.out.println("1.����2.����.3�˳�ϵͳ");
		Scanner sc = new Scanner(System.in);
		 int method = sc.nextInt();
		 if(method == 1) {
			 f1(num);
		 }else if(method == 2) {
			 f2(num);
		 }else if(method == 3) {
			 System.out.println("�˳�ϵͳ");
		 }else {
			 System.out.println("�޷�ʶ��ѡ�����������");
		 }
		 
 
	}
	
	
	
	
	
	//�������򷽷�  �˴�����
	public static void f1(int [] arr) {
		int [] num = {87,68,94,85,59,33,83,75,82,52};
		int temp = 0;
		for(int j = 0 ; j < num.length-1 ; j++) {
			for(int g = 0 ; g < num.length-1-j ; g++) {
				if(num[g] > num[g+1]) {
					temp = num[g];
					num[g] = num [g+1];
					num[g+1] = temp;
				
				}
			}
		}
		for(int h = 0 ; h < num.length ; h++) {
			System.out.print(num[h] + " ");
		}
	}
	
	//�˴�Ϊ����
	public static void f2(int [] arr) {
		int temp = 0;
		for(int j = 0 ; j < arr.length-1 ; j++) {
			for(int g = 0 ; g < arr.length-1-j ; g++) {
				if(arr[g] < arr[g+1]) {
				   temp = arr[g+1];
				   arr[g+1] = arr[g];
				   arr[g] = temp;
				}
			}
		}
		//for(int h = 0 ; h < num.length ; h++) {
		//	System.out.print(num[h] + " ");
	//}   �˴����ô�ӡ����
		printArray(arr);
	
	
	}
	
	//����һ����ӡ����ķ���
	public static void printArray(int [] arr) {
			
			for(int h = 0 ; h < arr.length ; h++) {
			System.out.print(arr [h] + " ");
	}
	
	
	
	
	}
	}
