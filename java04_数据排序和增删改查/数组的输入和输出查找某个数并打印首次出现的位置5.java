import java.util.Scanner;

/*
 * 
 * 
 * 
 * */
public class �����������������ĳ��������ӡ�״γ��ֵ�λ��5 {
	public static void main(String[] args) {
		int [] num = {55,45,87,65,12,36,78,45,65};//ע�� �˴��������ظ� ֻҪ��һ������
		for(int i  = 0 ; i < num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("������Ҫ���ҵ���");
		Scanner sc = new Scanner(System.in);
		int serach = sc.nextInt();
		int index = -1;
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i] == serach) {
				  index = i;
				  break;
			}
		}
		System.out.println("["+ index+"]"); //ע��Ϊ��ӡλ�ã�����������
	}

}
