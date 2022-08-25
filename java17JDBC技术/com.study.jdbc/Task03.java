package com.study.jdbc;

import java.sql.*;

public class Task03 {
	public static void main(String[] args) throws SQLException {
		Connection con;
		Statement stmt;
		String url="jdbc:mysql://localhost:3306/school";
		String account = "root";
		String password = "gduf123";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			
			con = DriverManager.getConnection(url,account,password);
			stmt = con.createStatement();
			//String sql = "insert into mystudent values(20250506108,'云净','女',21)";
			//加入数据
			//int i = stmt.executeUpdate(sql);
			//System.out.println(i);
			
			String sql="select * from mystudent";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String sex = rs.getString(3);
				int age = rs.getInt(4);
			System.out.println(id+"  "+name+"  "+sex+"  "+age);
			}
			//检索年龄大于等于20的学生信息
			System.out.println("-------------------------------------");
			sql = "select name from mystudent where age>=20";
			ResultSet res = stmt.executeQuery(sql);
			while(res.next()) {
				String name = res.getString("name");
				System.out.println(name);
			}
			
			stmt.close();
			con.close();
		} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		
		
	}
}
