/*��ӡ��100-200֮�������������ÿ5������
 * ���ѭ��  ��ֵ int num 100   ����  num <= 200 
 * ѭ�����: �ж�num�Ƿ�Ϊ���� 
 *          ��ӡ���� 
 *          ÿ5������
 * 
 * 
 * 
 * */
public class Homework2 {
	public static void main(String[] args) {
		int count = 0;
	  for(int num = 100 ; num <= 200 ; num++) {
		  for(int i = 2 ; i < num ; i++) {
			  //�ж�num�ǲ�������,
	 //�˳������©��,��ѭ��ÿ��ȡ���������ȱ�2��,��������Ա�2���������,�����˱�5��6�ȵ�
			         if(num % i != 0) {  			
			        		 System.out.print(num + " ");   
				               count++; 
				               if(count % 5 == 0) {
				            	   System.out.println();				            
			        	}     
			             }
			break;
		}
	  }
	}
}

