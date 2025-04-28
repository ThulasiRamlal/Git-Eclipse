package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Transaction_Jdbc {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		Scanner scan=new Scanner(System.in);
		
		try {
			//Register the Driver Manager Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Register Successfull");
			//Create Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest", "root", "Ramlal@123");
			System.out.println("Connection Sucessfull");
			
			//Create Prepared Statement
			String sql1="update kodBank set acc_balance=acc_balance-? where acc_no=?";
			String sql2="update kodBank set acc_balance=acc_balance+? where acc_no=?";
			pstmt1=con.prepareStatement(sql1);
			pstmt2=con.prepareStatement(sql2);
			System.out.println("Enter First Amount and from Account NO and To Account NO");
			
			int facc=scan.nextInt();
			int tacc=scan.nextInt();
			int amt=scan.nextInt();
			pstmt1.setInt(1, amt);
			pstmt1.setInt(2,facc);
			pstmt2.setInt(1, amt);
			pstmt2.setInt(2, tacc);
			con.setAutoCommit(false);
			//Execute Query
			int rows=pstmt1.executeUpdate();
			int rows2=pstmt2.executeUpdate();
			System.out.println(rows+" "+rows2+" rows affected");
			con.commit();
		} 
		catch (Exception e) {
			try
			{
				System.out.println("Some Error Occured IN transaction But Your Money Safe");
		     con.rollback();
		     
		
			}
			catch(Exception e1)
			{
				e.printStackTrace();
			}
			
		}
		finally
		{
			try
			{
			con.close();
			pstmt1.close();
			pstmt2.close();
			scan.close();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
}
