package com.study.prj1;

import com.study.library.pojo.Reader;

public class Students {
	public static void main(String[] args) {
		Reader r1 = new Reader();
		System.out.println();   //r1.：无法调用Reader的非public成员
								//只能调用public修饰的
		
	}

}
