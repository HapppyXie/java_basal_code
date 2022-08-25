package com.study.service;

import com.study.prj1.Book;//包名.类名

public interface BookService {
	//如果在同一个包中，没有Book类，会报错;但可引入
	public void SaveBook(Book book);
	

}
