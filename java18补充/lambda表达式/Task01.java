package lambda���ʽ;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Task01 {
	public static void main(String[] args) {
		
		//ʹ��������
		File myDir = new File("D:\\��ҵ+����\\Ӣ��");
		//listFiles��ҪFileFilter��Ϊ�������������IO�쳣
		//���ص������飬���������		
		File[] files = myDir.listFiles(
			//FileFilterΪ�ӿ�
				new FileFilter() {
	//accept ����ָ���ĳ���·�����Ƿ�Ӧ������·�����б��С�true�򴴽�FileFilter���󣬴���listFiles
			public boolean accept(File f) {return (f.isFile());}
				}
				);
		System.out.println(Arrays.toString(files));
					
		
		
		//ʹ��lambda���ʽ
		File mydir = new File("D:\\��ҵ+����\\Ӣ��");
		//listFiles ����Ŀ¼�µ��ļ�
		File[] files1 = mydir.listFiles(
			(File f)->{return f.isFile();}
			);
		System.out.println(Arrays.toString(files));
		
		
		File dir = new File("D:\\��ҵ+����\\Ӣ��");
		//Ҳ���޲ι���
		File[] files2 = dir.listFiles();
		System.out.println(Arrays.toString(files2));
		
		//int result = 
		
				
	}		
	
}
