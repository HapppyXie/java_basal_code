/**
 *  
 * Java�ж���������쳣�࣬ÿ���쳣�඼����һ�����д������а����˸����д������Ϣ�ʹ������ķ���������
 * 		ÿ��Java�������й����з���һ����ʶ������д���ʱ��ϵͳ�������һ����Ӧ�ĸ��쳣��Ķ��󣬼�����һ���쳣
 * 
 * 
 * Java�쳣���νṹ��							Object
 * 											Throwable
 * 					Error											Exception
 * 		AWTError  ThreadDeath ....				SQLException  ClassNotFoundException  .....    IOException   ....		RuntimeException
 * 																									ArithmeticException   NullPointException   NumberFormatException......
 * ˵����Error������Java������������׳��������޷�����
 * 		Exception�������Ӧ�ó�������׳�,�ɲ���
 * Throwable:Java.lang.Throwable������д���ĸ���
 * 
 * Error:�ǳ����صĴ�����Դ��Java�ײ㣬�޷���Error������д����������������
 * 
 * Exception:������ô���أ����б�Ҫ�Ĵ����ʩ��Ӱ��ϵͳ����������
 * 			RuntimeException: ArithmeticException,NullPointException,NumberFormatException,
 * 							  ArrayIndexOutOfBoundsException
 * 							  ����ʱ�쳣��δ��ȷ��飬������������Ա�����쳣
 * Exceptionֱ�����ࣺ ClassNotFoundException
 * 					IOException  �磺�����ļ�	
 * 					SQLException
 * 					RuntimeException��ֱ�����ࣺ�Ѽ���쳣(��ʹ���Ҳ�޷����⣬�����𻵣��ϵ�)���޷����⣬���봦��
 * 
 * 			δ����쳣 RuntimeExceptionֱ������ ������д�������Ա��ⷢ�����쳣
 * �쳣���� 	�Ѽ���쳣 Exception��ֱ������	���ɱ���ᷢ�����쳣��������д�����쳣		
 * 		
 * EOFException 		
 * EOF��ʾ�������ļ�β�� String str = dis.readUTF(); ���ͻ����Ѿ��Ͽ��������Ѿ�û�����ݿ��Զ��ˣ�
 *  
 */
 
public class Task02��ʶ�쳣����� {
	public static void main(String[] args) {
		System.out.println("����ʼ------------");
		//��ѧ�쳣
		int result = 10/3;//����Ϊ0
		System.out.println("result="+result);
		//��ָ���쳣
		String s = "hello";//String s = null
		System.out.println(s.length());
		//���ָ�ʽת���쳣
		String scount = "1234";//1234a
		int count = Integer.parseInt(scount);
		System.out.println("�����ǣ�"+count);
		System.out.println("�������н���----------");
		
		int score[] = new int[10];
		score[0]=99;
		score[9]=88;		//����Խ���쳣  score[10]=55;
	}


}
