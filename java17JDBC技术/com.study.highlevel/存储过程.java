package com.study.highlevel;
import java.sql.*;

public class 存储过程 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/test?useSSL=false";
		String account = "root";
		String password="gduf123";
		Connection con;
		Statement stmt;
		
		String sup_name;
		String cof_name;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,account,password);
			stmt = con.createStatement();
			
//			String createProcedure = "create procedure SUPPLIERS() begin select suppliers.sup_id,coffees.cof_name from suppliers,coffees where suppliers.sup_id=coffees.sup_id order by sup_name; end";
//			
//			stmt.executeUpdate(createProcedure);//存储过程创建到mysql数据库中，创建后调用即可

			CallableStatement cs = con.prepareCall("{call SUPPLIERS}");
			ResultSet rs = cs.executeQuery();
			
			System.out.println("sup_name-------------------cof_name");
			while(rs.next()) {
			sup_name = rs.getString(1);
			cof_name = rs.getString(2);
			System.out.println("sup_name: "+sup_name+"      cof_name: "+cof_name);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
