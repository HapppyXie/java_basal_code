
/*
 * ��ӡ쳲�������ǰ50����ÿ10������
 * 1 1 2 3 5 8 13 21......������������ǰ�������ĺ�
 * 
 * 
 * 
 * */
public class Taskѭ����ϰ3 {
	public static void main(String[] args) {
		long f1 = 1;   //������ָ�ֵ ���ݳ�����int�����ݷ�Χ
		long f2 = 1;
		System.out.print(f1 + "," + f2+",");//�������+"," ȥ��ln ��ӡ��ɺ���
		long f3 = 0;
		int count = 2;
		 while(count <= 50) {
			 f3 = f1 + f2;
			 System.out.print(f3+",");			 
			 count++;
			 if(count % 10 == 0) {
				 System.out.println();//��ӡ�ַ���()Ϊ�ռ��ǻ���
			 }        
			 f1 = f2;
			 f2 = f3;        
		 }
		 System.out.println();
		 System.out.println("------------------");
		 //��ӡ쳲�������ǰ50����ÿ10������
		//1 1 2 3 5 8 13 21......������������ǰ�������ĺ�
          long l1 = 1;
          long l2 = 1;
          long l3 = 0;
          System.out.print(l1 + "," + l2 + ",");
		 
          for(int i = 2 ; i <= 50 ; ) {
        	  l3 = l1+l2;
        	  System.out.print(l3+",");
        	  i++;
        	  l1=l2;
        	  l2=l3;
        	  if(i%10==0) {//ŵi++д��()�У���Ϊ��������жϣ���i++
        		           //������ ����� i++ ���ж� �ᵼ��1����11����
        		  System.out.println();
        	  }
          }
		 
		}
	}


