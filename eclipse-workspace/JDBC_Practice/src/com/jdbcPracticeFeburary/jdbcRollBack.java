package com.jdbcPracticeFeburary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jdbcRollBack {
	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="Ramlal@123";
	 Scanner scan=new Scanner(System.in); 
	 String sql1="update sbi set balance=balance-? where account_no=?";
	 String sql2="update sbi set balance=balance+? where account_no=?"; 
	 try
	 {
	 Class.forName(path);
	con= DriverManager.getConnection(url, user, password);
	pstmt1= con.prepareStatement(sql1);
	pstmt2=con.prepareStatement(sql2);
	System.out.println("Enter FACC..");
	int facc=scan.nextInt();
	System.out.println("Enter TACC..");
	int tacc=scan.nextInt();
	System.out.println("Enter Amount to be transfered.....");
	int amount=scan.nextInt();
	
	pstmt1.setInt(1, amount);
	pstmt1.setInt(2, facc);
	pstmt2.setInt(1, amount);
	pstmt2.setInt(2, tacc);
	
	con.setAutoCommit(false);
	int nora1=pstmt1.executeUpdate();
	int nora2=pstmt2.executeUpdate();
	
	
	System.out.println(nora1+"rowsAffected...."+nora2+" rowsAffected....");
	System.out.println("Succefully Transaction...");
	System.out.println("Succefully debited Amount: "+ amount+ "From Account_no: "+facc+" to Account_no: "+tacc);
	 con.commit();
	 
	 }
	 catch(Exception e)
	 {
		 try
		 {
		con.rollback();
		System.out.println("Your Money IS Safe....");
		 }
		 catch(Exception e1)
		 {
			 e1.printStackTrace();
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
