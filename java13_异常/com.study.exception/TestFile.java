package com.study.exception;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		String filename = "xxx.png";
		upLoadFile(filename);//ģ���ϴ�ͼƬ
		
	}
				
	private static void upLoadFile(String filename) {
		String extension = filename.substring(filename.lastIndexOf(".")+1);
		if(!extension.equals("jpg")) {
			try {
				//�ֶ��׳��Զ����쳣  �����׳���throws
				throw new FileNameException("�ļ���չ��������.jpg");
			} catch (FileNameException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
			}
		}
		System.out.println("��������");
		//ģ�����������һ��ͬ���ļ�
		File file = new File(filename);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
}
