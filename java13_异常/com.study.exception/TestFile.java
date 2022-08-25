package com.study.exception;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		String filename = "xxx.png";
		upLoadFile(filename);//模拟上传图片
		
	}
				
	private static void upLoadFile(String filename) {
		String extension = filename.substring(filename.lastIndexOf(".")+1);
		if(!extension.equals("jpg")) {
			try {
				//手动抛出自定义异常  方法抛出文throws
				throw new FileNameException("文件扩展名必须是.jpg");
			} catch (FileNameException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
			}
		}
		System.out.println("程序还走吗？");
		//模你服务器创建一个同名文件
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
