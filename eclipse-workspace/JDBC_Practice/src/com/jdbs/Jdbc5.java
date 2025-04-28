package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc5 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/kodnest";
		String user="root";
		String password="Ramlal@123";
		
		try {
			//Register The Diver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create Connection
			con=DriverManager.getConnection(url, user, password);
			
			//Create Preapared Statement
			String sql="delete from batches where Sno=?";
			pstmt=con.prepareStatement(sql);
			System.out.println("Enter Batch id to the delete The record");
			int Sno=scan.nextInt();
			pstmt.setInt(1, Sno);
			//Execute
			int nora=pstmt.executeUpdate();
			System.out.println("Executed Query");
			System.out.println(nora+" rows Deleted");
		} 
		catch (Exception e) {
		
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
