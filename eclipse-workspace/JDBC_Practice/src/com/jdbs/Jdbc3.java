package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc3 {
	public static void main(String[] args) {
		//Driver Load
		
		try {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/kodnest";
			String userName="root";
			String password="Ramlal@123";
			Class.forName(driver);
			System.out.println("Successfully Driver Loaded");
			//Create Connection
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Successfull connection");
			//Create Statement
			Statement stmt= con.createStatement();
			System.out.println("succesfull Create Statement");
			//ExecuteQuery
			String query="Select*from batches";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()==true)
			{
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3));
			}
			System.out.println("Succesfully Fetching");
			rs.close();
			stmt.close();
			con.close();
			System.out.println("Successfully Close");
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
