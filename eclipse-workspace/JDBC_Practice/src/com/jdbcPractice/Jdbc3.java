package com.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc3 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/kaveri";
		String user="root";
		String Password="Ramlal@123";
		String sql="insert into kaveri values(?,?,?,?,?)";
		int nora=0;
		try
		{
		//Register The Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		//create The Connection
		con=DriverManager.getConnection(url, user, Password);
		//Create PreparedStatement
		pstmt=con.prepareStatement(sql);
		String userchoice="yes";
		while(userchoice.equalsIgnoreCase("yes"))
		{
		System.out.println("Enter Column Values...");
		System.out.println("......ID.....");
		int id=scan.nextInt();
		System.out.println("...Name....");
		String name=scan.next();
		System.out.println(".....Maths.....");
		int maths=scan.nextInt();
		System.out.println("......Physics......");
		int phy=scan.nextInt();
		System.out.println("......Chemistry.......");
		int chem=scan.nextInt();
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, maths);
		pstmt.setInt(4, phy);
		pstmt.setInt(5, chem);
		
		//Execute Query
		 nora=pstmt.executeUpdate();
		
		System.out.println("Do You Want Continue..Press 'Yes' or Dont'continue Press 'No'");
		nora++;
		userchoice=scan.next();
		
		
		}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			//Close
			try
			{
			pstmt.close();
			con.close();
			scan.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		if(nora>0)
		{
		System.out.println("No.Of Rows Affected: "+nora);
		}
		else
		{
		System.out.println(" No.of Rows Effected: "+nora);
		}
	
		
	}

}
