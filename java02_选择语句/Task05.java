import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ոݔ��ɿ���");
		System.out.println("�ɼ�����0-100֮��");
		int score = sc.nextInt();
		if(100 >= score && score >= 90) {
			System.out.println("A");
			System.out.println("��ţ�ƣ�");
		}else if(score >= 80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else if(score >= 0){
			System.out.println("E");
			System.out.println("�������Ծ�мҳ�ǩ��");
		}else {
			System.out.println("����ɼ������Ͽ��Կ�Ŀ�涨");
			System.out.println("����������");
		}
		
	}
	}

}
