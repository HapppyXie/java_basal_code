package lambda表达式;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Task01 {
	public static void main(String[] args) {
		
		//使用匿名类
		File myDir = new File("D:\\作业+事情\\英语");
		//listFiles需要FileFilter作为构造参数，避免IO异常
		//返回的是数组，用数组接收		
		File[] files = myDir.listFiles(
			//FileFilter为接口
				new FileFilter() {
	//accept 测试指定的抽象路径名是否应包含在路径名列表中。true则创建FileFilter对象，传给listFiles
			public boolean accept(File f) {return (f.isFile());}
				}
				);
		System.out.println(Arrays.toString(files));
					
		
		
		//使用lambda表达式
		File mydir = new File("D:\\作业+事情\\英语");
		//listFiles 返回目录下的文件
		File[] files1 = mydir.listFiles(
			(File f)->{return f.isFile();}
			);
		System.out.println(Arrays.toString(files));
		
		
		File dir = new File("D:\\作业+事情\\英语");
		//也有无参构造
		File[] files2 = dir.listFiles();
		System.out.println(Arrays.toString(files2));
		
		//int result = 
		
				
	}		
	
}
