package com.study.exception;

import java.io.File;
import java.io.IOException;

public class TestCreateFile {
	public static void main(String[] args) throws IOException  {
		//����һ��File����
	try {
		File f = new File("F:date.txt");
		f.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}	

		//f.createNewFile();//throws IOException�� try,catch,
		//jdkĬ��ʹ�ø÷��������쳣����������쳣����Ҳ���Զ��Լ�д�ķ��������쳣����

}
}
