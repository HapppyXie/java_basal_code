import java.util.Scanner;

public class Task03 {
          public static void main(String[] args) {
       while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("�x����ܷ��շ�ʽ 1΢�� 2 ֧����");
			int select = sc.nextInt();//ݔ���x��
			if(select ==1) {//�p����̖ �O��
				System.out.println("΢��֪ͨ");
			}else if(select==2){
					System.out.println("֧����֪ͨ");
			}else{
				System.out.println("���ڸ�����ѡ��ѡ��");
			}//����if-else ��Ҫ��{}���Z��������
			System.out.println("�����^�m����");
			}
          }
}
			