package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc13 {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pstmt=null;
	Scanner scan=new Scanner(System.in);
	try
	{
	//Register Driver Manager
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Create Connection
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest2", "root", "Ramlal@123");
	
	//Create PreparedStatement
	String sql="insert into kodnest2 values(?,?,?)";
    pstmt=con.prepareStatement(sql);
    System.out.println("Enter Values Roll ,Baches, Strength");
    int roll=scan.nextInt();
    String batches=scan.next();
    int strength=scan.nextInt();
    
    pstmt.setInt(1, roll);
    pstmt.setString(2,batches);
    pstmt.setInt(3, strength);
    
    int rs=pstmt.executeUpdate();
    System.out.println(rs+" rows Affected");
    
	
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
		pstmt.close();
		System.out.println("Successfully Closed Resource");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	

}
