package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc11 {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try
		{
		//Register Driver Manager
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Succesfully Registerd");
		
		//Create connection
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest2", "root", "Ramlal@123");
		System.out.println("Connection is Succesfully ");
		
		//Create Statement
		 stmt=con.createStatement();
		
		//Execute query
	    rs=stmt.executeQuery("select*from kodnest2 ");
		System.out.println("Roll  ||  batches  ||  Strength");
		while(rs.next()==true)
		{
			System.out.println(rs.getInt(1)+"  ||  "+rs.getString(2)+"  ||  "+rs.getInt(3));
		}
		
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
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
