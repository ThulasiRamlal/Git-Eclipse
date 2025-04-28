package com.jdbcPracticeFeburary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcRead1 {
	
	public static void main(String[] args) {
		
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="Ramlal@123";
		
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
		//Register The Driver
		Class.forName(path);
		System.out.println("Succefully registered Driver Class..");
		//Establishing Connection
		con=DriverManager.getConnection(url, user, password);
		System.out.println("Succefully establishing Connection....");
		//Create Statement
		stmt=con.createStatement();
		//ExecuteQuery
		String sql="select*from jdbc";
		rs=stmt.executeQuery(sql);
		System.out.println("   ID   |   Name   |   Maths   |   physics   |   chemistry   ");
		while(rs.next()==true)
		{
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3)+" | "+rs.getInt(4)+" | "+rs.getInt(5));
		}
		System.out.println("Succefully fetched.....");
	
		
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
			stmt.close();
			rs.close();
			System.out.println("Succefully Close COnnection...");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

}
	}
