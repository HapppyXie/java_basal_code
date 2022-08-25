package com.study.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class Task01JDBCTest{
		public static void main(String[] args) throws Exception{
			//1.导入驱动jar包
			//2.加载驱动
			//但本身Class.forName("com.mysql.cj.jdbc.Driver");获取指定类的字节码对象
			//com.mysql.cj.jdbc中的Driver类的静态代码块加载驱动 new Driver()  这步可以不写
			Class.forName("com.mysql.cj.jdbc.Driver");
			//3.建立连接
			// ?区分后面传递的参数  UseSSL=false不选择加密传输 &allowPublicKeyRetrieval=true&serverTimezone=UTC
	String url ="jdbc:mysql://localhost:3306/school?useSSL=false";
			String username = "root";
			String password = "gduf123";
			
			java.sql.Connection con = DriverManager.getConnection(url,username,password);
			//4.定义sql语句 update s set lie(形参) = 'isi' where sno ='5'
			String sql = "insert into mystudent values(20250809206,'小红','女',18)";
			//5.获取执行sql的对象
			Statement stmt = con.createStatement();
			//6.执行sql
			int count = stmt.executeUpdate(sql);
			//7.处理结果
			System.out.println(count);
			//8.释放资源
			stmt.close();
			con.close();
		
		}
}
