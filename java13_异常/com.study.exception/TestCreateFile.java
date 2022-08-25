package com.study.exception;

import java.io.File;
import java.io.IOException;

public class TestCreateFile {
	public static void main(String[] args) throws IOException  {
		//创建一个File对象
	try {
		File f = new File("F:date.txt");
		f.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}	

		//f.createNewFile();//throws IOException或 try,catch,
		//jdk默认使用该方法可能异常，必须进行异常处理，也可以对自己写的方法进行异常处理

}
}
