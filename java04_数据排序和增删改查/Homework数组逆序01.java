import java.util.Scanner;

/*
 * ����Ԫ������  ����˼�룺ͨ�����������н���
 * 
 * 
 * */
public class Homework��������01 {
	public static void main(String[] args) {
		System.out.println("������10������");
		int [] num = new int[10];
		Scanner sc = new Scanner(System.in);
		//�����ʼ����
		for(int i = 0; i < num.length; i++) {
			System.out.println("�������"+(i+1)+"������");
			num [i] = sc.nextInt();
		}
		//��ӡ��ʼ����
        for(int t = 0; t < num.length; t++) {
        	System.out.print(num[t]+" ");
        }
        //����
        System.out.println();
        System.out.println("-----------");
        // ������0������length-1   ��0-num��length-1
        int temp = 0;
         for(int j = 0 ; j < num.length/2 ; j++) {
        	 temp = num[j];
        	 num[j] = num[num.length-j-1];
        	 num[num.length-j-1] = temp;
         }
         //��ӡ��������
         for(int k = 0 ; k < num.length ; k++) {
        	 System.out.print(num[k]+" ");
         }
         
	}

}
