import java.util.Scanner;

//�΄�1//����ݔ��ɂ����ĺͲ�e��
public class homework2 {
     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           //1ݔ�딵��
           System.out.println("Ոݔ��ɂ�����");
           double num1 = sc.nextDouble();
           double num2 = sc.nextDouble();
           //2�\��
			double sum = num1 + num2;
			double difference = num1 - num2;
			double product = num1 * num2;
			double quotient = num1 / num2;
			//3ݔ���Y��
			System.out.println("�ͣ�"+ sum);
			System.out.println("�"+ difference);
			System.out.println("�e��"+ product);
			System.out.println("�̣�"+ quotient);
				 
				 
	}
}
