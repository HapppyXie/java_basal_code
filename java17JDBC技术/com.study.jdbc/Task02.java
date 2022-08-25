package com.study.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



/*
 * 	������MySQL���������jvm���Զ�������������ص�DriverManager���У�
 * 	��ʱ��ͨ��DriverManager����з������������ݿ�
 * */
public class Task02 {
	public static void main(String[] args) throws Exception {
		//��������
		Class.forName("com.mysql.cj.jdbc.Driver");
		//�������ݿ�����
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/school","root","gduf123");
		//ִ��sql
		String s = "select * from mystudent;";
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(s);
		//��������
		
		while(result.next()) {
			String id = result.getString(1);
			String name = result.getString(2);
			String sex = result.getString(3);
			int age = result.getInt(4);
			System.out.println(id+" "+name+" "+sex+" "+age);
			System.out.println("---------------------");
		}
		
		String sql1 = "select id from mystudent";
		ResultSet result1 = stmt.executeQuery(sql1);
		while(result1.next()) {
			String id1 = result1.getString(1);
			System.out.println(id1);
			System.out.println("-------------");
		}
		
//		String sql2 = "insert into mystudent(id,name,sex,age) values('20250809207','�����','��',20)";
//		int result2 = stmt.executeUpdate(sql2);
//		System.out.println(result2);
		
		
		stmt.close();
		con.close();
		
	}
}
