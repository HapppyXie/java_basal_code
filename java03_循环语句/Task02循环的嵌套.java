/*ѭ����Ƕ��
 * for(;;){      for(;;){}   }
 * 
 * while(){             while(){}      }
 *  
 *  do{              do{}while()  }while()
 *  
 *  for(;;){        while(){}         }
 * 
 * ѭ��Ƕ�׹������ѭ��ÿһ��ѭ����Ҫִ��һ���������ڲ�ѭ��
 * һ��20���Ǻ� ��ӡʮ��     �����Ǻ�
 * 
 * */
public class Task02ѭ����Ƕ�� {
	public static void main(String[] args) {
		//���ѭ�� ������
		for(int line = 1 ; line <= 10; line++) {
			for(int i = 1 ; i <= 20 ; i++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	

}
