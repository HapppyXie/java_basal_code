import java.util.Scanner;

//if-elseǶ��
//if(){        if(){    }else{    }else{  if(){}else{}        }


//if-else���֧Ƕ�� if(){�Z��K1}else if(){�Z��K2}else if(){�Z��K3}else{�Z��K4}
//��һ������ ������ȥ �����Д� ���� ������һ���Д� ��� ֻ����һ��
public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ո�x��֧����ʽ 1�����y�� 2�r�I�y�� "
				                      +"3�Ї��y�� 4���O�y�� "
			                       	  +"5�����y�� 6�]���y��"
				                     + "7֧���� 8΢�� ");
		int select = sc.nextInt();
		if(select == 1) {
			System.out.println("���й����y��֧������");
		}else if(select == 2) {
			System.out.println("�����r�I�y��֧������");
		}else if(select == 3) {
			System.out.println("�����Ї��y��֧������");
		}else if(select == 4) {
			System.out.println("���н��O�y��֧������");
		}else if(select == 5) {
			System.out.println("���������y��֧������");
		}else if(select == 6) {
			System.out.println("�����]���y��֧������");
		}else if(select == 7) {
			System.out.println("����֧����֧������");
		}else {
			System.out.println("����΢��֧������");
		}
		
	}

}
