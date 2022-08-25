package com.study.highlevel;
import java.sql.*;

public class PreparedTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/test?useSSL=false";
		String account="root";
		String password="gduf123";
		Connection con;
		Statement stmt;
		String name;
		int sale;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,account,password);
			stmt = con.createStatement();
			showValues(stmt,"原始数据");
			
			String updateString = "update coffees set sales = ? where cof_name = ?";
			PreparedStatement updateSales = con.prepareStatement(updateString);
			
			int [] salesForWeek = {150,140,50,145,85};
			String [] coffees = {"Colombian","French_Roast","Espresso",
								"Colombian_Decaf","French_Roast_Decaf"};
			
			for(int i=0; i< coffees.length;i++) {
				updateSales.setInt(1, salesForWeek[i]);
				updateSales.setString(2, coffees[i]);
				updateSales.executeUpdate();
			}
			System.out.println();
			showValues(stmt,"更新后数据:");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void showValues(Statement stmt,String s)throws SQLException{
		String name;
		int sale;
		ResultSet rs = stmt.executeQuery("select cof_name,sales from coffees");
		System.out.println(s);
		while(rs.next()) {
			name = rs.getString(1);
			sale = rs.getInt(2);
			System.out.println("cof_name ="+name+"   sale="+sale);
		}
	}
}
