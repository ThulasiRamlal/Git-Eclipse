package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc12 {
	public static void main(String[] args) {
		try
		{
		
		//Register the Driver Manager Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest2", "root", "Ramlal@123");
		System.out.println("Connection is Succesfully");
		
		// Create Prepared Statement
		int rollNo=4;
		String batch="juneA2";
		int strength=250;
		String sql="insert into kodnest2 values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, rollNo);
		pstmt.setString(2, batch);
		pstmt.setInt(3, strength);
		System.out.println("Preapred Statment Succesfully");
		int nr=pstmt.executeUpdate();
		System.out.println(nr+" Rows Affected");
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
