package com.study.exception;

import java.io.File;
import java.io.IOException;


public class TestThrows {
	public static void main(String[] args)  {
		f1();
		System.out.println("�����������");
	}
	public static void f1() {
		System.out.println("f1ִ��ĳ��ҵ��");
		try {
			File f1 = new File("F:/data.txt");
			f1.createNewFile();
			int result=10/0;
			System.out.println(result);
		} catch (IOException e) {//Exceptionд��ǰ���κ��쳣���ɲ��񣬺����޷�����
			//e.printStackTrace();
			//System.out.println(e.getMessage());//e.getMessage()�����쳣����ַ�����Ϣ
			System.out.println(e.toString());//e.toString();���ش˶�����쳣������ƣ�ð�źͿո񣬴˶����getMessage��Ϣ
		}catch(ArithmeticException e2){
			e2.printStackTrace();
		}catch(Exception e) {//ͨ��д���
			e.printStackTrace();//��ӡ�����ǰ�쳣����Ķ�zhaiʹ�ù켣��ʲô�ط������쳣
		}finally {
			System.out.println("����ִ�еĴ���");
		}
	}
	

}
