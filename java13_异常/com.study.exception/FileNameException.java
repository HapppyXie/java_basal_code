package com.study.exception;
/*
 * �Զ����쳣�� ��ֱ�Ӽ̳�Exception��
 * 			JavaAPI�ṩ�������Ų���һ�����ܲ���ϵͳ�е����д���
 * 				   ��ʱ�ᴴ���û��Զ����쳣������ϵͳ����������
 * 		�����������ļ�ʱ�ļ���������Ҫ��ʱ�׳��쳣
 * 
 * �Զ����쳣���ܽ�:�Զ����쳣����Ҫ�̳�Exception���������
 * 	   �Զ����쳣��Ĺ��췽����Ҫ���ʸ���Ĺ��췽���Ա��ӡ��Ӧ���쳣��Ϣ
 * 	   �Զ����쳣��ͨ������һ���������ֶ��׳���throw�� ������дthrows�ڷ�������, Ҳ����try-catch����
 *	    
 *
 *�ܽ�throws��throw�ؼ���
 *		throws:throws�ڷ���ͷ���������׳��쳣��
 *			   Ӧ�ã����η� ����ֵ���� ������ (��ʽ����) throws �쳣��{		������}
 *			   ˵�����Է��������߽�����ʾ˵�����ڵ��ø÷���ʱ��Ҫ������Щ�쳣
 *		throw: throw�ڷ��������������׳��쳣�����
 *				Ӧ�ã�TestFile
 *				˵����ͨ����ĳ���������׳��쳣�����
 *
 *
 *
 * */

		//�˴��ȶ���:�Զ����쳣�� ,����д�������췽�������ø��෽��
public class FileNameException extends Exception{
	
		public FileNameException() {
			super();
		}
		//ָ����Ϣ
		public FileNameException(String message) {
			super(message);
		}
		//ָ����Ϣ��ԭ��
		public FileNameException(String message,Throwable cause) {
			super(message,cause);
		}
		//TestFile
}
