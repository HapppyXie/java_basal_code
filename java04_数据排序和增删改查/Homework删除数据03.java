import java.util.Scanner;

/*  ɾ�������е�һ�������ٰ����±�˳���ӡ����
 *  ԭ���ݣ�3,6,9,12,34,56
 *  ɾ������Ϊ2����
 *  ������Ϊ3��6��12��34,56
 *  
 *  �ж���һ��Ԫ�� index���±꣩
 *  1.  index == 5 ɾ�����һ��Ԫ�� ����Ҫ�ƶ�
 *  2.  index < 5 ��Ҫ�ƶ�
 *   ��ֵ i = index
 *   ���� i <= num.length-2
 *   �ظ��Ĳ��� num[i] = num[i+1]
 *   
 * */
public class Homeworkɾ������03 {
	public static void main(String[] args) {
		int [] num = {3,6,9,12,34,56};
		System.out.println("��ʼ���ݣ�");
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("------------------");
		//ɾ��һ������=������������ǰ�ߣ����串�� num[i] = num [i+1]
		// ���ǵ�num[num.length-2]=num[num.length-1] ����; 
		// �����num[num.length-1]=0 
		
		System.out.println("����ɾ�����±�");
		//��ӡ����ɾ����С��
		for(int l = 0 ;l <num.length ; l++) {
			System.out.print(l+"  ");
		}
		System.out.println();
		System.out.println("------------------");
		
		
		
		
		 Scanner sc = new Scanner(System.in);
		 //ɾ��Ԫ��
		 System.out.println("������Ҫɾ��Ԫ�ص�������");
		 int index = sc.nextInt();
		  if(index == num.length-1) {
			  num[num.length-1] = 0;
		  }else {
			  for(int k = index ; k < num.length-1 ; k++) {
				  num[k] = num[k+1];
			  }
			  num[num.length-1] = 0;
		  }
		 //ɾ�������������
		  System.out.println("----------------");
		  for(int y = 0 ; y < num.length ; y++) {
			  System.out.print(num[y]+" ");
		  }
	       
		 
	}

}
