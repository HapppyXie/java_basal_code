package com.study.library.pojo;

public class Reader {
	private String readerId;
	private String readerName;
			String phone;
	protected int authority;
	
	
	
	public Reader() {
		super();

	}
	public Reader(String readerId, String readerName, String phone, int authority) {
		super();
		this.readerId = readerId;
		this.readerName = readerName;
		this.phone = phone;
		this.authority = authority;
	}
	
	public String getReaderId() {
		return readerId;
	}
	public void setReaderId(String readerId) {
		this.readerId = readerId;
	}
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", readerName=" + readerName + ", phone=" + phone + ", authority="
				+ authority + "]";
	}
	
	
	

}
