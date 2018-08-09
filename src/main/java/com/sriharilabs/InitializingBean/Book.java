package com.sriharilabs.InitializingBean;

import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean {
	private String bookName;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
		System.out.println("GSHP...Book...setBookName---Inside setBookName---");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("GSHP...Book---afterPropertiesSet---");
		bookName = bookName + "-Hello";
	}
}
