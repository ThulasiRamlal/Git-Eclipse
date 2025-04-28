package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentTest {
public static void main(String[] args) {
	
	Connection con=null;
	PreparedStatement pstmt=null;
	Scanner scan=new Scanner(System.in);
	
	
	try
	{
	//Registerd Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Create connection 
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest2", "root", "Ramlal@123");
	System.out.println("Connection is Succesfully");
	String sql="insert into student values(?,?,?,?,?)";
	System.out.println("Enter id,Name,Age,Marks,Gender");
	Student stu=new Student(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
	pstmt=con.prepareStatement(sql);
	pstmt.setInt(1, stu.id);
	pstmt.setString(2, stu.name);
	pstmt.setInt(3, stu.age);
	pstmt.setInt(4, stu.marks);
	pstmt.setString(5, stu.gender);
	
	
	int nora=pstmt.executeUpdate();
  System.out.println(nora+" rows Affected");
   System.out.println("Data inserted Successfully");
	
	
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
		scan.close();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
}
