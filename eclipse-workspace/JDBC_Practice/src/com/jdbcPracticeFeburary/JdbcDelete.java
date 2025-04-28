package com.jdbcPracticeFeburary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDelete {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner scan=new Scanner(System.in);
		
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="Ramlal@123";
		String sql="delete from jdbc where id=?";
		
		try
		{
		Class.forName(path);
		con=DriverManager.getConnection(url, user, password);
		pstmt=con.prepareStatement(sql);
		
		System.out.println("Enter Id for Delete Entire row..");
		int id=scan.nextInt();
		pstmt.setInt(1, id);
		
		int nora=pstmt.executeUpdate();
		System.out.println(nora+" Rows Affected.....");
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
			con.close();
			pstmt.close();
			scan.close();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
