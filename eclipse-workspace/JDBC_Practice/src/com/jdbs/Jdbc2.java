package com.jdbs;
import java.sql.*;

public class Jdbc2 {
	public static void main(String[] args) {
		
		try 
		{
			System.out.println("JDBC Connection Established");
		String driver="com.mysql.jdbc.Driver";
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="Ramlal@123";
		
		//insert or delete both are same process but its depending qureies
		String query="delete from student where id=1";
		
		Class.forName(driver);	
		System.out.println("Driver succesfull");
		
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("Connection Established");
		
		Statement st=con.createStatement();
		System.out.println("Statement Create Succesfull");
		
		int rows=st.executeUpdate(query);
		System.out.println(rows);
		
		
		con.close();
		System.out.println("JDBC Connection Terminated");
		
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
