package com.jdbcPracticeFeburary2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateJDBC {
	
	public static void main(String[] args) {
		
		Connection con=null;
		 String url = "jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="Ramlal@123";
		Statement st=null;
		ResultSet rs=null;
		String sql="select*from student";
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Succefulyy registered Driver...");
		con=DriverManager.getConnection(url, user, password);
		System.out.println("Succefully established connection...");
		
	     st=con.createStatement();
	     
	     rs=st.executeQuery(sql);
	     System.out.println("Id | Name | Maths | Physics | chemistry");
	     while(rs.next()==true)
	     {
	    	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
	     }
	     
	     
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
