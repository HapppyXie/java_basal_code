package com.study.stream�ֽ�;

import java.io.BufferedInputStream;
/*
 * �ֽڻ�����
 */
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
//��������һ���죬��Դ��ļ����ڲ�Ĭ��һ��8���ֽ�
public class Task05�ֽڻ�����TestBufferedInputStream {
	public static void main(String[] args) {
		try {
			//�������������
			FileInputStream fin = new FileInputStream("C:\\Users\\mike\\Pictures\\����������ֽ\\Сè.jpg");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\mike\\Desktop\\èè.jpg");
			//�����ֽ�������������
			BufferedInputStream bufin = new BufferedInputStream(fin);
			BufferedOutputStream bufout = new BufferedOutputStream(fout);
			//ѭ����д
			int length = 0; //
			while((length = bufin.read())!=-1) {
				bufout.write(length);
			}
			//�ر���
			bufin.close();
			bufout.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
