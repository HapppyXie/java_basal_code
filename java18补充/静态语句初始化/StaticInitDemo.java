package ��̬����ʼ��;
/*
 * ���ָ�ʽ��ʼ����̬����
 * */
public class StaticInitDemo {
	static int i = 0;
	static int x;
	static {
		x = 0;
		System.out.println("static code:"+i++);  
		//++,--��ǰ׺��������ֵ�ͱ��ʽ��ֵ���ı�
	    //	    ��׺��������ֵ�ı䣬���ʽ��ֵ����
	}

}
