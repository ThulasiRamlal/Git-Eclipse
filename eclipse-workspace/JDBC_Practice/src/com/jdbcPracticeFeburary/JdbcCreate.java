package com.jdbcPracticeFeburary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcCreate {
	public static void main(String[] args) {
		
		
		
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="Ramlal@123";
		
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner scan=new Scanner(System.in);
		String sql="insert into jdbc values (?,?,?,?,?)";
		
		
		
		try
		{
		Class.forName(path);
		con=DriverManager.getConnection(url, user, password);
		pstmt=con.prepareStatement(sql);
		//System.out.println("Enter 1.ID  2.Name  3.MathsMarks  4.PhysicsMarks  5.ChemistryMarks");
		System.out.println("Enter ID..");
		int id=scan.nextInt();
		System.out.println("Enter Name...");
		String name=scan.next();
		System.out.println("Enter Maths...");
		int maths=scan.nextInt();
		System.out.println("Enter Physics..");
		int physics=scan.nextInt();
		System.out.println("Enter Chemistry....");
		int chemistry=scan.nextInt();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, maths);
		pstmt.setInt(4, physics);
		pstmt.setInt(5, chemistry);
		
		int nora=pstmt.executeUpdate();
		
		System.out.println(nora+"Row Affected....");
		
		
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
