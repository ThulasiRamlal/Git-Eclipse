package com.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc4 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/kaveri";
		String user="root";
		String password="Ramlal@123";
		String sql="update kaveri set name=?,maths=?,phy=?,chem=? where id=?";
		int nora=0;
		 
		try
		{
		//Register The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Succefully exceuted....");
		//Create Connection
		con=DriverManager.getConnection(url, user, password);
		//create Statement
		pstmt=con.prepareStatement(sql);
		String userchoice="yes";
		while(userchoice.equalsIgnoreCase("yes"))
		{
		System.out.println("Enter name for Update..");
		String name=scan.next();
		System.out.println("Enter maths marks..");
		int maths=scan.nextInt();
		System.out.println("Enter Phy marks....");
		int phy=scan.nextInt();
		System.out.println("Enter Chem marks...");
		int chem=scan.nextInt();
		System.out.println("Enter Id For Update..");
		int id=scan.nextInt();
		pstmt.setString(1, name);
		pstmt.setInt(2, maths);
		pstmt.setInt(3, phy);
		pstmt.setInt(4, chem);
		pstmt.setInt(5, id);
		
		//Execute Query
		 nora=pstmt.executeUpdate();
		
		
		System.out.println("Do you want Continue Press 'YES' (or)  Don't Continue Press' No'");
		userchoice=scan.next();
		 nora++;
		 
		 
		}
		int nora2=nora-1;
		System.out.println("No of ROWS affected: "+nora2);
		if(userchoice.equalsIgnoreCase("no"))
		{
			System.out.println("Succefully Exited.....");
		}
		else
		{
			System.out.println("Not Succefully Exited..");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
