package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc14 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		Scanner scan=new Scanner(System.in);
		try
		{
		
		//Register Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create Connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest2", "root", "Ramlal@123");
		//Create Statement
		 st=con.createStatement();
		 //Create Preapred Statement
		 String query="delete from kodnest2 where ??";
		 pstmt=con.prepareStatement(query);
		
		 System.out.println("Enter new Batch and Roll");
		 String batches=scan.next();
		 int roll=scan.nextInt();
		 pstmt.setString(1, batches);
		 pstmt.setInt(2, roll);
		 int rows=pstmt.executeUpdate();
		 System.out.println(rows+" rows effected");
		  
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
