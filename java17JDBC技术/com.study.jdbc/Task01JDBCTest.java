package com.study.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class Task01JDBCTest{
		public static void main(String[] args) throws Exception{
			//1.��������jar��
			//2.��������
			//������Class.forName("com.mysql.cj.jdbc.Driver");��ȡָ������ֽ������
			//com.mysql.cj.jdbc�е�Driver��ľ�̬������������ new Driver()  �ⲽ���Բ�д
			Class.forName("com.mysql.cj.jdbc.Driver");
			//3.��������
			// ?���ֺ��洫�ݵĲ���  UseSSL=false��ѡ����ܴ��� &allowPublicKeyRetrieval=true&serverTimezone=UTC
	String url ="jdbc:mysql://localhost:3306/school?useSSL=false";
			String username = "root";
			String password = "gduf123";
			
			java.sql.Connection con = DriverManager.getConnection(url,username,password);
			//4.����sql��� update s set lie(�β�) = 'isi' where sno ='5'
			String sql = "insert into mystudent values(20250809206,'С��','Ů',18)";
			//5.��ȡִ��sql�Ķ���
			Statement stmt = con.createStatement();
			//6.ִ��sql
			int count = stmt.executeUpdate(sql);
			//7.������
			System.out.println(count);
			//8.�ͷ���Դ
			stmt.close();
			con.close();
		
		}
}
