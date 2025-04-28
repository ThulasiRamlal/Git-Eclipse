package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc4 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner scan=new Scanner(System.in);
		//Register The Driver Manager
		try {
			
			String url="jdbc:mysql://localhost:3306/kodnest";
			String user="root";
			String password="Ramlal@123";
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Succesfully register");
			
			//Create connection
			
		con=DriverManager.getConnection(url, user, password);
		System.out.println("Connection successfully");
		
		//Creating Prepared Statement
		String sql="insert into batches values(?,?,?)";
		pstmt=con.prepareStatement(sql);
		System.out.println("Prepared statement successfully");
		System.out.println("Enter ID,BATCH NAME, STRENTH");
		int id=scan.nextInt();
		String batches=scan.next();
		int strength=scan.nextInt();
		
		pstmt.setInt(1, 5);
		pstmt.setString(2, batches);
		pstmt.setInt(3, strength);
		
		//Query Updated
		int nora=pstmt.executeUpdate();
		System.out.println("Query Executed");
		//Display Output
		System.out.println(nora+" rows Affected");
			
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
