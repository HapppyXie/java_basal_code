import java.util.Scanner;


//switch ʵ�ֳɼ��ȼ��ж�
// 
public class Task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		int score = sc.nextInt();
		//��������ת��Ϊȷ����ֵ
		//97 / 10   9  96 / 10  9
		switch(score / 10) {
		case 10://case 10:��û����� ִ����һ��case�����
		case 9: //��һ������û��break ����ִ�� ֪����break���
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("C");
			break;
		case 5:
			System.out.println("D");
			break;
		default: //default����˳���޹� ������û�ж�Ӧ��case���ִ��
			System.out.println("E");
		}
		
	}

}
