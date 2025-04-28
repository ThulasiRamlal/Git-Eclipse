package com.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc2 {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Scanner scan=new Scanner(System.in);
		PreparedStatement pstmt=null;
		String url="jdbc:mysql://localhost:3306/kaveri";
		String user="root";
		String password="Ramlal@123";
		String sql="delete from kaveri where id=?";
		try
		{
		//register he Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Create Connection
		con=DriverManager.getConnection(url, user, password);
		System.out.println("Succesfully Connected");
		//Create Statement
		pstmt=con.prepareStatement(sql);
		System.out.println("Enter Id Which Row U Want delete..");
		int id=scan.nextInt();
		pstmt.setInt(1, id);
		int nora=pstmt.executeUpdate();
		System.out.println("Rows Effected: "+nora);
		pstmt.close();
		con.close();
		scan.close();
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
