import java.util.Scanner;

//switch�Z�� switch(�Д���_ʽ){
//           case ����1:  �Z��1;break;�жϱ��ʽ==����1 ִ�����1
//           case ����2:  �Z��2;break;
//          ......
//           default:��ǰ�涼����� ִ��Ĭ�����   �Z��n;}
public class Task06 {
	public static void main(String[] args) {
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ո�x��֧����ʽ 1�����y�� 2�r�I�y�� "
             +"3�Ї��y�� 4���O�y�� "
             	  +"5�����y�� 6�]���y��"
               + "7֧���� 8΢�� ");
	
           int select = sc.nextInt();
           switch(select) {
           case 1:
   			System.out.println("���й����y��֧������");
             break;
           case 2:
   			System.out.println("�����r�I�y��֧������");
             break;
           case 3:
   			System.out.println("�����Ї��y��֧������");
             break;
           case 4:
   			System.out.println("���н��O�y��֧������");
        	 break;
           case 5:
   			System.out.println("���������y��֧������");
             break;
           case 6:
   			System.out.println("�����]���y��֧������");
             break;
           case 7:
   			System.out.println("����֧����֧������");
            break;
           default:
   			System.out.println("����΢��֧������");
            break;
        	 
           }
	}
	}

}
