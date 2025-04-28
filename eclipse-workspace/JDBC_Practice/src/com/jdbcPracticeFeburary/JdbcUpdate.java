package com.jdbcPracticeFeburary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcUpdate {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="Ramlal@123";
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner scan=new Scanner(System.in);
		String sql="update jdbc set name=?,maths=?,physics=?,chem=? where id=?";
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url, user, password);
		pstmt=con.prepareStatement(sql);
		System.out.println("Enter Name for Update...");
		
		String name=scan.next();
		System.out.println("Enter maths..");
		int maths=scan.nextInt();
		System.out.println("Enter Physics..");
		int physics=scan.nextInt();
		System.out.println("Enter chemistry.. ");
		int chem=scan.nextInt();
		System.out.println("Enter ID for which row U want UPDATE... ");
		int id=scan.nextInt();
		pstmt.setString(1, name);
		pstmt.setInt(2, maths);
		pstmt.setInt(3, physics);
		pstmt.setInt(4, chem);
		pstmt.setInt(5, id);
		
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
