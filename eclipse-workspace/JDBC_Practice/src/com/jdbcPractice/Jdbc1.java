package com.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc1 {
	public static void main(String[] args) {
		//delete
		String url="jdbc:mysql://localhost:3306/kaveri";
		String user="root";
		String password="Ramlal@123";
		String sql="Select*from kaveri";
		try
		{
	//Register The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Succefully Completed");
		//Create Connection
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("Successfully Connection to the database");
		//create Statement
		Statement stmt=con.createStatement();
		System.out.println("Succefully  Create Statement");
		//Create Result Set

		ResultSet rs=stmt.executeQuery(sql);
		System.out.println(" Id|Name|Maths|Physics|Chemstry");
		while(rs.next()==true)
		{
			
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)
			+" | "+rs.getInt(3)+" | "+rs.getInt(4)+" | "+rs.getInt(5));
		}
		
		rs.close();
		stmt.close();
		con.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
