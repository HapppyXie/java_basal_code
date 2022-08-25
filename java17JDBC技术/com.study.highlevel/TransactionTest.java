package com.study.highlevel;
import java.sql.*;

//����Public Key Retrieval is not allowed�쳣ʱ
//��url�м���allowPublicKeyRetrieval=true ����ʹ�ù�����Կ�������ݿ�


public class TransactionTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true";
		String account="root";
		String password="gduf123";
		
		Connection con = null;
		PreparedStatement updateSales;
		PreparedStatement updateTotal;
		Statement stmt;
		
		String updateString = "update coffees set sales=? where cof_name=?";
		String updateStatement = "update coffees set total? where cof_name=?";
		String query="select cof_name,sales,total from coffees";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,account,password);
			updateSales = con.prepareStatement(updateString);
			updateTotal = con.prepareStatement(updateStatement);
			int [] salesForWeek = {175,150,60,155,90};
			String [] coffees = {"Colombian","French_Roast","Espresso","Colombian_Decaf",
								"French_Roast_Decaf"};
			int [] total = {45,98,55,36,150};
			
			con.setAutoCommit(false);//�ر������Զ��ύ
			
			//ÿ��ѭ����Ϊһ�ε���������
			for(int i =0; i<coffees.length; i++) {
				updateSales.setInt(1, salesForWeek[i]);
				updateSales.setString(2, coffees[i]);
				updateSales.executeUpdate();
				
				updateTotal.setInt(1,total[i]);
				updateTotal.setString(2,coffees[i]);
				con.commit();
			}
			
			con.setAutoCommit(true);
			updateSales.close();
			updateTotal.close();
			
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String cof_name = rs.getString(1);
				int sales = rs.getInt(2);
				int t = rs.getInt(3);
				System.out.println("cof_name: "+cof_name+" sales: "+sales+" total: "+t);
			}
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(con != null) {//˵���ѽ��������ҳ����쳣��ع�����
				try {
					System.err.println("Tranaction is being rolled back");
					con.rollback();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
