package com.jdbs;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

public class Jdbc1 {
	public static void main(String[] args) {
		
		try
		{
			String url="jdbc:mysql://localhost:3306/class";
			String user="root";
			String password="Ramlal@123";
			String query="select*from course";
			//Register the Driver
		Class.forName("com.mysql.jdbc.Driver");
		//Get the Connection
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("Succesfully");
		
		
		//Create the Statement
		Statement st=con.createStatement();
		System.out.println("Create statement succesfull");
		
		//Execute query
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println("cid: "+rs.getString(1));
			System.out.println("c_name: "+rs.getString(2));
			System.out.println("c_decription: "+rs.getString(3));
		}
		
		System.out.println("Updation succesfull");
		
		//Connection close
		con.close();
		System.out.println("connection close succefull");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
