/*continue
 * while(...){..... .... continue������һ��ѭ�� .....}
 *         ��˼Ϊ continueǰ�����ִ�� continue����Ĵ��벻ִ�� ����ȥ�жϣ���
 * 
 * ��ӡ1-10֮��������ٴ�ӡ������ƽ���ͣ����������5��Ҫ��ӡ
 *  ctrl+/ ע��
 * */
public class Task03ѭ����continue {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 10 ; i++) {
			if(i == 5) { continue;}
			//i==5ʱcontinueʡ���˺���Ĵ��룬�����´�ѭ��
			//���ȱ��5��25
            System.out.println(i + "," + i * i);	
           		}

		
	}

}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 